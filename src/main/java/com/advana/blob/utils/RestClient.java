package com.advana.blob.utils;

import com.advana.blob.exceptions.AzDException;
import com.advana.blob.connection.BlobConnection;
import com.advana.blob.enums.ApiExceptionTypes;
import com.advana.blob.enums.CustomHeader;
import com.advana.blob.enums.RequestMethod;

import java.io.InputStream;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static com.advana.blob.utils.RestClientProvider.buildRequestUrl;



/*GET https://management.azure.com/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/
 * 												Microsoft.Storage/storageAccounts/{accountName}/blobServices?api-version=2022-05-01
*/
public abstract class RestClient {

	public static String send(RequestMethod requestMethod, BlobConnection connection, String resourceId,
			String resourceGroupName, String area, String accountName, String resource, String apiVersion,
			Map queryString, Object requestBody, CustomHeader contentType) throws AzDException {

		String requestUrl = buildRequestUrl(connection.getSubscriptionId(), resourceId, resourceGroupName, area,
				accountName, resource, apiVersion, queryString);
		System.out.println("requestUrl  :: " + requestUrl + " requestBody:: " + requestBody);
		if (contentType == null)
			contentType = CustomHeader.JSON;

		String res = RestClientProvider
				.response(requestMethod, requestUrl, connection.getPersonalAccessToken(),
						HttpRequest.BodyPublishers.ofString(RestClientProvider.MAPPER.convertToString(requestBody)),
						// HttpRequest.BodyPublishers.ofString(requestBody.toString()),
						HttpResponse.BodyHandlers.ofString(), contentType, false)
				.thenApplyAsync(HttpResponse::body).join();
		System.out.println("res  :: " + res);
		return res;

	}

}
