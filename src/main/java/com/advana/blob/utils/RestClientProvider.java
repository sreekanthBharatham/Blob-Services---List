package com.advana.blob.utils;


import com.advana.blob.enums.ApiExceptionTypes;
import com.advana.blob.enums.CustomHeader;
import com.advana.blob.enums.Instance;
import com.advana.blob.enums.RequestMethod;

import java.net.http.HttpResponse;
import java.util.Map;

import com.advana.blob.coomon.types.LocaationUrl;
import com.advana.blob.exceptions.AzDException;
import com.advana.helpers.JsonMapper;



public final class RestClientProvider extends BaseRestClient{
	protected static final JsonMapper MAPPER = new JsonMapper();
    private static final String API_RELATIVE_PATH = "Microsoft.Storage";
    private static final String API_PREVIEW_INDICATOR = "?api-preview=";
    private static final String API_VERSION_INDICATOR = "?api-version=";
    
    
    private static String getLocationUrl(String resourceID, String subscriptionId) throws AzDException {

        String INSTANCE = Instance.BASE_INSTANCE.getInstance();
        
        if (resourceID.equals("accounts")) return Instance.ACCOUNT_INSTANCE.getInstance();
        
        if (resourceID == null) return (INSTANCE + subscriptionId);
        
        String url = new StringBuilder().append(INSTANCE)
        		 .append("/subscriptions/"+subscriptionId)
        		 .append(resourceID)
                 .append(API_PREVIEW_INDICATOR)
                 .append("2022-05-01")
                 .toString();
        System.out.println("url  :: "+url);
        
        try {
			
        	 var response =  response(RequestMethod.GET, url, null, null,
                     HttpResponse.BodyHandlers.ofString(), null, false)
                     .thenApplyAsync(HttpResponse::body)
                     .join();
        	 String r = MAPPER.mapJsonResponse(response, LocaationUrl.class).getLocationUrl();
        	 return r.replaceAll("/$", "");
        	 
		} catch (Exception e) {
			// TODO: handle exception
			 throw new AzDException(ApiExceptionTypes.InvalidSubscriptionIdException.name(), "Couldn't find the subscriptionID '" + subscriptionId + "'.");
		}
        		 
        

    }
    
    /*GET https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/
     * 												Microsoft.Storage/storageAccounts/{accountName}/blobServices?api-version=2022-05-01
    */
    
    
    public static String buildRequestUrl(
            String subscriptionId,
            String resourceId,
            String resourceGroupName,
            String area,
            String accountName,
            String resource,
            String apiVersion,
            Map<String, Object> queryString) throws AzDException {
    	
    	// build the request url to dynamically serve the API requests

        String pathSeparator = "/";
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((getLocationUrl(resourceId, subscriptionId)));
        
        if (resourceGroupName != null) {
            stringBuilder.append(pathSeparator).append(resourceGroupName);
        }
        
        
        if (area != null) {
            stringBuilder.append(pathSeparator).append(area);
        }
        
        stringBuilder.append(pathSeparator + API_RELATIVE_PATH);
        
        if (accountName != null) {
            stringBuilder.append(pathSeparator).append(accountName);
        }
        
        if (resource != null) {
            stringBuilder.append(pathSeparator).append(resource);
        }
        stringBuilder.append(API_VERSION_INDICATOR).append(apiVersion);
        if (queryString != null) {
            for (var key : queryString.keySet()) {
                stringBuilder.append(getQueryString(key, queryString.get(key)));
            }
        }

        return stringBuilder.toString();

    	
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Helps to create a query string from given key and value
     *
     * @param key   pass the key of the HashMap
     * @param value pass the value of the HasMap
     * @return query string
     */
    private static String getQueryString(String key, Object value) {
        return "&" + key + "=" + value;
    }


}
