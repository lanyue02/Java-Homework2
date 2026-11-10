package CH3;

public class Sample3_14 {
	public static void main(String[] args)
	{
		Car8 car1;
		car1 = new Car8();
		car1.show();
		
		Car8 car2;
		car2 = new Car8(1234,25.0);
		car2.show();
	}
}

class Car8
{
	private int num;
	private double gas;
	
	
	public Car8()
	{
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	
	public Car8(int n, double g)
	{
		this();
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是" + num);
		System.out.println("汽油量是" + gas);
	}
}
