package com.advana.blob.types;

import java.util.List;


import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*Sets the CORS rules. You can include up to five CorsRule elements in the request.*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class CorsRules extends BaseAbstractMethod{
	
	@JsonProperty("corsRules")
	private List<CorsRule> corsRules;
	
	
	public List<CorsRule> getCorsRules() { return corsRules; }

	public void setCorsRules(List<CorsRule> corsRules) { this.corsRules = corsRules; }

}
