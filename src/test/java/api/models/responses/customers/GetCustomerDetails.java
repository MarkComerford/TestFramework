
package api.models.responses.customers;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sysid",
    "name",
    "email",
    "jobTitle",
    "phone",
    "firstName",
    "dateModified",
    "lastName",
    "title",
    "emailPreference",
    "mobile",
    "dateCreated",
    "individual",
    "socials",
    "customFields",
    "isB2b",
    "since",
    "lastTransaction",
    "numberOfTransactions",
    "status",
    "subStatus",
    "site_id",
    "addresses",
    "formNumber",
    "hideCarts",
    "salesRep",
    "carts"
})
public class GetCustomerDetails {

    @JsonProperty("sysid")
    private Integer sysid;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("jobTitle")
    private String jobTitle;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("dateModified")
    private String dateModified;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("title")
    private String title;
    @JsonProperty("emailPreference")
    private String emailPreference;
    @JsonProperty("mobile")
    private String mobile;
    @JsonProperty("dateCreated")
    private String dateCreated;
    @JsonProperty("individual")
    private Boolean individual;
    @JsonProperty("socials")
    private Socials socials;
    @JsonProperty("customFields")
    private List<CustomField> customFields = null;
    @JsonProperty("isB2b")
    private Boolean isB2b;
    @JsonProperty("since")
    private String since;
    @JsonProperty("lastTransaction")
    private String lastTransaction;
    @JsonProperty("numberOfTransactions")
    private Integer numberOfTransactions;
    @JsonProperty("status")
    private String status;
    @JsonProperty("subStatus")
    private String subStatus;
    @JsonProperty("site_id")
    private Object siteId;
    @JsonProperty("addresses")
    private List<Address> addresses = null;
    @JsonProperty("formNumber")
    private String formNumber;
    @JsonProperty("hideCarts")
    private Boolean hideCarts;
    @JsonProperty("salesRep")
    private SalesRep salesRep;
    @JsonProperty("carts")
    private List<Cart> carts = null;

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

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("jobTitle")
    public String getJobTitle() {
        return jobTitle;
    }

    @JsonProperty("jobTitle")
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("dateModified")
    public String getDateModified() {
        return dateModified;
    }

    @JsonProperty("dateModified")
    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("emailPreference")
    public String getEmailPreference() {
        return emailPreference;
    }

    @JsonProperty("emailPreference")
    public void setEmailPreference(String emailPreference) {
        this.emailPreference = emailPreference;
    }

    @JsonProperty("mobile")
    public String getMobile() {
        return mobile;
    }

    @JsonProperty("mobile")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @JsonProperty("dateCreated")
    public String getDateCreated() {
        return dateCreated;
    }

    @JsonProperty("dateCreated")
    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    @JsonProperty("individual")
    public Boolean getIndividual() {
        return individual;
    }

    @JsonProperty("individual")
    public void setIndividual(Boolean individual) {
        this.individual = individual;
    }

    @JsonProperty("socials")
    public Socials getSocials() {
        return socials;
    }

    @JsonProperty("socials")
    public void setSocials(Socials socials) {
        this.socials = socials;
    }

    @JsonProperty("customFields")
    public List<CustomField> getCustomFields() {
        return customFields;
    }

    @JsonProperty("customFields")
    public void setCustomFields(List<CustomField> customFields) {
        this.customFields = customFields;
    }

    @JsonProperty("isB2b")
    public Boolean getIsB2b() {
        return isB2b;
    }

    @JsonProperty("isB2b")
    public void setIsB2b(Boolean isB2b) {
        this.isB2b = isB2b;
    }

    @JsonProperty("since")
    public String getSince() {
        return since;
    }

    @JsonProperty("since")
    public void setSince(String since) {
        this.since = since;
    }

    @JsonProperty("lastTransaction")
    public String getLastTransaction() {
        return lastTransaction;
    }

    @JsonProperty("lastTransaction")
    public void setLastTransaction(String lastTransaction) {
        this.lastTransaction = lastTransaction;
    }

    @JsonProperty("numberOfTransactions")
    public Integer getNumberOfTransactions() {
        return numberOfTransactions;
    }

    @JsonProperty("numberOfTransactions")
    public void setNumberOfTransactions(Integer numberOfTransactions) {
        this.numberOfTransactions = numberOfTransactions;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("subStatus")
    public String getSubStatus() {
        return subStatus;
    }

    @JsonProperty("subStatus")
    public void setSubStatus(String subStatus) {
        this.subStatus = subStatus;
    }

    @JsonProperty("site_id")
    public Object getSiteId() {
        return siteId;
    }

    @JsonProperty("site_id")
    public void setSiteId(Object siteId) {
        this.siteId = siteId;
    }

    @JsonProperty("addresses")
    public List<Address> getAddresses() {
        return addresses;
    }

    @JsonProperty("addresses")
    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @JsonProperty("formNumber")
    public String getFormNumber() {
        return formNumber;
    }

    @JsonProperty("formNumber")
    public void setFormNumber(String formNumber) {
        this.formNumber = formNumber;
    }

    @JsonProperty("hideCarts")
    public Boolean getHideCarts() {
        return hideCarts;
    }

    @JsonProperty("hideCarts")
    public void setHideCarts(Boolean hideCarts) {
        this.hideCarts = hideCarts;
    }

    @JsonProperty("salesRep")
    public SalesRep getSalesRep() {
        return salesRep;
    }

    @JsonProperty("salesRep")
    public void setSalesRep(SalesRep salesRep) {
        this.salesRep = salesRep;
    }

    @JsonProperty("carts")
    public List<Cart> getCarts() {
        return carts;
    }

    @JsonProperty("carts")
    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

}
