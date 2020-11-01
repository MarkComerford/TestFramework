package api.models.responses.salesOrders;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"total",
"results"
})
public class SalesOrderResults {

	@JsonProperty("total")
	private Integer total;
	@JsonProperty("results")
	private List<SalesOrder> results = null;

	@JsonProperty("total")
	public Integer getTotal() {
		return total;
	}

	@JsonProperty("total")
	public void setTotal(Integer total) {
		this.total = total;
	}

	@JsonProperty("results")
	public List<SalesOrder> getResults() {
		return results;
	}

	@JsonProperty("results")
	public void setResults(List<SalesOrder> results) {
		this.results = results;
	}

}