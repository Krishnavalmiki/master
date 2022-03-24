package Interview;

public class RemoveSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String output="Krishna V@lm$k! AP123";
		String []aa=output.split("\\s");
		String out =aa[1];
		System.out.println(out);


		out=out.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(aa[0]+" "+out+" "+aa[2]);
		
		
		String val="";
		for(int i=0;i<output.length();i++)
		{
			if(output.charAt(i)!='@' ||output.charAt(i)!='$' ||output.charAt(i)!='!' ||output.charAt(i)!='1' ||output.charAt(i)!='2' ||output.charAt(i)!='3')
			{
				val=output+output.charAt(i);
			}
		}
		System.out.println(output);
	}

}
