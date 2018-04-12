package DangdangNet;

public class Order {

	private String personInfomation;
	private String address;
	private String productList;
	private String teleNumber;
	
	public Order(String personInfomation, String address, String productList, String teleNumber)
	{
		this.personInfomation = personInfomation;
		this.address = address;
		this.productList = productList;
		this.teleNumber = teleNumber;
	}
	
	public String getPersonInfomation() {
		return personInfomation;
	}
	public void setPersonInfomation(String personInfomation) {
		this.personInfomation = personInfomation;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getProductList() {
		return productList;
	}
	public void setProductList(String productList) {
		this.productList = productList;
	}
	public String getTeleNumber() {
		return teleNumber;
	}
	public void setTeleNumber(String teleNumber) {
		this.teleNumber = teleNumber;
	}
}
