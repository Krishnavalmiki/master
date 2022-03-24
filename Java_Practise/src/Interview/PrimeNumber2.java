package Interview;

public class PrimeNumber2 {
	int i,j,counter=0;
	
	public void prime(int n)
	{
		System.out.println("print 1 to n number prime number");
		
		for(i=2;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					counter++;
				}
			}
			if(counter==2)
			{
				System.out.println(i);
			}
			counter=0;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber2 pm=new PrimeNumber2();
		pm.prime(10);
		
		int i,j,counter=0;
		for(i=2;i<=10;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					counter++;
				}
			}
			
			if(counter==2)
			{
				System.out.println("Prime number are " +i);
			}
			counter=0;
		}
		
		
				
	}

}
