
package api.models.responses.customers;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isNegative",
    "ranges",
    "sysid",
    "isCertainNegative",
    "certainValue",
    "isPercentage",
    "version",
    "status"
})
public class Rule {

    @JsonProperty("isNegative")
    private Boolean isNegative;
    @JsonProperty("ranges")
    private List<Range> ranges = null;
    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("isCertainNegative")
    private Boolean isCertainNegative;
    @JsonProperty("certainValue")
    private Float certainValue;
    @JsonProperty("isPercentage")
    private Boolean isPercentage;
    @JsonProperty("version")
    private Version version;
    @JsonProperty("status")
    private String status;

    @JsonProperty("isNegative")
    public Boolean getIsNegative() {
        return isNegative;
    }

    @JsonProperty("isNegative")
    public void setIsNegative(Boolean isNegative) {
        this.isNegative = isNegative;
    }

    @JsonProperty("ranges")
    public List<Range> getRanges() {
        return ranges;
    }

    @JsonProperty("ranges")
    public void setRanges(List<Range> ranges) {
        this.ranges = ranges;
    }

    @JsonProperty("sysid")
    public Integer getSysid() {
        return sysid;
    }

    @JsonProperty("sysid")
    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @JsonProperty("isCertainNegative")
    public Boolean getIsCertainNegative() {
        return isCertainNegative;
    }

    @JsonProperty("isCertainNegative")
    public void setIsCertainNegative(Boolean isCertainNegative) {
        this.isCertainNegative = isCertainNegative;
    }

    @JsonProperty("certainValue")
    public Float getCertainValue() {
        return certainValue;
    }

    @JsonProperty("certainValue")
    public void setCertainValue(Float certainValue) {
        this.certainValue = certainValue;
    }

    @JsonProperty("isPercentage")
    public Boolean getIsPercentage() {
        return isPercentage;
    }

    @JsonProperty("isPercentage")
    public void setIsPercentage(Boolean isPercentage) {
        this.isPercentage = isPercentage;
    }

    @JsonProperty("version")
    public Version getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Version version) {
        this.version = version;
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
