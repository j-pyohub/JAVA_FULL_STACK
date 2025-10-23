import java.sql.Date;

public class CustomerVO {
	private int customer_id;
	private String name;
	private String phoneNumber;
	private Date inDate;
	
	
	
	public CustomerVO(int customer_id, String name, String phoneNumber, Date inDate) {
		super();
		this.customer_id = customer_id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.inDate = inDate;
	}
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Date getInDate() {
		return inDate;
	}
	public void setInDate(Date inDate) {
		this.inDate = inDate;
	}
	
	
}
