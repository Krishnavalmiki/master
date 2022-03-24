package Interview;


public class PrintEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		do {
			System.out.println(num);
			num=num+2;
		}
		while(num<=10);
		
		int po=0;
		for(int i=0;i<=10;i++)
		{
			po=po+2;
			System.out.println(po);
		}
		
		int k=0;
		for(int x=0;x<=10;x++)
		{
			k=k+2;
			System.out.println(k);
		}
		
		int k1=0;
		for(int i=0;i<=10;i++)
		{
			k1=k1+2;
			System.out.println("This is Kseries " +k1);
		}
	}

}
