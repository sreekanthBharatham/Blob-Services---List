package com.advana.blob.types;
import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*The SKU name. Required for account creation; optional for update. Note that in older versions, SKU name was called accountType.*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class SkuName extends BaseAbstractMethod{
	
	@JsonProperty("Premium_LRS")
	private String Premium_LRS;
	
	@JsonProperty("Premium_ZRS")
	private String Premium_ZRS;
	
	
	@JsonProperty("Standard_GRS")
	private String Standard_GRS;
	
	
	@JsonProperty("Standard_GZRS")
	private String Standard_GZRS;
	
	
	@JsonProperty("Standard_LRS")
	private String Standard_LRS;
	
	
	@JsonProperty("Standard_RAGRS")
	private String Standard_RAGRS;
	
	
	@JsonProperty("Standard_RAGZRS")
	private String Standard_RAGZRS;
	
	
	@JsonProperty("Standard_ZRS")
	private String Standard_ZRS;
	
	
	
	public String getPremium_LRS() { return Premium_LRS; }

	public void setPremium_LRS(String Premium_LRS) { this.Premium_LRS = Premium_LRS; }
	
	
	public String getPremium_ZRS() { return Premium_ZRS; }

	public void setPremium_ZRS(String Premium_ZRS) { this.Premium_ZRS = Premium_ZRS; }
	
	
	public String getStandard_GRS() { return Standard_GRS; }

	public void setStandard_GRS(String Standard_GRS) { this.Standard_GRS = Standard_GRS; }
	
	
	public String getStandard_GZRS() { return Standard_GZRS; }

	public void setStandard_GZRS(String Standard_GZRS) { this.Standard_GZRS = Standard_GZRS; }
	
	
	public String getStandard_LRS() { return Standard_LRS; }

	public void setStandard_LRS(String Standard_LRS) { this.Standard_LRS = Standard_LRS; }
	
	
	public String getStandard_RAGRS() { return Standard_RAGRS; }

	public void setStandard_RAGRS(String Standard_RAGRS) { this.Standard_RAGRS = Standard_RAGRS; }
	
	
	public String getStandard_RAGZRS() { return Standard_RAGZRS; }

	public void setStandard_RAGZRS(String Standard_RAGZRS) { this.Standard_RAGZRS = Standard_RAGZRS; }
	
	
	public String getStandard_ZRS() { return Standard_ZRS; }

	public void setStandard_ZRS(String Standard_ZRS) { this.Standard_ZRS = Standard_ZRS; }
	
	
	
	
	
	
	
	
	
	
	

}
