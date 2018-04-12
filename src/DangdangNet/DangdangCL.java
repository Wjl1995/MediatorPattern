package DangdangNet;

public class DangdangCL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 新建客户
		Customer customer = new Customer("吴佳力", "北航", "188********");
		// 下单
		customer.downOrder("《程序员的自我修养》");
	}
}
