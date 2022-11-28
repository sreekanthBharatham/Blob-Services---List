package com.advana.blob;


import com.advana.blob.utils.AzDAsyncApi;
import com.advana.blob.connection.BlobConnection;
import com.advana.blob.types.BlobServiceItems;
import com.advana.blob.exceptions.AzDException;
import com.advana.helpers.JsonMapper;
import com.advana.blob.coomon.ApiVersion;
import com.advana.blob.enums.RequestMethod;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import static com.advana.blob.utils.RestClient.send;


import java.io.InputStream;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.text.MessageFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;



/*GET https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers
 * 													/Microsoft.Storage/storageAccounts/{accountName}/blobServices?api-version=2022-05-01
*/


/*https://management.azure.com/subscriptions/9051542b-d42a-467b-a53b-207052cb174e/resourceGroups/asdfg/providers
 * 															/Microsoft.Storage/storageAccounts/blobs999/blobServices?api-version=2022-05-01
*/


public class BlobServicesApi extends AzDAsyncApi<BlobServicesApi>{
	
	
	 private final BlobConnection BLOBCONNECTION;
	 private final JsonMapper MAPPER = new JsonMapper();
	 private final String AREA = "providers";
	 private final String subscriptionId = "9051542b-d42a-467b-a53b-207052cb174e";
	 private final String accontName = "blobs999";
	 private final String resourceGroupName = "asdfg"; 
	 private final String apiversion = "2022-05-01";
	 
	 
	 
	 public BlobServicesApi (BlobConnection blobConnection) {
		 BLOBCONNECTION = blobConnection;
	 }
	 
	

/*GET https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/
 * 												Microsoft.Storage/storageAccounts/{accountName}/blobServices?api-version=2022-05-01
*/

	
	 
public BlobServiceItems getBlobList(String accontName, String resourceGroupName, String subscriptionId,
		String apiversion) throws AzDException {
	String r = send(RequestMethod.GET, BLOBCONNECTION, subscriptionId, "/resourceGroups/" + resourceGroupName, AREA,
			"/storageAccounts/" + accontName, "blobServices", ApiVersion.STORAGE_RESOURCE_PROVIDER, null, null, null);
	return MAPPER.mapJsonResponse(r, BlobServiceItems.class);

}
	 
	 

}
