
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
    "isVirtual",
    "status",
    "season",
    "hasVariants",
    "taxCode",
    "requiresSerialNumbers",
    "isManualLotNumber",
    "description",
    "isBillOfMaterial",
    "requiresLotNumbers"
})
public class Product {

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
    @JsonProperty("isVirtual")
    private Boolean isVirtual;
    @JsonProperty("status")
    private String status;
    @JsonProperty("season")
    private String season;
    @JsonProperty("hasVariants")
    private Boolean hasVariants;
    @JsonProperty("taxCode")
    private String taxCode;
    @JsonProperty("requiresSerialNumbers")
    private Boolean requiresSerialNumbers;
    @JsonProperty("isManualLotNumber")
    private Boolean isManualLotNumber;
    @JsonProperty("description")
    private String description;
    @JsonProperty("isBillOfMaterial")
    private Boolean isBillOfMaterial;
    @JsonProperty("requiresLotNumbers")
    private Boolean requiresLotNumbers;

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

    @JsonProperty("isVirtual")
    public Boolean getIsVirtual() {
        return isVirtual;
    }

    @JsonProperty("isVirtual")
    public void setIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("season")
    public String getSeason() {
        return season;
    }

    @JsonProperty("season")
    public void setSeason(String season) {
        this.season = season;
    }

    @JsonProperty("hasVariants")
    public Boolean getHasVariants() {
        return hasVariants;
    }

    @JsonProperty("hasVariants")
    public void setHasVariants(Boolean hasVariants) {
        this.hasVariants = hasVariants;
    }

    @JsonProperty("taxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("taxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("requiresSerialNumbers")
    public Boolean getRequiresSerialNumbers() {
        return requiresSerialNumbers;
    }

    @JsonProperty("requiresSerialNumbers")
    public void setRequiresSerialNumbers(Boolean requiresSerialNumbers) {
        this.requiresSerialNumbers = requiresSerialNumbers;
    }

    @JsonProperty("isManualLotNumber")
    public Boolean getIsManualLotNumber() {
        return isManualLotNumber;
    }

    @JsonProperty("isManualLotNumber")
    public void setIsManualLotNumber(Boolean isManualLotNumber) {
        this.isManualLotNumber = isManualLotNumber;
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

    @JsonProperty("requiresLotNumbers")
    public Boolean getRequiresLotNumbers() {
        return requiresLotNumbers;
    }

    @JsonProperty("requiresLotNumbers")
    public void setRequiresLotNumbers(Boolean requiresLotNumbers) {
        this.requiresLotNumbers = requiresLotNumbers;
    }

}
