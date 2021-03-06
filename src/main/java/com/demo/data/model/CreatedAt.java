package com.demo.data.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "$date" })
public class CreatedAt {

	@JsonProperty("$date")
	private String $date;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("$date")
	public String get$date() {
		return $date;
	}

	@JsonProperty("$date")
	public void set$date(String $date) {
		this.$date = $date;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		return "CreatedAt [$date=" + $date + ", additionalProperties=" + additionalProperties + "]";
	}

}