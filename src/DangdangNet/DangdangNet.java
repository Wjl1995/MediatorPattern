package DangdangNet;

import java.util.LinkedList;

public class DangdangNet {

	private static DangdangNet instance = new DangdangNet();
	
	public LinkedList<Order> orderList = new LinkedList<Order>();
	
	public static DangdangNet getInstance()
	{
		return instance;
	}
	
	private void addOrderToList(Order order)
	{
		orderList.push(order);
	}
	
	private Order getOrderFromList()
	{
		return orderList.poll();
	}
	
	public void executeNotice(Notice notice)
	{
		// 消息处理
		// 顾客消息处理
		if (notice.getClass() == Customer.class)
		{
			System.out.println(notice.getMessage());
			// 生成订单数据
			Order order = ((Customer)notice).getOrder();
			// 开始处理订单
			executeOrder(order);
		}
		// 取货中心消息处理
		if (notice.getClass() == GetProductsCenter.class)
		{
			System.out.println(notice.getMessage());
		}
		// 发货中心消息处理
		if (notice.getClass() == SendProductsCenter.class)
		{
			System.out.println(notice.getMessage());
		}
		// 快递员消息处理
		if (notice.getClass() == DeliveryMan.class)
		{
			System.out.println(notice.getMessage());
		}
	}
	
	private void executeOrder(Order order)
	{
		// 将订单数据加入订单队列
		addOrderToList(order);
		// 追踪订单
		trackOrder();
	}
	
	private void trackOrder()
	{
		// 从订单队列取出订单
		Order order = getOrderFromList();
		// 从取货中心仓库取货
		GetProductsCenter.getInstance().getProduct(order);
		// 送货中心处理订单
		SendProductsCenter.getInstacne().sendProducts(order);
	}
}
