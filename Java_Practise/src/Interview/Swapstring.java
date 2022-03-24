package Interview;

public class Swapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="krishna";
		String b="valmiki";
		
		a=a+b;
		System.out.println(a);
		
		b=a.substring(0,(a.length()-b.length()));
		
		a=a.substring(b.length());
		
		System.out.println(a+ " " +b);
		
		
		String x="Valmiki";
		String y="Pooja";
		
		x=x+y;
		System.out.println(x);
		
		y=x.substring(0, (x.length()-y.length()));
		x=x.substring(y.length());
		
		System.out.println(x+" "+y);
	}

}
