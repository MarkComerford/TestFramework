
package api.models.responses.customers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "facebookUrl"
})
public class Socials_ {

    @JsonProperty("facebookUrl")
    private String facebookUrl;

    @JsonProperty("facebookUrl")
    public String getFacebookUrl() {
        return facebookUrl;
    }

    @JsonProperty("facebookUrl")
    public void setFacebookUrl(String facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

}
