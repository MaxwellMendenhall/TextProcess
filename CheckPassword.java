import java.util.Scanner;

/**
 * Imagine you are developing a software package for Amazon.com
 * that requires users to enter their own passwords. 
 * Your software requires that users' passwords meet the following
 * criteria:
 * (1) The password should be at least six characters long
 * (2) The password should contain at least one uppercase and
 * at least one lowercase letter
 * (3) The password should have at least one digit
 * (4) If the password meet the requirement, please display 
 * "true", otherwise, display "false".
 * Please write a program and name it CheckPassword.java
 * For example:
 * Example 1:
 * input: "1234"
 * output: false
 * Example 2: "Abc123!"
 * output: true
 */

public class CheckPassword {
  
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
		System.out.println("Enter password phrase");
	  	String password = s.next();
	  	System.out.println(password(password));
  }
  public static boolean password(String s) {
	  boolean good = true;
	  int digits = 0;
	  int upper = 0;
	  int lower = 0;
	  char[] array;
	  
	  array = s.toCharArray();
	  
	  //to check for length of password
	  if(s.length() < 6){
		  good = false;
	  }
	  //to check how many digits, upper, and lower cases there are 
	  for(int i =0; i < array.length; i ++) {
		  if(Character.isDigit(array[i])) {
			  digits++;
		  }else if(Character.isUpperCase(array[i])) {
			  upper++;
		  }else if(Character.isLowerCase(array[i])) {
			  lower++;
		  }
	  }
	  //System.out.println(digits);
	  //System.out.println(upper);
	  //System.out.println(lower);
	  if(good && digits < 1) {
		  good = false;
	  }
	  if(good && upper < 1) {
		  good = false;
	  }
	  if(good && lower < 1) {
		  good = false;
	  }
	  return good;
	  
  }
  
  
}
