package com.advana.blob.connection;

import com.advana.blob.exceptions.AzDException;
import com.advana.oauth.OAuthApi;
import com.advana.oauth.types.AuthorizedToken;


public class BlobConnection {
		private String subscriptionId;
	    private String resourceGroupName;
	    private String accountName;
	    private String personalAccessToken;
	    private String appSecret;
	    private String appCallBackURL;
	    private AuthorizedToken oauthToken = null;
	    private TokenRefreshedHandler tokenRefreshedHandler = defaultTokenRefreshedHandler;
	    
	    private static TokenRefreshedHandler defaultTokenRefreshedHandler = new TokenRefreshedHandler() {

	        @Override
	        public void tokenRefreshed(AuthorizedToken newToken) {
	            // nothing is done
	        }
	    };
	    
	    
	    public BlobConnection() {
			
		}
	    
	    

		public BlobConnection(String subscriptionId, String resourceGroupName, String accountName,
			String personalAccessToken, String appSecret, String appCallBackURL, AuthorizedToken oauthToken,
			TokenRefreshedHandler tokenRefreshedHandler) {
		
		this.subscriptionId = subscriptionId;
		this.resourceGroupName = resourceGroupName;
		this.accountName = accountName;
		this.personalAccessToken = personalAccessToken;
		this.appSecret = appSecret;
		this.appCallBackURL = appCallBackURL;
		this.oauthToken = oauthToken;
		this.tokenRefreshedHandler = tokenRefreshedHandler != null ? tokenRefreshedHandler : defaultTokenRefreshedHandler;
	}



		public String getSubscriptionId() {
			return subscriptionId;
		}



		public void setSubscriptionId(String subscriptionId) {
			this.subscriptionId = subscriptionId;
		}



		public String getResourceGroupName() {
			return resourceGroupName;
		}



		public void setResourceGroupName(String resourceGroupName) {
			this.resourceGroupName = resourceGroupName;
		}



		public String getAccountName() {
			return accountName;
		}



		public void setAccountName(String accountName) {
			this.accountName = accountName;
		}




	    /***
	     * Get the personal access token
	     * @return the personal access token
	     * @throws AzDException Default Api Exception handler.
	     */
	    public String getPersonalAccessToken() throws AzDException {
	        if (oauthToken != null) {
	            if (OAuthApi.hasTokenExpired(oauthToken)) {
	                setOauthToken(OAuthApi.getRefreshToken(appSecret, oauthToken.getRefreshToken(), appCallBackURL));
	            }
	            return oauthToken.getAccessToken();
	        }
	        return this.personalAccessToken;
	    }

	    /**
	     * Set the personal access token
	     *
	     * @param personalAccessToken pass the personal access token
	     */
	    public void setPersonalAccessToken(String personalAccessToken) {
	        this.oauthToken = null;
	        this.personalAccessToken = personalAccessToken;
	    }

	    /**
	     * Set the oauth access token
	     *
	     * @param oauthToken pass the oauth access token
	     */
	    public void setOauthToken(AuthorizedToken oauthToken) {
	        this.oauthToken = oauthToken;
	        tokenRefreshedHandler.tokenRefreshed(oauthToken);
	    }

	    public interface TokenRefreshedHandler {
	        void tokenRefreshed(AuthorizedToken newToken);
	    }

	    
	    
	    
	    
	    

}
