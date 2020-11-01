
package api.models.responses.customers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "item_type",
    "SPS_VendorPartNumber",
    "SPS_BuyerPartNumber",
    "qbo_item_id"
})
public class CustomField__ {

    @JsonProperty("item_type")
    private String itemType;
    @JsonProperty("SPS_VendorPartNumber")
    private String sPSVendorPartNumber;
    @JsonProperty("SPS_BuyerPartNumber")
    private String sPSBuyerPartNumber;
    @JsonProperty("qbo_item_id")
    private String qboItemId;

    @JsonProperty("item_type")
    public String getItemType() {
        return itemType;
    }

    @JsonProperty("item_type")
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    @JsonProperty("SPS_VendorPartNumber")
    public String getSPSVendorPartNumber() {
        return sPSVendorPartNumber;
    }

    @JsonProperty("SPS_VendorPartNumber")
    public void setSPSVendorPartNumber(String sPSVendorPartNumber) {
        this.sPSVendorPartNumber = sPSVendorPartNumber;
    }

    @JsonProperty("SPS_BuyerPartNumber")
    public String getSPSBuyerPartNumber() {
        return sPSBuyerPartNumber;
    }

    @JsonProperty("SPS_BuyerPartNumber")
    public void setSPSBuyerPartNumber(String sPSBuyerPartNumber) {
        this.sPSBuyerPartNumber = sPSBuyerPartNumber;
    }

    @JsonProperty("qbo_item_id")
    public String getQboItemId() {
        return qboItemId;
    }

    @JsonProperty("qbo_item_id")
    public void setQboItemId(String qboItemId) {
        this.qboItemId = qboItemId;
    }

}
