package ArrayProgram;

public class Print_even_and_Odd_position_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr=new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.print(arr[i] +" ");
		}
		
		System.out.println("");
//		Print_the_elements_of_an_array_present_on_Odd_position
		
		for(int j=0;j<arr.length;j=j+2)
		{
			System.out.print(arr[j] +" ");
		}
		System.out.println();
		
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.print(arr[i]);
		}
	}

}
