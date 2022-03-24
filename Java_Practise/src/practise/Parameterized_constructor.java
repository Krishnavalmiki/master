package practise;


public class Parameterized_constructor {
	
	int id;
	String name;
	
	Parameterized_constructor(int i, String n)
	{
		id=i;
		name=n;
	}
	
    void display()
    {
    	System.out.println(id+" "+name);
    }  


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterized_constructor pc=new Parameterized_constructor(10, "Krishna");
		Parameterized_constructor pc2=new Parameterized_constructor(20, "Valmiki");
		pc.display();
		pc2.display();
	}

}
