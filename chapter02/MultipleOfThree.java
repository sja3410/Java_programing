import java.util.Scanner;
public class MultipleOfThree {
	public static void main(String[] args)
	{
		System.out.print("���� �Է��Ͻÿ�: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num % 3 == 0)
			System.out.println("3�� ����Դϴ�.");
		else
			System.out.println("3�� ����� �ƴմϴ�.");
	}
}
