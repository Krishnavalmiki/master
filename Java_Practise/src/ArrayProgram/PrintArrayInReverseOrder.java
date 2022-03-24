package ArrayProgram;

public class PrintArrayInReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]);
		}
		
		System.out.println();
		int arr2[]= {2,3,4,5,6,7,8,9,10};
		
		
		for(int i=arr2.length-1;i>=0;i--)
		{
			System.out.print(arr2[i] +" ");
		}
		
	}

}
