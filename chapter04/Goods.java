public class Goods {
	public String name;
	public int price;
	public int numberOfStock;
	public int sold;
	
	public static void main(String args[])
	{
		Goods camera = new Goods();
		camera.name = "Nikon";
		camera.price = 400000;
		camera.numberOfStock = 30;
		camera.sold = 50;
		
		System.out.println("��ǰ �̸� : "+camera.name);
		System.out.println("��ǰ ���� : "+camera.price);
		System.out.println("��� ���� : "+camera.numberOfStock);
		System.out.println("�Ǹ� ���� : "+camera.sold);
		
	}
	
}
