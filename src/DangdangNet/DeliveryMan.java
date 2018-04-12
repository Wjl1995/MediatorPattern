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
		setMessage("���ǿ��С�磺"+dName+",���Ļ��"+order.getProductList()+"������ǰ����"+order.getAddress()+"����·�ϣ�");
		noticeDangdang(this);
	}
	
}
