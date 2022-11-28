package com.advana.blob.types;

import java.util.List;


import com.advana.blob.coomon.types.BaseAbstractMethod;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/*
List of blob services returned.*/

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlobServiceItems extends BaseAbstractMethod{
	
	@JsonProperty("value")
	private List<BlobServiceProperties> value;

}
