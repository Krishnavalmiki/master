package Pattern;

public class Javapattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int m=1;
		
		for(i=1;i<5;i++)
		{
			for(j=1;j<i+1;j++)
			{
				System.out.print(m++ +" ");
			}
			System.out.println(" ");
		}
		
		
		int a=4; int b=5;
		
		a=a+b;
		System.out.println(a);
		b=a-b;
		System.out.println(b);
		a=a-b;
		System.out.println(a);
		
		System.out.println("Now a is " +a +"and b is " +b);
	}
}
