package api.models.responses.salesOrders;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"sysid",
"grandTotal",
"isOrderToInvoice",
"payments",
"title",
"type",
"isCreditCardAuth",
"isInvoiceCreatable",
"displayType",
"quote",
"dateCreated",
"invoices",
"formNumber",
"status",
"customer",
"promo"
})

@JsonIgnoreProperties(ignoreUnknown = true)
public class SalesOrder {

	@JsonProperty("sysid")
	private Integer sysid;
	@JsonProperty("grandTotal")
	private Float grandTotal;
	@JsonProperty("isOrderToInvoice")
	private Boolean isOrderToInvoice;
	@JsonProperty("payments")
	private List<Object> payments = null;
	@JsonProperty("title")
	private String title;
	@JsonProperty("type")
	private String type;
	@JsonProperty("isCreditCardAuth")
	private Object isCreditCardAuth;
	@JsonProperty("isInvoiceCreatable")
	private Boolean isInvoiceCreatable;
	@JsonProperty("displayType")
	private String displayType;
	@JsonProperty("quote")
	private Object quote;
	@JsonProperty("dateCreated")
	private Float dateCreated;
	@JsonProperty("invoices")
	private List<Object> invoices = null;
	@JsonProperty("formNumber")
	private String formNumber;
	@JsonProperty("status")
	private String status;
	@JsonProperty("customer")
	private Customer customer;
	@JsonProperty("promo")
	private Integer promo;

	@JsonProperty("sysid")
	public Integer getSysid() {
		return sysid;
	}

	@JsonProperty("sysid")
	public void setSysid(Integer sysid) {
		this.sysid = sysid;
	}

	@JsonProperty("grandTotal")
	public Float getGrandTotal() {
		return grandTotal;
	}

	@JsonProperty("grandTotal")
	public void setGrandTotal(Float grandTotal) {
		this.grandTotal = grandTotal;
	}

	@JsonProperty("isOrderToInvoice")
	public Boolean getIsOrderToInvoice() {
		return isOrderToInvoice;
	}

	@JsonProperty("isOrderToInvoice")
	public void setIsOrderToInvoice(Boolean isOrderToInvoice) {
		this.isOrderToInvoice = isOrderToInvoice;
	}

	@JsonProperty("payments")
	public List<Object> getPayments() {
		return payments;
	}

	@JsonProperty("payments")
	public void setPayments(List<Object> payments) {
		this.payments = payments;
	}

	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	@JsonProperty("type")
	public String getType() {
		return type;
	}

	@JsonProperty("type")
	public void setType(String type) {
		this.type = type;
	}

	@JsonProperty("isCreditCardAuth")
	public Object getIsCreditCardAuth() {
		return isCreditCardAuth;
	}

	@JsonProperty("isCreditCardAuth")
	public void setIsCreditCardAuth(Object isCreditCardAuth) {
		this.isCreditCardAuth = isCreditCardAuth;
	}

	@JsonProperty("isInvoiceCreatable")
	public Boolean getIsInvoiceCreatable() {
		return isInvoiceCreatable;
	}

	@JsonProperty("isInvoiceCreatable")
	public void setIsInvoiceCreatable(Boolean isInvoiceCreatable) {
		this.isInvoiceCreatable = isInvoiceCreatable;
	}

	@JsonProperty("displayType")
	public String getDisplayType() {
		return displayType;
	}

	@JsonProperty("displayType")
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}

	@JsonProperty("quote")
	public Object getQuote() {
		return quote;
	}

	@JsonProperty("quote")
	public void setQuote(Object quote) {
		this.quote = quote;
	}

	@JsonProperty("dateCreated")
	public Float getDateCreated() {
		return dateCreated;
	}

	@JsonProperty("dateCreated")
	public void setDateCreated(Float dateCreated) {
		this.dateCreated = dateCreated;
	}

	@JsonProperty("invoices")
	public List<Object> getInvoices() {
		return invoices;
	}

	@JsonProperty("invoices")
	public void setInvoices(List<Object> invoices) {
		this.invoices = invoices;
	}

	@JsonProperty("formNumber")
	public String getFormNumber() {
		return formNumber;
	}

	@JsonProperty("formNumber")
	public void setFormNumber(String formNumber) {
		this.formNumber = formNumber;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("customer")
	public Customer getCustomer() {
		return customer;
	}

	@JsonProperty("customer")
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@JsonProperty("promo")
	public Integer getPromo() {
		return promo;
	}

	@JsonProperty("promo")
	public void setPromo(Integer promo) {
		this.promo = promo;
	}

}