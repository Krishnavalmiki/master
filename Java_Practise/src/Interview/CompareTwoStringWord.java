package Interview;

public class CompareTwoStringWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Grab"; String b="Brag";
		
		int size=a.length();
		for(int i=0;i<size;i++)
		{
			if(a.charAt(i)==b.charAt(i))
			{
				System.out.println("Matched " + a.charAt(i)+ " " + b.charAt(i));
			}
			
		}
		
		for(int k=0;k<size;k++)
		{
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(k)==b.charAt(j))
				{
					System.out.println("Matching charcter " + a.charAt(k));
				}
			}
		}
		
		
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					System.out.println("Matching value " +a.charAt(i));
				}
			}
		}

	}

}
