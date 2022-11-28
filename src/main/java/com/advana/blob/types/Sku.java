package com.advana.blob.types;


import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Sku extends BaseAbstractMethod{

	@JsonProperty("name")
	private SkuName name;
	
	
	@JsonProperty("tier")
	private SkuTier tier;
	
	
	public SkuName getName() { return name; }

	public void setName(SkuName name) { this.name = name; }
	
	
	public SkuTier getTier() { return tier; }

	public void setTier(SkuTier tier) { this.tier = tier; }
	
	
}
