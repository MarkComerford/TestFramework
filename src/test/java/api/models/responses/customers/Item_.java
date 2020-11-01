
package api.models.responses.customers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sysid",
    "name",
    "price",
    "quantity",
    "upc",
    "sku",
    "status",
    "weightMeasure",
    "unitWeight",
    "cost",
    "isDropShip",
    "customFields",
    "costMSRP",
    "rules",
    "availableQty",
    "imageUrls"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item_ {

    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("price")
    private Float price;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("status")
    private String status;
    @JsonProperty("weightMeasure")
    private String weightMeasure;
    @JsonProperty("unitWeight")
    private Float unitWeight;
    @JsonProperty("cost")
    private Float cost;
    @JsonProperty("isDropShip")
    private Boolean isDropShip;
    @JsonProperty("customFields")
    private List<CustomField___> customFields = null;
    @JsonProperty("costMSRP")
    private Float costMSRP;
    @JsonProperty("rules")
    private List<Rule> rules = null;
    @JsonProperty("availableQty")
    private Integer availableQty;
    @JsonProperty("imageUrls")
    private List<String> imageUrls = null;

    @JsonProperty("sysid")
    public Integer getSysid() {
        return sysid;
    }

    @JsonProperty("sysid")
    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("price")
    public Float getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Float price) {
        this.price = price;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("upc")
    public String getUpc() {
        return upc;
    }

    @JsonProperty("upc")
    public void setUpc(String upc) {
        this.upc = upc;
    }

    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("weightMeasure")
    public String getWeightMeasure() {
        return weightMeasure;
    }

    @JsonProperty("weightMeasure")
    public void setWeightMeasure(String weightMeasure) {
        this.weightMeasure = weightMeasure;
    }

    @JsonProperty("unitWeight")
    public Float getUnitWeight() {
        return unitWeight;
    }

    @JsonProperty("unitWeight")
    public void setUnitWeight(Float unitWeight) {
        this.unitWeight = unitWeight;
    }

    @JsonProperty("cost")
    public Float getCost() {
        return cost;
    }

    @JsonProperty("cost")
    public void setCost(Float cost) {
        this.cost = cost;
    }

    @JsonProperty("isDropShip")
    public Boolean getIsDropShip() {
        return isDropShip;
    }

    @JsonProperty("isDropShip")
    public void setIsDropShip(Boolean isDropShip) {
        this.isDropShip = isDropShip;
    }

    @JsonProperty("customFields")
    public List<CustomField___> getCustomFields() {
        return customFields;
    }

    @JsonProperty("customFields")
    public void setCustomFields(List<CustomField___> customFields) {
        this.customFields = customFields;
    }

    @JsonProperty("costMSRP")
    public Float getCostMSRP() {
        return costMSRP;
    }

    @JsonProperty("costMSRP")
    public void setCostMSRP(Float costMSRP) {
        this.costMSRP = costMSRP;
    }

    @JsonProperty("rules")
    public List<Rule> getRules() {
        return rules;
    }

    @JsonProperty("rules")
    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    @JsonProperty("availableQty")
    public Integer getAvailableQty() {
        return availableQty;
    }

    @JsonProperty("availableQty")
    public void setAvailableQty(Integer availableQty) {
        this.availableQty = availableQty;
    }

    @JsonProperty("imageUrls")
    public List<String> getImageUrls() {
        return imageUrls;
    }

    @JsonProperty("imageUrls")
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

}
