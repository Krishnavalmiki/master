package practise;

public class Method_overloading {
//	1) Method Overloading: changing no. of arguments

	int add(int a, int b) {
		return a+b;
	}
	
	int add(int a, int b,int c) {
		return a+b+c;
	}

//	2) Method Overloading: changing data type of arguments
	static int add(int a,int b,int c,int d ) {
		return a+b+c+d;
	}
	
	static double add(double a,double b ) {
		return a+b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_overloading mo=new Method_overloading();
		System.out.println(mo.add(10, 12));
		System.out.println(mo.add(10, 12,13));
		System.out.println(Method_overloading.add(11, 12, 13, 14));
		System.out.println(Method_overloading.add(13.5, 44.3));
	}

}
