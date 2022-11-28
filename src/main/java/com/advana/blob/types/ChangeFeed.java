package com.advana.blob.types;

import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
The blob service properties for change feed events.*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class ChangeFeed extends BaseAbstractMethod{
	/*
	 * Indicates whether change feed event logging is enabled for the Blob service.
	 */
	
	@JsonProperty("enabled")
	private boolean enabled;
	
	/*
	 * ndicates the duration of changeFeed retention in days. Minimum value is 1 day
	 * and maximum value is 146000
	 * 
	 * days (400 years). A null value indicates an infinite retention of the change
	 * feed.
	 */
	
	@JsonProperty("retentionInDays")
	private int retentionInDays;
	
	
	
	public boolean getEnabled() { return enabled; }

	public void setEnabled(boolean enabled) { this.enabled = enabled; }
	
	public int getRetentionInDays() { return retentionInDays; }

	public void setRetentionInDays(int retentionInDays) { this.retentionInDays = retentionInDays; }

}
