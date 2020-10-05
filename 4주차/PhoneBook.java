import java.util.Scanner;

class Phone{
	public static String name;
	public static String tell;
	
	public Phone(String name, String tell)
	{
		this.name = name;
		this.tell = tell;
	}
}
public class PhoneBook {
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο��� >> ");
		int man = sc.nextInt();
		Phone [] phone = new Phone[man];
		
		for(int i = 0; i<man; i++)
		{
			String name; String tell;
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
			name = sc.next();
			tell = sc.next();
			phone[i] = new Phone(name, tell);
		}
		System.out.println("����Ǿ����ϴ�.");
		do {
			String order;
			System.out.print("�˻��� �̸�>>");
			order = sc.next();
			if(order.equals("�׸�"))
				break;
			else {
				int i;
				for(i = 0; i<man; i++)
				{
					if((phone[i].name).equals(order)) {
						System.out.println(order+"�� ��ȣ�� "+phone[i].tell+"�Դϴ�.");
						break;
					}
				}
				if(i== man)
					System.out.println(order+" �� �����ϴ�.");
			
			}
		}while(true);
	}
}
