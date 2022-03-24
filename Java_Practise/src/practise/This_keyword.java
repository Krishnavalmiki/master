package practise;


public class This_keyword {
//	this: to refer current class instance variable
	int a;
	int b;
	int c;
	This_keyword(int C, int B, int A){
		this.a=C;
		this.b=B;
		this.c=A;
	}
	
	void display() {
		System.out.println(a+ " " +b+ " " +c);
	}
	
//	this: to invoke current class method
	void thisMethod() {
		System.out.println("this method");
	}
	void thisMethod2() {
		this.thisMethod();
		System.out.println("this method2");
	}
	
//	this() : to invoke current class constructor
	This_keyword(){
		System.out.println("This is default constructor and Current class constructor");
	}
	
	This_keyword(int x){
		this();
		System.out.println("This is paramter constructor and Current class constructor " + x);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_keyword Tk=new This_keyword(11, 12, 13);
		Tk.display();
		Tk.thisMethod2();
		This_keyword Tk1=new This_keyword(15);
	
	}

}
