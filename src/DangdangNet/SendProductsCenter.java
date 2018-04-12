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
		setMessage("���İ����Ѿ��ּ���ϣ�����Ա��"+deliveryMan.getDeliveryName()+"����Ϊ���ͻ���");
		noticeDangdang(this);
		deliveryMan.sendProducts(order);
	}
	
	private void init()
	{
		DeliveryMan man = new DeliveryMan("����");
		addDeliveryMan(man);
	}
	
}
