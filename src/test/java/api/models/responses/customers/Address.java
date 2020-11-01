
package api.models.responses.customers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sysid",
    "street1",
    "street2",
    "street3",
    "isDefault",
    "city",
    "postCode",
    "country",
    "locale",
    "status",
    "name",
    "dateCreated",
    "type"
})
public class Address {

    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("street1")
    private String street1;
    @JsonProperty("street2")
    private String street2;
    @JsonProperty("street3")
    private String street3;
    @JsonProperty("isDefault")
    private Boolean isDefault;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postCode")
    private String postCode;
    @JsonProperty("country")
    private String country;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("status")
    private String status;
    @JsonProperty("name")
    private String name;
    @JsonProperty("dateCreated")
    private Object dateCreated;
    @JsonProperty("type")
    private String type;

    @JsonProperty("sysid")
    public Integer getSysid() {
        return sysid;
    }

    @JsonProperty("sysid")
    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @JsonProperty("street1")
    public String getStreet1() {
        return street1;
    }

    @JsonProperty("street1")
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    @JsonProperty("street2")
    public String getStreet2() {
        return street2;
    }

    @JsonProperty("street2")
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    @JsonProperty("street3")
    public String getStreet3() {
        return street3;
    }

    @JsonProperty("street3")
    public void setStreet3(String street3) {
        this.street3 = street3;
    }

    @JsonProperty("isDefault")
    public Boolean getIsDefault() {
        return isDefault;
    }

    @JsonProperty("isDefault")
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("postCode")
    public String getPostCode() {
        return postCode;
    }

    @JsonProperty("postCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("dateCreated")
    public Object getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("dateCreated")
    public void setDateCreated(Object dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

}
