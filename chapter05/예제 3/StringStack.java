import java.util.Scanner;

public class StringStack implements Stack{
	String element [];
	public int index;
	public StringStack(int num) {
		element = new String[num];
		index = 0;
		
	}
	public int length()
	{
		return index;
	}
	
	public Object pop(){
		if(index > 0)
		{
			index--;
			return element[index];
		}
		else {
			System.out.println("���Ұ� �����ϴ�.");
			return null;
		}
		
	}
	public Boolean push(Object ob)
	{
		if(element.length == index) {
			System.out.println("������ �� á���ϴ�.");
			return false;
		}
		else{ 
			element[index++] = ob.toString();
			return true;
		}
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�:");
		StringStack stack = new StringStack(10);
		String text = sc.next();
		stack.push(text);
		System.out.println("length : "+stack.length());
		System.out.println("pop : "+stack.pop());
		System.out.println("length : "+ stack.length());
		
	}
	
}
