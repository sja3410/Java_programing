import java.util.Scanner;

public class example2 {
	public static void main(String [] args)
	{
		int [] shape = new int[20];
		int i = 0;
		int menu;
		Line line = new Line();
		Rect rect = new Rect();
		Circle circle = new Circle();
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("����(1), ����(2), ��� ����(3), ����(4)>>");
			menu = sc.nextInt();
			switch(menu)
			{
			case 1 :
				System.out.print("�������� Line(1), Rect(2), Circle(3)>>");
				menu = sc.nextInt();
				shape[i++]= menu;
				break;
			
			case 2 : 
				System.out.print("���� �� ��ġ�� ������ >>");
				menu = sc.nextInt();
				shape[menu-1] = 0;
				break;
			case 3 : 
				for(int k = 0; k<shape.length; k++) {
					if(shape[k]==1)
						line.draw();
					else if(shape[k] == 2)
						rect.draw();
					else if(shape[k] == 3)
						circle.draw();
				}
				break;
			case 4 : 
				break;
			default: 
				System.out.println("���� �޴��Դϴ�.");
			
			}
		}while(menu != 4);
	}
}
