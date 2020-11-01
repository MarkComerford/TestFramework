
package api.models.responses.customers;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sysid",
    "name",
    "type",
    "styleId",
    "tags",
    "status",
    "hasVariants",
    "season",
    "taxCode",
    "isManualLotNumber",
    "requiresSerialNumbers",
    "requiresLotNumbers",
    "isVirtual",
    "description",
    "isBillOfMaterial",
    "lowInventoryQuantity",
    "descriptionHtml",
    "items",
    "categories",
    "variants",
    "stores",
    "images",
    "imageUrls",
    "isPublished",
    "isAvailableInStore",
    "ratingSummary",
    "numberOfItems",
    "numberOfVariants"
})
public class ProductOrigin {

    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("styleId")
    private String styleId;
    @JsonProperty("tags")
    private List<Object> tags = null;
    @JsonProperty("status")
    private String status;
    @JsonProperty("hasVariants")
    private Boolean hasVariants;
    @JsonProperty("season")
    private String season;
    @JsonProperty("taxCode")
    private String taxCode;
    @JsonProperty("isManualLotNumber")
    private Boolean isManualLotNumber;
    @JsonProperty("requiresSerialNumbers")
    private Boolean requiresSerialNumbers;
    @JsonProperty("requiresLotNumbers")
    private Boolean requiresLotNumbers;
    @JsonProperty("isVirtual")
    private Boolean isVirtual;
    @JsonProperty("description")
    private String description;
    @JsonProperty("isBillOfMaterial")
    private Boolean isBillOfMaterial;
    @JsonProperty("lowInventoryQuantity")
    private Integer lowInventoryQuantity;
    @JsonProperty("descriptionHtml")
    private String descriptionHtml;
    @JsonProperty("items")
    private List<Item_> items = null;
    @JsonProperty("categories")
    private List<Category> categories = null;
    @JsonProperty("variants")
    private List<Object> variants = null;
    @JsonProperty("stores")
    private List<Store_> stores = null;
    @JsonProperty("images")
    private List<Image> images = null;
    @JsonProperty("imageUrls")
    private List<String> imageUrls = null;
    @JsonProperty("isPublished")
    private Boolean isPublished;
    @JsonProperty("isAvailableInStore")
    private Boolean isAvailableInStore;
    @JsonProperty("ratingSummary")
    private List<Object> ratingSummary = null;
    @JsonProperty("numberOfItems")
    private Integer numberOfItems;
    @JsonProperty("numberOfVariants")
    private Integer numberOfVariants;

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

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("styleId")
    public String getStyleId() {
        return styleId;
    }

    @JsonProperty("styleId")
    public void setStyleId(String styleId) {
        this.styleId = styleId;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("hasVariants")
    public Boolean getHasVariants() {
        return hasVariants;
    }

    @JsonProperty("hasVariants")
    public void setHasVariants(Boolean hasVariants) {
        this.hasVariants = hasVariants;
    }

    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(String season) {
        this.season = season;
    }

    @JsonProperty("taxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("taxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("isManualLotNumber")
    public Boolean getIsManualLotNumber() {
        return isManualLotNumber;
    }

    @JsonProperty("isManualLotNumber")
    public void setIsManualLotNumber(Boolean isManualLotNumber) {
        this.isManualLotNumber = isManualLotNumber;
    }

    @JsonProperty("requiresSerialNumbers")
    public Boolean getRequiresSerialNumbers() {
        return requiresSerialNumbers;
    }

    @JsonProperty("requiresSerialNumbers")
    public void setRequiresSerialNumbers(Boolean requiresSerialNumbers) {
        this.requiresSerialNumbers = requiresSerialNumbers;
    }

    @JsonProperty("requiresLotNumbers")
    public Boolean getRequiresLotNumbers() {
        return requiresLotNumbers;
    }

    @JsonProperty("requiresLotNumbers")
    public void setRequiresLotNumbers(Boolean requiresLotNumbers) {
        this.requiresLotNumbers = requiresLotNumbers;
    }

    @JsonProperty("isVirtual")
    public Boolean getIsVirtual() {
        return isVirtual;
    }

    @JsonProperty("isVirtual")
    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("isBillOfMaterial")
    public Boolean getIsBillOfMaterial() {
        return isBillOfMaterial;
    }

    @JsonProperty("isBillOfMaterial")
    public void setIsBillOfMaterial(Boolean isBillOfMaterial) {
        this.isBillOfMaterial = isBillOfMaterial;
    }

    @JsonProperty("lowInventoryQuantity")
    public Integer getLowInventoryQuantity() {
        return lowInventoryQuantity;
    }

    @JsonProperty("lowInventoryQuantity")
    public void setLowInventoryQuantity(Integer lowInventoryQuantity) {
        this.lowInventoryQuantity = lowInventoryQuantity;
    }

    @JsonProperty("descriptionHtml")
    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    @JsonProperty("descriptionHtml")
    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    @JsonProperty("items")
    public List<Item_> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item_> items) {
        this.items = items;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @JsonProperty("variants")
    public List<Object> getVariants() {
        return variants;
    }

    @JsonProperty("variants")
    public void setVariants(List<Object> variants) {
        this.variants = variants;
    }

    @JsonProperty("stores")
    public List<Store_> getStores() {
        return stores;
    }

    @JsonProperty("stores")
    public void setStores(List<Store_> stores) {
        this.stores = stores;
    }

    @JsonProperty("images")
    public List<Image> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image> images) {
        this.images = images;
    }

    @JsonProperty("imageUrls")
    public List<String> getImageUrls() {
        return imageUrls;
    }

    @JsonProperty("imageUrls")
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    @JsonProperty("isPublished")
    public Boolean getIsPublished() {
        return isPublished;
    }

    @JsonProperty("isPublished")
    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    @JsonProperty("isAvailableInStore")
    public Boolean getIsAvailableInStore() {
        return isAvailableInStore;
    }

    @JsonProperty("isAvailableInStore")
    public void setIsAvailableInStore(Boolean isAvailableInStore) {
        this.isAvailableInStore = isAvailableInStore;
    }

    @JsonProperty("ratingSummary")
    public List<Object> getRatingSummary() {
        return ratingSummary;
    }

    @JsonProperty("ratingSummary")
    public void setRatingSummary(List<Object> ratingSummary) {
        this.ratingSummary = ratingSummary;
    }

    @JsonProperty("numberOfItems")
    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    @JsonProperty("numberOfItems")
    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @JsonProperty("numberOfVariants")
    public Integer getNumberOfVariants() {
        return numberOfVariants;
    }

    @JsonProperty("numberOfVariants")
    public void setNumberOfVariants(Integer numberOfVariants) {
        this.numberOfVariants = numberOfVariants;
    }

}
