package practise;

public class MultilevelInheritance {
	
		void eat() {
			System.out.println("Eating");
		}
}
		class Dog extends MultilevelInheritance{
			void bark() {
				System.out.println("Barking");
			}
		}
		class BabyDog extends Dog{
			void weep() {
				System.out.println("weeping");
			}
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog bg=new BabyDog();
		bg.weep();
	}
		
}
