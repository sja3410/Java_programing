import java.util.Scanner;

public class ScannerExam {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("����, ü��, ������ ��ĭ���� �и��Ͽ� ������� �Է��ϼ���.");
		int age = scanner.nextInt();
		double kg = scanner.nextDouble();
		double cm = scanner.nextDouble();
		System.out.println("����� ���̴� "+age+"���Դϴ�.");
		System.out.println("����� ü���� "+kg+"kg�Դϴ�.");
		System.out.println("����� ������ "+cm+"cm�Դϴ�.");
	}
}
