package DangdangNet;

public class DeliveryMan extends Notice{

	private String dName;
	
	public DeliveryMan(String name)
	{
		dName = name;
	}
	
	public String getDeliveryName() {
		return dName;
	}

	public void setDeliveryManName(String dName) {
		this.dName = dName;
	}
	
	public void sendProducts(Order order)
	{
		setMessage("我是快递小哥："+dName+",您的货物："+order.getProductList()+"，正在前往："+order.getAddress()+"，的路上！");
		noticeDangdang(this);
	}
	
}
