package com.advana.blob.types;
import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
Name of the policy. The valid value is AccessTimeTracking. This field is currently read only*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class Name extends BaseAbstractMethod{
	
	@JsonProperty("AccessTimeTracking")
	private String AccessTimeTracking;
	
	
	public String getAccessTimeTracking() { return AccessTimeTracking; }

	public void setAccessTimeTracking(String AccessTimeTracking) { this.AccessTimeTracking = AccessTimeTracking; }

}
