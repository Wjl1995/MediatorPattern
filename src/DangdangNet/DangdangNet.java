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
		// ��Ϣ����
		// �˿���Ϣ����
		if (notice.getClass() == Customer.class)
		{
			System.out.println(notice.getMessage());
			// ���ɶ�������
			Order order = ((Customer)notice).getOrder();
			// ��ʼ������
			executeOrder(order);
		}
		// ȡ��������Ϣ����
		if (notice.getClass() == GetProductsCenter.class)
		{
			System.out.println(notice.getMessage());
		}
		// ����������Ϣ����
		if (notice.getClass() == SendProductsCenter.class)
		{
			System.out.println(notice.getMessage());
		}
		// ���Ա��Ϣ����
		if (notice.getClass() == DeliveryMan.class)
		{
			System.out.println(notice.getMessage());
		}
	}
	
	private void executeOrder(Order order)
	{
		// ���������ݼ��붩������
		addOrderToList(order);
		// ׷�ٶ���
		trackOrder();
	}
	
	private void trackOrder()
	{
		// �Ӷ�������ȡ������
		Order order = getOrderFromList();
		// ��ȡ�����Ĳֿ�ȡ��
		GetProductsCenter.getInstance().getProduct(order);
		// �ͻ����Ĵ�����
		SendProductsCenter.getInstacne().sendProducts(order);
	}
}
