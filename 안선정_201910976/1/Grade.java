import java.util.Scanner;

public class Grade {
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		char c;
		System.out.println("������ �Է��ϼ���.:");
		c = sc.next().charAt(0);
		switch(c)
		{
		case 'A':
		case 'B':
		case 'C':
			System.out.println("�� ���Ͽ����ϴ�.");
			break;
		case 'D':
		case 'E':
			System.out.println("�� �� ����ϼ���.");
			break;
		case 'F':
			System.out.println("���� �б⿡ �ٽ� �����ϼ���.");
			break;	
		}	
	}
}
