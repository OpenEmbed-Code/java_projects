//source insight写的程序默认编码方式ASCII，而Java编译器是UTF-8格式来解析，所以用source insight写的程序要进行格式转化
public class Var{
	public static void main(String args[])
	{

		int a = 3;
		float f = 3.14;
		/*java 中无指针，并且没有malloc函数*/
		//int *p = malloc(10*sizeof(int));
		int p[] = new int[10];
		int p2[] = {1,2,4};/*静态分配*/
		//char str[100];
		char str[] = new char[100];
		
		//char str[] = "abc";
		String str2 = "abc";
		System.out.println();
	}
}
