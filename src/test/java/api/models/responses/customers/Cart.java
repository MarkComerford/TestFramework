
package api.models.responses.customers;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sysid",
    "dateCreated",
    "status",
    "user",
    "store",
    "items"
})
public class Cart {

    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("dateCreated")
    private String dateCreated;
    @JsonProperty("status")
    private String status;
    @JsonProperty("user")
    private User user;
    @JsonProperty("store")
    private Store store;
    @JsonProperty("items")
    private List<Item> items = null;

    @JsonProperty("sysid")
    public Integer getSysid() {
        return sysid;
    }

    @JsonProperty("sysid")
    public void setSysid(Integer sysid) {
        this.sysid = sysid;
    }

    @JsonProperty("dateCreated")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("dateCreated")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(User user) {
        this.user = user;
    }

    @JsonProperty("store")
    public Store getStore() {
        return store;
    }

    @JsonProperty("store")
    public void setStore(Store store) {
        this.store = store;
    }

    @JsonProperty("items")
    public List<Item> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<Item> items) {
        this.items = items;
    }

}
