package ArrayProgram;

public class PrintThirdLargestInArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,7,12,6,11,10};
//		int i;
		int temp=0;
		int total=6;
		for(int i=0;i<total;i++)
		{
			for(int j=i+1;j<total;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[total-3]);
		
		
		int arr2[]= {2,3,44,38,6,77};
		
		int temp1=0;
		int total1=6;
		
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
		System.out.println("Third Largest number is" +arr2[total1-3]);
		
		
	}

}
