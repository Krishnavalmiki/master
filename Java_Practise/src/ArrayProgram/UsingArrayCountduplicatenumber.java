package ArrayProgram;

public class UsingArrayCountduplicatenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3};
		int [] arr1=new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate number " +arr[i]);
				}
				
			}
			
		}
		
		int arr2[]= {1, 2, 3, 4, 2, 7, 8, 8, 3};
		int []kk=new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		for(int i=0;i<kk.length;i++)
		{
			for(int j=i+1;j<kk.length;j++)
			{
				if(kk[i]==kk[j])
				{
					System.out.println("Duplicate Value " +kk[i]);
				}
			}
		}
	}
}





