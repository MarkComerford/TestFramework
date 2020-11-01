
package api.models.responses.customers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isDefault",
    "minorVersion",
    "sysid",
    "version",
    "patchVersion",
    "status"
})
public class Version {

    @JsonProperty("isDefault")
    private Boolean isDefault;
    @JsonProperty("minorVersion")
    private Integer minorVersion;
    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("version")
    private Integer version;
    @JsonProperty("patchVersion")
    private Integer patchVersion;
    @JsonProperty("status")
    private String status;

    @JsonProperty("isDefault")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("isDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("minorVersion")
    public Integer getMinorVersion() {
        return minorVersion;
    }

    @JsonProperty("minorVersion")
    public void setMinorVersion(Integer minorVersion) {
        this.minorVersion = minorVersion;
    }

    @JsonProperty("sysid")
    public Integer getSysid() {
        return sysid;
    }

    @JsonProperty("sysid")
    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @JsonProperty("version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("patchVersion")
    public Integer getPatchVersion() {
        return patchVersion;
    }

    @JsonProperty("patchVersion")
    public void setPatchVersion(Integer patchVersion) {
        this.patchVersion = patchVersion;
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
