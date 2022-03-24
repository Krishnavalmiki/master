package Interview;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1238975;
		String temp = Integer.toString(n);
		int[] numbers = new int[temp.length()];
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i] +"");
		}
		
		int max=0;

		for(int i=0;i<=numbers.length;i++)
		{
			for(int j=i+1;j<=numbers.length;j++)
			{
				if(numbers[i]>numbers[j] )
					{
						max=numbers[i];
					}	
			
			}
		}

			System.out.println(max);
	}

}
