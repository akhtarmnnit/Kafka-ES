package com.demo.data.model;

import com.fasterxml.jackson.annotation.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "product_id", "sellerId", "title", "pageTitle", "description", "manufacturer", "price",
		"isLowQuantity", "isSoldOut", "isBackorder", "metafields", "requiresShipping", "isVisible", "publishedAt",
		"createdAt", "updatedAt", "workflow" })
@Document(indexName = "sample", type = "Product")
public class Product {

	@Id
	private String id;
	@JsonProperty("product_id")
	private String productId;
	@JsonProperty("sellerId")
	private String sellerId;
	@JsonProperty("title")
	private String title;
	@JsonProperty("pageTitle")
	private String pageTitle;
	@JsonProperty("description")
	private String description;
	@JsonProperty("manufacturer")
	private String manufacturer;
	@JsonProperty("price")
	private Price price;
	@JsonProperty("isLowQuantity")
	private Boolean isLowQuantity;
	@JsonProperty("isSoldOut")
	private Boolean isSoldOut;
	@JsonProperty("isBackorder")
	private Boolean isBackorder;
	@JsonProperty("metafields")
	private List<Metafield> metafields = null;
	@JsonProperty("requiresShipping")
	private Boolean requiresShipping;
	@JsonProperty("isVisible")
	private Boolean isVisible;
	@JsonProperty("publishedAt")
	private PublishedAt publishedAt;
	@JsonProperty("createdAt")
	private CreatedAt createdAt;
	@JsonProperty("updatedAt")
	private UpdatedAt updatedAt;
	@JsonProperty("workflow")
	private Workflow workflow;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("product_id")
	public String getProductId() {
		return productId;
	}

	@JsonProperty("product_id")
	public void setProductId(String productId) {
		this.productId = productId;
	}

	@JsonProperty("sellerId")
	public String getSellerId() {
		return sellerId;
	}

	@JsonProperty("sellerId")
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("pageTitle")
	public String getPageTitle() {
		return pageTitle;
	}

	@JsonProperty("pageTitle")
	public void setPageTitle(String pageTitle) {
		this.pageTitle = pageTitle;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	@JsonProperty("manufacturer")
	public String getManufacturer() {
		return manufacturer;
	}

	@JsonProperty("manufacturer")
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@JsonProperty("price")
	public Price getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(Price price) {
		this.price = price;
	}

	@JsonProperty("isLowQuantity")
	public Boolean getIsLowQuantity() {
		return isLowQuantity;
	}

	@JsonProperty("isLowQuantity")
	public void setIsLowQuantity(Boolean isLowQuantity) {
		this.isLowQuantity = isLowQuantity;
	}

	@JsonProperty("isSoldOut")
	public Boolean getIsSoldOut() {
		return isSoldOut;
	}

	@JsonProperty("isSoldOut")
	public void setIsSoldOut(Boolean isSoldOut) {
		this.isSoldOut = isSoldOut;
	}

	@JsonProperty("isBackorder")
	public Boolean getIsBackorder() {
		return isBackorder;
	}

	@JsonProperty("isBackorder")
	public void setIsBackorder(Boolean isBackorder) {
		this.isBackorder = isBackorder;
	}

	@JsonProperty("metafields")
	public List<Metafield> getMetafields() {
		return metafields;
	}

	@JsonProperty("metafields")
	public void setMetafields(List<Metafield> metafields) {
		this.metafields = metafields;
	}

	@JsonProperty("requiresShipping")
	public Boolean getRequiresShipping() {
		return requiresShipping;
	}

	@JsonProperty("requiresShipping")
	public void setRequiresShipping(Boolean requiresShipping) {
		this.requiresShipping = requiresShipping;
	}

	@JsonProperty("isVisible")
	public Boolean getIsVisible() {
		return isVisible;
	}

	@JsonProperty("isVisible")
	public void setIsVisible(Boolean isVisible) {
		this.isVisible = isVisible;
	}

	@JsonProperty("publishedAt")
	public PublishedAt getPublishedAt() {
		return publishedAt;
	}

	@JsonProperty("publishedAt")
	public void setPublishedAt(PublishedAt publishedAt) {
		this.publishedAt = publishedAt;
	}

	@JsonProperty("createdAt")
	public CreatedAt getCreatedAt() {
		return createdAt;
	}

	@JsonProperty("createdAt")
	public void setCreatedAt(CreatedAt createdAt) {
		this.createdAt = createdAt;
	}

	@JsonProperty("updatedAt")
	public UpdatedAt getUpdatedAt() {
		return updatedAt;
	}

	@JsonProperty("updatedAt")
	public void setUpdatedAt(UpdatedAt updatedAt) {
		this.updatedAt = updatedAt;
	}

	@JsonProperty("workflow")
	public Workflow getWorkflow() {
		return workflow;
	}

	@JsonProperty("workflow")
	public void setWorkflow(Workflow workflow) {
		this.workflow = workflow;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	/*@Override
	public String toString() {
		return "Product [productId=" + productId + ", sellerId=" + sellerId + ", title=" + title + ", pageTitle="
				+ pageTitle + ", description=" + description + ", manufacturer=" + manufacturer + ", price=" + price
				+ ", isLowQuantity=" + isLowQuantity + ", isSoldOut=" + isSoldOut + ", isBackorder=" + isBackorder
				+ ", metafields=" + metafields + ", requiresShipping=" + requiresShipping + ", isVisible=" + isVisible
				+ ", publishedAt=" + publishedAt + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", workflow=" + workflow + ", additionalProperties=" + additionalProperties + "]";
	}*/

}
