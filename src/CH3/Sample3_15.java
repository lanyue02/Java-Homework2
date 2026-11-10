package CH3;

public class Sample3_15 {
	public static void main(String[] args)
	{
		Car9 car1;
		car1 = new Car9();
		car1.setCar(1234,20.5);
		
		Car9.showSum();
		
		Car9 car2;
		car2 = new Car9();
		car2.setCar(4567,30.5);
	}
}

class Car9
{
	public static int sum = 0;
	private int num;
	private double gas;
	
	
	public Car9()
	{
		num = 0;
		gas = 0;
		sum++;
		System.out.println("生產了車子");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public static void showSum()
	{
		System.out.println("車子總共有"+sum+"台");
	}
	
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
