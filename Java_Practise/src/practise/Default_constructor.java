package practise;


public class Default_constructor {
	int id;
	String name;
	
	Default_constructor()
	{
		
		System.out.println("Default Construtor");
	}
	
	void Display() {
		System.out.println(id + " " + name);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Default_constructor c=new Default_constructor();
		Default_constructor c1=new Default_constructor();
		c.Display();
		c1.Display();
	}

}
