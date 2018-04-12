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
		setMessage("我是顾客："+pName+",我的地址是："+pAddress+",我的电话是："+pTeleNumber+"。"+"我已经发送订单:"+product+"了！");
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
