
public class Param{
	public static void main(String args[])
	{
		int x = 1;
		fun(x);
		System.out.println(x);

		int p[] = new int[1];
		p[0] = 123;
		System.out.println("Before fun2:"+p[0]);	
		fun2(p);
		System.out.println("After fun2:"+p[0]);
	}
	public static void fun(int x)
	{
		x = 100;	
	}
	public static void fun2(int[] p)
	{
		p[0] = 200;
	}
}

