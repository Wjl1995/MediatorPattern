package DangdangNet;

public class GetProductsCenter extends Notice {

	private static GetProductsCenter center = new GetProductsCenter();
	
	public static GetProductsCenter getInstance()
	{
		return center;
	}
	
	public void getProduct(Order order)
	{
		setMessage("�����ѴӲֿ�û��"+order.getProductList()+"!");
		noticeDangdang(this);
	}
	
}
