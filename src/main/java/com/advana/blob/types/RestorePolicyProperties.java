package com.advana.blob.types;
import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
The blob service properties for blob restore policy*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class RestorePolicyProperties extends BaseAbstractMethod{
	/*
	 * how long this blob can be restored. It should be great than zero and less
	 * than DeleteRetentionPolicy.days.
	 */
	@JsonProperty("days")
	private int days;
	/*
	 * Blob restore is enabled if set to true.
	 */
	@JsonProperty("enabled")
	private boolean enabled;
	/*
	 * Deprecated in favor of minRestoreTime property.
	 */
	@JsonProperty("lastEnabledTime")
	private String lastEnabledTime;
	
	/*
	 * Returns the minimum date and time that the restore can be started.
	 */
	
	@JsonProperty("minRestoreTime")
	private String minRestoreTime;
	
	
	public int getDays() { return days; }

	public void setDays(int days) { this.days = days; }
	
	
	
	public boolean getEnabled() { return enabled; }

	public void setEnabled(boolean enabled) { this.enabled = enabled; }
	
	
	public String getLastEnabledTime() { return lastEnabledTime; }

	public void setLastEnabledTime(String lastEnabledTime) { this.lastEnabledTime = lastEnabledTime; }


}
