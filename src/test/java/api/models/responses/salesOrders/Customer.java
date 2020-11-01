package api.models.responses.salesOrders;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"sysid",
	"formNumber",
	"name"
})
public class Customer {

	@JsonProperty("sysid")
	private Integer sysid;
	@JsonProperty("formNumber")
	private String formNumber;
	@JsonProperty("name")
	private String name;

	@JsonProperty("sysid")
	public Integer getSysid() {
		return sysid;
	}

	@JsonProperty("sysid")
	public void setSysid(Integer sysid) {
		this.sysid = sysid;
	}

	@JsonProperty("formNumber")
	public String getFormNumber() {
		return formNumber;
	}

	@JsonProperty("formNumber")
	public void setFormNumber(String formNumber) {
		this.formNumber = formNumber;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

}