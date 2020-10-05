import java.util.Scanner;
class SeatType{
	public static String A[][] = new String[3][10];
	public static String B[] = new String[10];
	public static String S[] = new String[10];
	
	
}
class Seat{ //�¼� ������ ����
	
	public Seat() {}
	public Seat(char type, int number, String name) //�¼� ����
	{
		switch(type)
		{
		case 'A' :
			if(SeatType.A[0][number]==null) {
				SeatType.A[0][number] = name;
				System.out.println("���������� ����Ǿ����ϴ�.");
			}
			else System.out.println("�ش� �¼��� �̹� ����Ǿ����ϴ�.");
			break;
		case 'B': 
			if(SeatType.A[1][number]==null) {
				SeatType.A[1][number] = name;
				System.out.println("���������� ����Ǿ����ϴ�.");
			}
			else System.out.println("�ش� �¼��� �̹� ����Ǿ����ϴ�.");
			break;
			
		case 'S' :
			if(SeatType.A[2][number]==null) {
				SeatType.A[2][number] = name;
				System.out.println("���������� ����Ǿ����ϴ�.");
			}
			else System.out.println("�ش� �¼��� �̹� ����Ǿ����ϴ�.");
			break;
		default:
			System.out.println("�¼��Է��� �߸� �Ǿ����ϴ�.");
		}
			
	}
	void cancel(String cancel)
	{
			for(int i= 0; i<3; i++)
			{
				for(int j = 0; j<10; j++)
				{
					if(cancel.equals(SeatType.A[i][j])) {
						System.out.println("���������� ��ҵǾ����ϴ�.");
						SeatType.A[i][j] = null;
						return;
					}
				}
			}
			System.out.println("�ش� �̸��� ���࿡ �����ϴ�.");
	}
	int find(String find) {
			for(int i= 0; i<3; i++)
			{
				for(int j = 0; j<10; j++)
				{
					if(find.equals(SeatType.A[i][j])) {
						System.out.println("������ �� ����� �� �ڸ��� ������ �� �ֽ��ϴ�.");
						return 0;
					} 
				}
			}
			return 1;
	}
	
}
public class Reserve {
	
	public static void main(String[] args) {
		Seat reserve = new Seat();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�ش��ϴ� �޴��� ��ȣ�� �Է��ϼ���.\n1.����\n2.��ȸ\n3.���\n4.������");
			int menu = sc.nextInt();
			switch(menu) {
			case 4:
				return;
			case 1: //����
				System.out.println("�¼� Ÿ��(S,A,B) : ");
				char seat = sc.next().charAt(0);
				if(seat != 'A' && seat!='B'&& seat != 'S') {
					System.out.println("�ش� �¼� Ÿ���� �����ϴ�.");
					break;
				}
				System.out.println("������ �̸� : ");
				String name = sc.next();
				if(reserve.find(name)==0)
					break;
				System.out.println("�¼� ��ȣ(1~10) : ");
				int seatnum = sc.nextInt();
				if(seatnum<1 || seatnum > 10) {
					System.out.println("���� �¼� ��ȣ�Դϴ�.");
					break;
				}
				Seat st = new Seat(seat, seatnum-1, name); //�¼� ä��� 
				break;
				
			case 2://��ȸ
				System.out.println("  S��   A��   B��");
				char S, A, B;
				for(int i = 0; i<10; i++)
				{
					if(SeatType.A[2][i]==null)
						S = 'O'; 
					else S='X';
					if(SeatType.A[0][i]==null)
						A = 'O'; 
					else A='X';
					if(SeatType.A[1][i]==null)
						B = 'O'; 
					else B='X';
					System.out.println(i+1 +" "+S+"   "+A+"   "+B);
				}
				break;
			
			case 3:
				System.out.print("�̸��� �Է��ϼ���:");
				String cancelname = sc.next();
				reserve.cancel(cancelname);
				break;
				
			default :
				System.out.println("�޴��� �߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
}

