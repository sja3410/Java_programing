import java.util.Scanner;

public class ArithmeticOperator {
	public static void main (String[] args)
	{
		int time;
		int sec;
		int min;
		int hour;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		time = scanner.nextInt();
		sec = time % 60;
		min = (time/60)%60;
		hour=(time/60)/60;
		
		System.out.print(time+"�ʴ� "+hour+"�ð�, "+min+"��, "+sec+"���Դϴ�.");
		
	}
}
