package Interview;

public class To_remove_all_the_white_spaces_from_a_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="Remove white spaces";    

        str1=str1.replaceAll("\\s", "");
        System.out.println(str1);
        
        String str2="Remove white spaces testing the space removal";
        
        str2=str2.replaceAll("\\s", "");
        System.out.println(str2);
        
        String str3="Remove white spaces testing the space removal";

        str3=str3.replaceAll("\\s", "*");
        System.out.println(str3);
	}

}
