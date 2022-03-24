package practise;


public class Static_variable {
	
	int rollno;
	String Name;
	static String college="ITS";
	static int counter=0;
	
	Static_variable(int r,String n){
		rollno=r;
		Name=n;
		counter++;
		System.out.println(counter);
	}
	void display() {
		System.out.println(rollno + " " +Name+ " " +college+ " " +counter);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static_variable sv=new Static_variable(10, "Krishna");
		Static_variable sv1=new Static_variable(10, "Krishna");
		sv.display();
		sv1.display();
	}

}
