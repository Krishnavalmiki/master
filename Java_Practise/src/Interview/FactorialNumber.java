package Interview;


public class FactorialNumber {
	int val=1;
	void factorial(int a)
	{
		for(int i=1;i<=a;i++)
		{
			val=val*i;
//			System.out.println(val);
		}
		System.out.println(val);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialNumber f=new FactorialNumber();
		f.factorial(5);
		int num=1;
		
		for(int i=1;i<=5;i++)
		{
			num=num*i;
//			System.out.println(num);
		}
		System.out.println(num);
		
		int no=1;
		
		for(int i=1;i<=5;i++)
		{
			no=no*i;
		}
		System.out.println("Value of no is " +no);
	}
	
	 

}
