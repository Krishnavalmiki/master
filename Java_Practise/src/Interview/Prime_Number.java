package Interview;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,m,flag=0;
		int num=4;
		m=num/2;
		if(num==0||num==1)
		{
			System.out.println("Not an prime number");
		}
		else {
			for(i=2;i<=m;i++)
			{
				if(num%i==0)
				{
					System.out.println("Not an prime number " +num);
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Prime number " +num);
			}
		}
	}

}
