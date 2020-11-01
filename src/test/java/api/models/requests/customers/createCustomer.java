package api.models.requests.customers;

public class createCustomer {

    public boolean individual;
    public boolean isB2b;
    public int salesRep;
    public String emailPreference;
    public String name;
    public String title;
    public String email;
    public String phone;
    public String mobile;
    public String firstName;
    public String lastName;
    public String status;
    
	public boolean isIndividual() {
		return individual;
	}
	public void setIndividual(boolean individual) {
		this.individual = individual;
	}
	public boolean isB2b() {
		return isB2b;
	}
	public void setB2b(boolean isB2b) {
		this.isB2b = isB2b;
	}
	public int getSalesRep() {
		return salesRep;
	}
	public void setSalesRep(int salesRep) {
		this.salesRep = salesRep;
	}
	public String getEmailPreference() {
		return emailPreference;
	}
	public void setEmailPreference(String emailPreference) {
		this.emailPreference = emailPreference;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
    
    
	
}
