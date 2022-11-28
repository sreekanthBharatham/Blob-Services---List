package com.advana.blob.types;

import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
The blob service properties for Last access time based tracking policy.*/
@JsonIgnoreProperties(ignoreUnknown = true)
public class LastAccessTimeTrackingPolicy extends BaseAbstractMethod{
	/*
	 * An array of predefined supported blob types. Only blockBlob is the supported
	 * value. This field is currently read only
	 */
	
	@JsonProperty("blobType")
	private String[] blobType;
	/*
	 * When set to true last access time based tracking is enabled
	 */
	
	@JsonProperty("enable")
	private boolean enable;
	
	/*
	 * Name of the policy. The valid value is AccessTimeTracking. This field is
	 * currently read only
	 */
	@JsonProperty("name")
	private Name name;
	
	/*
	 * The field specifies blob object tracking granularity in days, typically how
	 * often the blob object should be tracked.This field is currently read only
	 * with value as 1
	 */
	
	@JsonProperty("trackingGranularityInDays")
	private int trackingGranularityInDays;
	
	

	public String[] getBlobType() { return blobType; }

	public void setBlobType(String[] blobType) { this.blobType = blobType; }
	
	
	public boolean getEnable() { return enable; }

	public void setEnable(boolean enable) { this.enable = enable; }
	
	public Name getPush() { return name; }

	public void setPush(Name name) { this.name = name; }
	
	public int getTrackingGranularityInDays() { return trackingGranularityInDays; }

	public void setTrackingGranularityInDays(int trackingGranularityInDays) { this.trackingGranularityInDays = trackingGranularityInDays; }
	
	
	

}
