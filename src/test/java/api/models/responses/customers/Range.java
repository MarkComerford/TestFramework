
package api.models.responses.customers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minQuantity",
    "sysid",
    "value",
    "status"
})
public class Range {

    @JsonProperty("minQuantity")
    private Integer minQuantity;
    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("value")
    private Float value;
    @JsonProperty("status")
    private String status;

    @JsonProperty("minQuantity")
    public Integer getMinQuantity() {
        return minQuantity;
    }

    @JsonProperty("minQuantity")
    public void setMinQuantity(Integer minQuantity) {
        this.minQuantity = minQuantity;
    }

    @JsonProperty("sysid")
    public Integer getSysid() {
        return sysid;
    }

    @JsonProperty("sysid")
    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @JsonProperty("value")
    public Float getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Float value) {
        this.value = value;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

}
