package ArrayProgram;

public class Print_Largest_Element_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {34,35,54,32,45,67};
//		int [] arr1=new int[] {34,35,54,32,45,67};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("Largest number is " +max);
		
		
		int kk[]= {4,7,5,3,2};
		int temp=kk[0];
		
		for(int i=1;i<kk.length;i++)
		{
			if(kk[i]>temp)
			{
				temp=kk[i];
			}
		}
		System.out.println(temp);
	}

}
