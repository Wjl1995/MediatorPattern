package DangdangNet;

import java.util.LinkedList;

public class SendProductsCenter extends Notice {

	private static SendProductsCenter center = new SendProductsCenter();
	
	public static SendProductsCenter getInstacne()
	{
		return center;
	}
	
	public LinkedList<DeliveryMan> deliveryManList = new LinkedList<DeliveryMan>();
	
	private void addDeliveryMan(DeliveryMan deliveryMan)
	{
		deliveryManList.push(deliveryMan);
	}
	
	private DeliveryMan getDeliveryMan()
	{
		return deliveryManList.poll();
	}
	
	public void sendProducts(Order order)
	{
		init();
		DeliveryMan deliveryMan = getDeliveryMan();
		setMessage("您的包裹已经分拣完毕，派送员："+deliveryMan.getDeliveryName()+"将会为您送货！");
		noticeDangdang(this);
		deliveryMan.sendProducts(order);
	}
	
	private void init()
	{
		DeliveryMan man = new DeliveryMan("张三");
		addDeliveryMan(man);
	}
	
}
