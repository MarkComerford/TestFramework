
package api.models.responses.customers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "qbo_customer_id"
})
public class CustomField_ {

    @JsonProperty("qbo_customer_id")
    private String qboCustomerId;

    @JsonProperty("qbo_customer_id")
    public String getQboCustomerId() {
        return qboCustomerId;
    }

    @JsonProperty("qbo_customer_id")
    public void setQboCustomerId(String qboCustomerId) {
        this.qboCustomerId = qboCustomerId;
    }

}
