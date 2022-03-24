package Interview;

public class To_count_the_total_number_of_characters_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String string = "The best of both worlds";    
        int count=0;
        for(int i=0;i<string.length();i++)
        {
        	if(string.charAt(i)!=' ')
        	{
        	     		count++;
        	}
           	
        }
        System.out.print("Count of the String is "+count);
        
        
        String string1 = "The best of both worlds";    
        int count1=0;
        
        for(int i=0;i<string1.length();i++)
        {
        	if(string1.charAt(i)!=' ')
        	{
        		count1++;	
        	}
        }
        System.out.println(count1);
	}

}
