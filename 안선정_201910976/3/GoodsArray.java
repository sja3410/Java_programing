import java.util.Scanner;

public class GoodsArray {
	public static void main(String [] args)
	{
		Goods gd[] = new Goods[3];
		Scanner sc = new Scanner(System.in);
		String name; 
		int price;
		int numberOfStock;
		int sold;
		
		System.out.println("��ǰ ������ ���ʷ� �Է��϶�.");
		for(int i = 0; i<3; i++)
		{
			name = sc.next();
			price = sc.nextInt();
			numberOfStock = sc.nextInt();
			sold = sc.nextInt();
			gd[i] = new Goods(name, price, numberOfStock, sold);
		}
		System.out.println("�Էµ� ��ǰ ������ ������ �����ϴ�");
		for(int i = 0; i<3; i++)
		{
			System.out.println(gd[i].getName()+" "+gd[i].getPrice()+" "+gd[i].getNumberOfStock()+" "+gd[i].getSold());
		}
		
	}
}
