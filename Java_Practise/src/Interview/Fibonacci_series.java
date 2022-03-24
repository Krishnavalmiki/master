package Interview;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=0, b=1,c,i;
			
			System.out.println(a);
			System.out.println(b);
			for(i=1;i<=10;i++)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
	
			}
			
			int x=0,y=1,z;
			
			System.out.println(x);
			System.out.println(y);
			
			for(int i1=0;i1<=10;i1++)
			{
				z=x+y;
				System.out.println(z);
				x=y;
				y=z;
			}
	}
	

}
