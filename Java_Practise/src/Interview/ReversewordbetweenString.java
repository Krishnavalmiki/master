package Interview;

public class ReversewordbetweenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a1= "Krishna valmiki 2013";
		String reverse="";

		for(int i=a1.length()-1;i>=0;i--)
		{
			if(a1.charAt(i)=='3' || a1.charAt(i)=='1' || a1.charAt(i)=='0' || a1.charAt(i)=='2')
			{
				reverse =reverse+a1.charAt(i);
			}
		}
		System.out.println(a1.substring(0,15)+ " " +reverse);
		
		
		String b1=a1.substring(8, 15);
		System.out.println(b1);
		String reversemiddlename="";
		
		for(int i=b1.length()-1;i>=0;i--)
		{
			reversemiddlename=reversemiddlename+b1.charAt(i);
		}
		System.out.println(reversemiddlename);
		
		System.out.println(a1.substring(0,7)+" "+reversemiddlename+" "+a1.substring(16));
	}

}
