package Interview;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=44556778;
		int reverse = 0;
		
		while(num!=0)
		{
			int remin=num%10;
			reverse=reverse*10+remin;
			num=num/10;
		}
		System.out.println(reverse);
		
		int rv=846357374;
		int rev=0;
		while(rv!=0)
		{
			int rim=rv%10;
			rev=rev*10+rim;
			rv=rv/10;
		}
		System.out.println(rev);
		
		
		String str="Krishna";
		String reverse1="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse1=reverse1+str.charAt(i);
		}
		System.out.println(reverse1);
		
		String value="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String ulta="";
		
		for(int i=value.length()-1;i>=0;i--)
		{
			ulta=ulta+value.charAt(i);
		}
		System.out.println(ulta);
		
		
	}
	
	

}
