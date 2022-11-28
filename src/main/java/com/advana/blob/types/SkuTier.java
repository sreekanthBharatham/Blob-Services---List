package com.advana.blob.types;

import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SkuTier  extends BaseAbstractMethod{
	
	@JsonProperty("Premium")
	private String Premium;
	
	@JsonProperty("Standard")
	private String Standard;
	
	
	
	public String getPremium() { return Premium; }

	public void setPremium(String Premium) { this.Premium = Premium; }
	
	
	public String getStandard() { return Standard; }

	public void setStandard(String Standard) { this.Standard = Standard; }
	

}
