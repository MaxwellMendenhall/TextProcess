/**
 * Reverse a string.
 * The input string is given as an array of caracters char[]. 
 * Do not allocate extra space for another array, you must do
 * this by modifying the input array in-place with O(1) extra memory.
 * Example 1:
 * program input: hello
 * method input:['h','e','l','l','o']
 * method result: ['o','l','l','e','h']
 * program output: hello reversed is olleh
 * Example 2:
 * program input: Hannah
 * method input: ['H','a','n','n','a','h']
 * method result: ['h','a','n','n','a','H']
 * program output: Hannah reversed is hannaH
 * Please write the method reverseString. Everything else 
 * should not be changed.
 */

import java.util.Scanner;
public class InPlaceReverse
{
   /**
    * @param s - the string to be reversed in place
    * PRECONDITION a char[] called s 
    * POSTCONDITION, s is in reverse order.
    */
   public static void reverseString(final char[] s)
   {
      int start = 0;
	   int end = s.length - 1;
	   
	   int temp; 
	   
	   while(start < end) {
		   temp = s[start];
		   s[start] = s[end];
		   s[end] = (char) temp;
		   
		   start++;
		   end--;
	   }
      
   }
  
   // DO NOT CHANGE CODE BELOW THIS LINE
   /** 
    * This reads in a string into a char[] 
    * and calls reverseString, and prints before and
    * after.
    */
   public static void main(String[] args)
   {
     Scanner keyboard = new Scanner(System.in);
     System.out.print("Enter a word to reverse: ");
     char[] word = keyboard.nextLine().toCharArray();
     System.out.println();
     printCharArray(word);
     reverseString(word);
     System.out.print(" reversed is ");
     printCharArray(word);
     System.out.println();
   }
   /** 
    * @param s - the char[] to print.
    */
   public static void printCharArray(final char[] s){
     //print out all of the elements
      for(int i = 0; i<s.length;i++) {
         System.out.print(s[i]);
      }
   }
}
