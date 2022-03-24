package practise;


public class If_Statement {
	//if-else statement
	void method1()
	{
		int a=10;
		int b=22;
		if(a+b < 10) 
		{
			System.out.println("a + b is less than      10");  
		}
		else 
		{  
			System.out.println("a + b is greater than 20");  
		}
	}
	//if-else-if statement
	void method2()
	{
		String city = "Delhi";  
		if(city == "Meerut") 
		{  
			System.out.println("city is meerut");  
		}
		else if (city == "Noida") 
		{  
			System.out.println("city is noida");  
		}
		else if(city == "Agra") 
		{  
			System.out.println("city is agra");  
		}
		else 
		{  
			System.out.println(city);  
		}  
	}
	//Nested if-statement
	void method3()
	{
		String address="Delhi, India"; 
		if(address.endsWith("India")) 
		{    
			if(address.contains("Meerut")) 
			{    
				System.out.println("Your city is Meerut");    
			}
			else if(address.contains("Noida")) 
			{    
				System.out.println("Your city is Noida");    
			}
			else 
			{    
				System.out.println(address.split(",")[0]);    
			}    
		}
		else 
			{    
				System.out.println("You are not living in India");    
			}    
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=12;
		if(a+b>20)
		{
			System.out.println("x + y is greater than 20");
		}
		
		If_Statement ss=new If_Statement();
		ss.method1();
		ss.method2();
		ss.method3();
		
		
	}

}
