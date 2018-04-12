package DangdangNet;

public class Customer extends Notice {

	private String pName;
	private String pAddress;
	private String pTeleNumber;
	private Order order;
	
	public Customer(String pName, String pAddress, String pTeleNumber)
	{
		this.pName = pName;
		this.pAddress = pAddress;
		this.pTeleNumber = pTeleNumber;
	}
	
	public Order getOrder()
	{
		return order;
	}
	
	public void downOrder(String product)
	{
		Order pOrder = new Order(pName, pAddress, product, pTeleNumber);
		this.order = pOrder;
		setMessage("���ǹ˿ͣ�"+pName+",�ҵĵ�ַ�ǣ�"+pAddress+",�ҵĵ绰�ǣ�"+pTeleNumber+"��"+"���Ѿ����Ͷ���:"+product+"�ˣ�");
		noticeDangdang(this);
	}

	public String getName() {
		return pName;
	}

	public void setName(String pName) {
		this.pName = pName;
	}

	public String getAddress() {
		return pAddress;
	}

	public void setAddress(String pAddress) {
		this.pAddress = pAddress;
	}

	public String getTeleNumber() {
		return pTeleNumber;
	}

	public void setTeleNumber(String pTeleNumber) {
		this.pTeleNumber = pTeleNumber;
	}
}
