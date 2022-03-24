package Interview;

public class To_find_the_duplicate_characters_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String string1 = "Great responsibility";  
        
        int count;
        for(int i=0;i<string1.length();i++)
        {
        	count=1;
        	for(int j=i+1;j<string1.length();j++)
        	{
        		 
        		if(string1.charAt(i)==string1.charAt(j))
        		{
                    System.out.print(count=count+1); 

        			System.out.println(string1.charAt(i));
        			
        		}
        		
        	}
        	
        	
        	
        }
        
        String string2 = "Great responsibility";  
        char er = 0;
        for(int i=0;i<string2.length();i++)
        {
        	for(int j=i+1;j<string2.length();j++)
        	{
        		if(er!=string2.charAt(i))
        		{
        				if(string2.charAt(i)==string2.charAt(j))
        				{
        					er=string2.charAt(i);
        			
        					System.out.println("Duplicate value "+string2.charAt(i));
        				}
        			
        		}
        		
        	}
        }

	}
	}


