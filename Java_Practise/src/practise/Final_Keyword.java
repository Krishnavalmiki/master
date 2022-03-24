package practise;

public class Final_Keyword {
	
	final int timeout=900;
	
	final void run() {
		timeout=400;
	}
	
}
	class fast extends Final_Keyword{
		void run() {
			System.out.println("running safely with 100kmph");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Final_Keyword fk=new Final_Keyword();
		fast fk=new fast();
		fk.run();
	}

}
