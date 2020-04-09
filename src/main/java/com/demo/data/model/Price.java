package com.demo.data.model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "range", "min", "max" })
public class Price {

	@JsonProperty("range")
	private String range;
	@JsonProperty("min")
	private Integer min;
	@JsonProperty("max")
	private Integer max;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("range")
	public String getRange() {
		return range;
	}

	@JsonProperty("range")
	public void setRange(String range) {
		this.range = range;
	}

	@JsonProperty("min")
	public Integer getMin() {
		return min;
	}

	@JsonProperty("min")
	public void setMin(Integer min) {
		this.min = min;
	}

	@JsonProperty("max")
	public Integer getMax() {
		return max;
	}

	@JsonProperty("max")
	public void setMax(Integer max) {
		this.max = max;
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
		return "Price [range=" + range + ", min=" + min + ", max=" + max + ", additionalProperties="
				+ additionalProperties + "]";
	}

}