package practise;

public class Method_Overriding {
		void run() {
			System.out.println("Vehicle is running");
		}
		
}
	class Bike extends Method_Overriding{
		  void run(){
			  System.out.println("Bike is running safely");
		  }  
		  
		  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike obj=new Bike();
		obj.run();
	}

}
