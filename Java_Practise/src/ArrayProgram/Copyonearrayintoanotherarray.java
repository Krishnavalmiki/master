package ArrayProgram;

public class Copyonearrayintoanotherarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int actual[]= {2,4,5,6,7,7,8};
		
		int copy[]=new int[actual.length];
		
		for(int i=0;i<actual.length;i++)
		{
			copy[i]=actual[i];
		}
		
		
		
		System.out.println("Original Array");
		
		for(int j=0;j<actual.length;j++)
		{
			System.out.println(actual[j]);
		}
		
		System.out.println("Copied Array");
		
		for(int k=0;k<copy.length;k++)
		{
			System.out.println(copy[k]);
		}
		
		
		
		int kk[]= {3,5,4,3,4};
		
		int []pp=new int[kk.length];
		
		for(int i=0;i<kk.length;i++)
		{
			pp[i]=kk[i];
		}
				
		for(int j=0;j<pp.length;j++)
		{
			System.out.print(pp[j]+" ");
		}
		
		
		
	}

}
