package com.advana.blob.types;

import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*The service properties for soft delete.*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteRetentionPolicy extends BaseAbstractMethod{
	
	/*
	 * his property when set to true allows deletion of the soft deleted blob
	 * versions and snapshots. This property cannot be used blob restore policy.
	 * This property only applies to blob service and does not apply to containers
	 * or file share.
	 */
	
	@JsonProperty("allowPermanentDelete")
	private boolean allowPermanentDelete;
	
	/*
	 * Indicates the number of days that the deleted item should be retained. The
	 * minimum specified value can be 1 and the maximum value can be 365.
	 */
	
	@JsonProperty("days")
	private int days;
	
	/* Indicates whether DeleteRetentionPolicy is enabled. */
	@JsonProperty("enabled")
	private boolean enabled;
	
	
	public boolean getAllowPermanentDelete() { return allowPermanentDelete; }

	public void setAllowPermanentDelete(boolean allowPermanentDelete) { this.allowPermanentDelete = allowPermanentDelete; }
	
	public int getDays() { return days; }

	public void setDays(int days) { this.days = days; }

	
	public boolean getEnabled() { return enabled; }

	public void setEnabled(boolean enabled) { this.enabled = enabled; }

}
