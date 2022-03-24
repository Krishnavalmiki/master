package ArrayProgram;

public class ArraySortinginAscendingorder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,7,8,4,5,2};
		
		int temp=0;
		
		System.out.println("Original Array");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" " +arr[i]);
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println();
		
        System.out.println("Elements of array sorted in ascending order: ");    
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print(" " +arr[i]);
        }
        
        System.out.println();
        
        int arr2[]= {89,4,1,86,34,67};
        int temp1=0;
        
        System.out.println("original Array");
        for(int i=0;i<arr2.length;i++)
        {
        	System.out.print(arr2[i] +" ");
        }
        
        System.out.println();
        
        for(int i=0;i<arr2.length;i++)
        {
        	for(int j=i+1;j<arr2.length;j++)
        	{
        		if(arr2[i]>arr2[j])
        		{
        			temp1=arr2[i];
        			arr2[i]=arr2[j];
        			arr2[j]=temp1;
        		}
        	}
        }
        
        System.out.println("Array after sorting");
        
        for(int i=0;i<arr2.length;i++)
        {
        	System.out.print(arr2[i]+" ");
        }
        
	}

}
