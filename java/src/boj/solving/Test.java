package boj.solving;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static boolean validate(String username) {
    	
    	Pattern p = Pattern.compile("^[a-zA-Z]{4,}$");
    	Matcher m = p.matcher(username);
    	return m.matches();
    }
    
    public static void main(String[] args) {
        System.out.println(validate("Mike_Standish")); // Valid username
        System.out.println(validate("Mike Standish")); // Invalid username
        System.out.println(validate("MikeStandish")); // Invalid username
        System.out.println(validate("Mik")); // Invalid username
    }
}
