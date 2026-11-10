package CH3;

public class Sample3_13 {
	public static void main(String[] args)
	{
		Car7 car1;
		car1 = new Car7();
		car1.show();
		
		Car7 car2;
		car2 = new Car7(1234,25.0);
		car2.show();
	}
}

class Car7
{
	private int num;
	private double gas;
	
	
	public Car7()
	{
		num = 0;
		gas = 0;
		System.out.println("生產了車子");
	}
	
	public Car7(int n, double g)
	{
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
