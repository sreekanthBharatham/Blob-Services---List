package com.advana.blob.types;

import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * class contains properties of a storage account’s Blob service. 
**/
@JsonIgnoreProperties(ignoreUnknown = true)
public class BlobServiceProperties extends BaseAbstractMethod{
	
	/*
	 * Fully qualified resource ID for the
	 * resource.Ex-/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName
	 * }/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
	 */
	
	@JsonProperty("id")
	private String id;
	/*
	 * The name of the resource
	 */
	@JsonProperty("name")
	private String name;
	
	/*
	 * Deprecated in favor of isVersioningEnabled property.
	 */
	
	@JsonProperty("properties.automaticSnapshotPolicyEnabled")
	private boolean automaticSnapshotPolicyEnabled;
	
	/*
	 * Indicates whether change feed event logging is enabled for the Blob service.
	 */
	
	@JsonProperty("properties.changeFeed")
	private ChangeFeed changeFeed;
	
	
	/*The service properties for soft delete.*/
	@JsonProperty("properties.containerDeleteRetentionPolicy")
	private DeleteRetentionPolicy containerDeleteRetentionPolicy;
	
	
	@JsonProperty("properties.cors")
	private CorsRules cors;
	
	
	/*
	 * DefaultServiceVersion indicates the default version to use for requests to
	 * the Blob service if an incoming request’s version is not specified. Possible
	 * values include version 2008-10-27 and all more recent versions.
	 */
	
	@JsonProperty("properties.defaultServiceVersion")
	private String defaultServiceVersion;
	
	
	
	/*The service properties for soft delete.*/
	@JsonProperty("properties.deleteRetentionPolicy")
	private DeleteRetentionPolicy deleteRetentionPolicy;
	
	
	/* Versioning is enabled if set to true. */

	@JsonProperty("properties.isVersioningEnabled")
	private boolean isVersioningEnabled;
	
	
	/*
	 * The blob service property to configure last access time based tracking
	 * policy.
	 */
	
	@JsonProperty("properties.lastAccessTimeTrackingPolicy")
	private LastAccessTimeTrackingPolicy lastAccessTimeTrackingPolicy;
	
	/* The blob service properties for blob restore policy. */
	
	@JsonProperty("properties.restorePolicy")
	private RestorePolicyProperties restorePolicy;
	
	/*
	 * Sku name and tier.
	 */
	
	@JsonProperty("sku")
	private Sku sku;
	
	/*
	 * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or
	 * "Microsoft.Storage/storageAccounts"
	 */

	@JsonProperty("type")
	private String type;
	
	
	
	public String getId() { return id; }

	public void setId(String id) { this.id = id; }
	
	
	public String getName() { return name; }

	public void setName(String name) { this.name = name; }
	
	
	public boolean getAutomaticSnapshotPolicyEnabled() { return automaticSnapshotPolicyEnabled; }

	public void setAutomaticSnapshotPolicyEnabled(boolean automaticSnapshotPolicyEnabled) { this.automaticSnapshotPolicyEnabled = automaticSnapshotPolicyEnabled; }
	
	public ChangeFeed getChangeFeed() { return changeFeed; }

	public void setChangeFeed(ChangeFeed changeFeed) { this.changeFeed = changeFeed; }
	
	
	public DeleteRetentionPolicy getDeleteRetentionPolicy() { return containerDeleteRetentionPolicy; }

	public void setDeleteRetentionPolicy(DeleteRetentionPolicy containerDeleteRetentionPolicy) { this.containerDeleteRetentionPolicy = containerDeleteRetentionPolicy; }
	
	
	
	
	public CorsRules getCorsRules() { return cors; }

	public void setCorsRules(CorsRules cors) { this.cors = cors; }
	
	
	public String getDefaultServiceVersion() { return defaultServiceVersion; }

	public void setDefaultServiceVersion(String defaultServiceVersion) { this.defaultServiceVersion = defaultServiceVersion; }
	
	
	public DeleteRetentionPolicy getDeleteRetentionPolicys() { return deleteRetentionPolicy; }

	public void setDeleteRetentionPolicys(DeleteRetentionPolicy deleteRetentionPolicy) { this.deleteRetentionPolicy = deleteRetentionPolicy; }
	
	
	public boolean getIsVersioningEnabled() { return isVersioningEnabled; }

	public void setIsVersioningEnabled(boolean isVersioningEnabled) { this.isVersioningEnabled = isVersioningEnabled; }
	
	
	public LastAccessTimeTrackingPolicy getLastAccessTimeTrackingPolicy() { return lastAccessTimeTrackingPolicy; }

	public void setLastAccessTimeTrackingPolicy(LastAccessTimeTrackingPolicy lastAccessTimeTrackingPolicy) { this.lastAccessTimeTrackingPolicy = lastAccessTimeTrackingPolicy; }
	

	public RestorePolicyProperties getRestorePolicyProperties() { return restorePolicy; }

	public void setRestorePolicyProperties(RestorePolicyProperties restorePolicy) { this.restorePolicy = restorePolicy; }
	
	
	public Sku getSku() { return sku; }

	public void Sku(Sku sku) { this.sku = sku; }
	
	
	public String getType() { return type; }

	public void settypeype(String type) { this.type = type; }
	
	
}
