import java.util.Scanner;

public class DicManager {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		Dictionary dic = new Dictionary();
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		do {
			String order;
			System.out.print("�ѱ� �ܾ�?");
			order = sc.next();
			if(order.equals("�׸�"))
				break;
			else
				System.out.println(order+"�� " +dic.kor2Eng(order));
		}while(true);
	}
}
