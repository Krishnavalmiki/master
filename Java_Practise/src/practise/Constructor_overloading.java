package practise;


public class Constructor_overloading {
	
	int id;
	String name;
	int age;
	
	Constructor_overloading(){
		
	}
	
	Constructor_overloading(int i, String n){
		id=i;
		name=n;
	}
	
	Constructor_overloading(String n, int i,int a){
		id=i;
		name=n;
		age=a;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_overloading Co=new Constructor_overloading(111,"Karan");
		Constructor_overloading Co1=new Constructor_overloading("Karan",111,20);
		Co.display();
		Co1.display();
	}

}
