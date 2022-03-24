package ArrayProgram;

public class Print_Smallest_Element_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,35,07,32,45,67};
//		int [] arr1=new int[] {34,35,54,32,45,67};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Smallest Element in Array is " +min);
		
		System.out.println();
		
		int [] kk=new int [] {87,34,22,33,44,78};
		
		int small=kk[0];
		
		for(int i=1;i<kk.length;i++)
		{
			if(kk[i]<small)
			{
				small=kk[i];
			}
		}
		System.out.println(small);
	}

}
