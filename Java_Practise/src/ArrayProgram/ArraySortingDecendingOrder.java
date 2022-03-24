package ArrayProgram;

public class ArraySortingDecendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int [] {34,45,22,66,88,54,99};
		int temp=0;
		System.out.println("original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" " +arr[i]);
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		System.out.println("After sort by decsending");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" " +arr[i]);
		}
		
		System.out.println();
		
		int []arr2=new int[] {4,3,56,7,8,9};
		
		int desc=0;
		
		System.out.println("Actual Array");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] +" ");
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=i+1;j<arr2.length;j++)
			{
				if(arr2[i]<arr2[j])
				{
					temp=arr2[i];
					arr2[i]=arr2[j];
					arr2[j]=temp;
				}
			}
		}
		
		
		System.out.println();
		
		System.out.println("After sorting");
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i] +" ");
		}
		}

}
