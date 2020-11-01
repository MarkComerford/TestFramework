
package api.models.responses.customers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sysid",
    "name",
    "active",
    "isSystum",
    "slug",
    "position",
    "parentId"
})
public class Category {

    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("isSystum")
    private Boolean isSystum;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("parentId")
    private Integer parentId;

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

    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    @JsonProperty("isSystum")
    public Boolean getIsSystum() {
        return isSystum;
    }

    @JsonProperty("isSystum")
    public void setIsSystum(Boolean isSystum) {
        this.isSystum = isSystum;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("parentId")
    public Integer getParentId() {
        return parentId;
    }

    @JsonProperty("parentId")
    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

}
