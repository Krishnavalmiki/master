package Interview;

public class Display_Even_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=100;
		
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		
		for(int j=0;j<=num;j=j+2)
		{
			System.out.println("Value of J is " +j);
		}
	}

}
