package DangdangNet;

public class GetProductsCenter extends Notice {

	private static GetProductsCenter center = new GetProductsCenter();
	
	public static GetProductsCenter getInstance()
	{
		return center;
	}
	
	public void getProduct(Order order)
	{
		setMessage("卖家已从仓库得货物："+order.getProductList()+"!");
		noticeDangdang(this);
	}
	
}
