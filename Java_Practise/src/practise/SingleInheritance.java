package practise;


public class SingleInheritance {
//	single inheritance
	void SingleInheritanceParentMethod() {
		System.out.println("This is Parent class");
	}
	
}
 class Child extends SingleInheritance{

	void SingleInheritanceChildMethod() {
		System.out.println("This is Child class");
	}
	 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child childobj=new Child();
		childobj.SingleInheritanceChildMethod();
		childobj.SingleInheritanceParentMethod();
		
	}

}
