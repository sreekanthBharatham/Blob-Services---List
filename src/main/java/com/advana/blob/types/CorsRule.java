package com.advana.blob.types;

import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CorsRule extends BaseAbstractMethod{
	/*
	 * Required if CorsRule element is present. A list of headers allowed to be part
	 * of the cross-origin request.
	 */
	
	@JsonProperty("allowedHeaders")
	private String[] allowedHeaders;
	
	/*
	 * Required if CorsRule element is present. A list of HTTP methods that are
	 * allowed to be executed by the origin.
	 */
	
	@JsonProperty("allowedMethods")
	private String[] allowedMethods;
	
	/*
	 * Required if CorsRule element is present. A list of origin domains that will
	 * be allowed via CORS, or "*" to allow all domains
	 */
	
	@JsonProperty("allowedOrigins")
	private String[] allowedOrigins;
	
	/*
	 * Required if CorsRule element is present. A list of response headers to expose
	 * to CORS clients.
	 */
	
	@JsonProperty("exposedHeaders")
	private String[] exposedHeaders;
	
	/*
	 * Required if CorsRule element is present. The number of seconds that the
	 * client/browser should cache a preflight response.
	 */
	@JsonProperty("maxAgeInSeconds")
	private int maxAgeInSeconds;
	
	
	public String[] getAllowedHeaders() { return allowedHeaders; }

	public void setAllowedHeaders(String[] allowedHeaders) { this.allowedHeaders = allowedHeaders; }
	
	public String[] getAllowedMethods() { return allowedMethods; }

	public void setAllowedMethods(String[] allowedMethods) { this.allowedMethods = allowedMethods; }
	
	
	public String[] getAllowedOrigins() { return allowedOrigins; }

	public void setAllowedOrigins(String[] allowedOrigins) { this.allowedOrigins = allowedOrigins; }
	
	
	public String[] getExposedHeaders() { return exposedHeaders; }

	public void setExposedHeaders(String[] exposedHeaders) { this.exposedHeaders = exposedHeaders; }
	
	public int getMaxAgeInSeconds() { return maxAgeInSeconds; }

	public void setMaxAgeInSeconds(int maxAgeInSeconds) { this.maxAgeInSeconds = maxAgeInSeconds; }

	
	

}
