package Interview;

import java.util.ArrayList;

public class To_count_the_total_number_of_vowels_and_consonants_in_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String str = "This is a really simple sentence";    
        int count =0;
        String vowel="aeiouAEIOU";
        for(int i=0;i<str.length();i++)
        {
        	for(int j=0;j<vowel.length();j++)
        	{
        		if(str.charAt(i)==vowel.charAt(j))
        		{
        			count++;
        		}
        	}
        }
        System.out.println(count);
        
       
        String str2="ThIs is a rEally simple sentence";
        
        int count1=0;
        
        for(int i=0;i<str2.length();i++)
        {
        	for(int j=0;j<vowel.length();j++)
        	{
        		if(str2.charAt(i)==vowel.charAt(j))
        		{
        			count1++;
        		}
        	}
        }
        System.out.println(count1);
        
	}

}
