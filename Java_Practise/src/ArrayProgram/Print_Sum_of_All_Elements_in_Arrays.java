package ArrayProgram;

public class Print_Sum_of_All_Elements_in_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr=new int [] {1,3,4,5,6,7};
		
		int total=0;
		
		for(int i=0;i<arr.length;i++)
		{
			total=total+arr[i];
		}
		System.out.println("Sum of All Element in Array " +total);
		
		
		
		int aa2[]= {2,3,4,5,6,7,8};
		
		int count=0;
		for(int i=0;i<aa2.length;i++)
		{
			count=count+aa2[i];
		}
		System.out.println(count);
	}

}
