
package api.models.responses.customers;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sysid",
    "name",
    "upc",
    "sku",
    "status",
    "isDropShip",
    "customFields",
    "product",
    "productOrigin",
    "quantity",
    "price",
    "promo",
    "discountPercent",
    "totalPrice",
    "totalPriceBeforeDiscount",
    "currency",
    "cartItemId",
    "isPublished",
    "imageUrls",
    "discountValue",
    "images"
})
public class Item {

    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("upc")
    private String upc;
    @JsonProperty("sku")
    private String sku;
    @JsonProperty("status")
    private String status;
    @JsonProperty("isDropShip")
    private Boolean isDropShip;
    @JsonProperty("customFields")
    private List<CustomField__> customFields = null;
    @JsonProperty("product")
    private Product product;
    @JsonProperty("productOrigin")
    private ProductOrigin productOrigin;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("price")
    private Float price;
    @JsonProperty("promo")
    private Float promo;
    @JsonProperty("discountPercent")
    private Float discountPercent;
    @JsonProperty("totalPrice")
    private Float totalPrice;
    @JsonProperty("totalPriceBeforeDiscount")
    private Float totalPriceBeforeDiscount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("cartItemId")
    private String cartItemId;
    @JsonProperty("isPublished")
    private Boolean isPublished;
    @JsonProperty("imageUrls")
    private List<String> imageUrls = null;
    @JsonProperty("discountValue")
    private Float discountValue;
    @JsonProperty("images")
    private List<Image_> images = null;

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

    @JsonProperty("isDropShip")
    public Boolean getIsDropShip() {
        return isDropShip;
    }

    @JsonProperty("isDropShip")
    public void setIsDropShip(Boolean isDropShip) {
        this.isDropShip = isDropShip;
    }

    @JsonProperty("customFields")
    public List<CustomField__> getCustomFields() {
        return customFields;
    }

    @JsonProperty("customFields")
    public void setCustomFields(List<CustomField__> customFields) {
        this.customFields = customFields;
    }

    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @JsonProperty("productOrigin")
    public ProductOrigin getProductOrigin() {
        return productOrigin;
    }

    @JsonProperty("productOrigin")
    public void setProductOrigin(ProductOrigin productOrigin) {
        this.productOrigin = productOrigin;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("price")
    public Float getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Float price) {
        this.price = price;
    }

    @JsonProperty("promo")
    public Float getPromo() {
        return promo;
    }

    @JsonProperty("promo")
    public void setPromo(Float promo) {
        this.promo = promo;
    }

    @JsonProperty("discountPercent")
    public Float getDiscountPercent() {
        return discountPercent;
    }

    @JsonProperty("discountPercent")
    public void setDiscountPercent(Float discountPercent) {
        this.discountPercent = discountPercent;
    }

    @JsonProperty("totalPrice")
    public Float getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("totalPrice")
    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("totalPriceBeforeDiscount")
    public Float getTotalPriceBeforeDiscount() {
        return totalPriceBeforeDiscount;
    }

    @JsonProperty("totalPriceBeforeDiscount")
    public void setTotalPriceBeforeDiscount(Float totalPriceBeforeDiscount) {
        this.totalPriceBeforeDiscount = totalPriceBeforeDiscount;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("cartItemId")
    public String getCartItemId() {
        return cartItemId;
    }

    @JsonProperty("cartItemId")
    public void setCartItemId(String cartItemId) {
        this.cartItemId = cartItemId;
    }

    @JsonProperty("isPublished")
    public Boolean getIsPublished() {
        return isPublished;
    }

    @JsonProperty("isPublished")
    public void setIsPublished(Boolean isPublished) {
        this.isPublished = isPublished;
    }

    @JsonProperty("imageUrls")
    public List<String> getImageUrls() {
        return imageUrls;
    }

    @JsonProperty("imageUrls")
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    @JsonProperty("discountValue")
    public Float getDiscountValue() {
        return discountValue;
    }

    @JsonProperty("discountValue")
    public void setDiscountValue(Float discountValue) {
        this.discountValue = discountValue;
    }

    @JsonProperty("images")
    public List<Image_> getImages() {
        return images;
    }

    @JsonProperty("images")
    public void setImages(List<Image_> images) {
        this.images = images;
    }

}
