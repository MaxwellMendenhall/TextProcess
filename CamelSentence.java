import java.util.Scanner;

/**
 * In this program, please 
 * (1) Accept a string such as "StopAndSmellTheRoses."
 * (2) Convert the string to a sentence in which the words are
 *     separated by spaces and only the first word starts with
 *     an uppercase letter
 * (3) display the string
 * (4) please name your java source file as CamelSentence.java
 * For example:
 * Example 1:
 * input:StopAndSmellTheRoses.
 * output:Stop and smell the roses.

 * Example 2:
 * input:KnowledgeIsPower.
 * output:Knowledge is power.
 */

public class CamelSentence {
  
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
		System.out.println("Enter camel phrase");
	  	String camel = s.next();
    	System.out.println(camel(camel));
  	}
  	public static String camel(String s) {
	  
	  String result ="";
	  char c = s.charAt(0);
	  
	  result = result + Character.toUpperCase(c);
	  
	  for(int i = 1; i < s.length(); i++) {
		  
		  char ch = s.charAt(i);
		  
		  if(Character.isUpperCase(ch)) {
			  result = result + ' ';
			  result = result + Character.toLowerCase(ch);
		  }else {
			  result = result + ch;
		  }
	  }
	  return result;
  
    }
  }
