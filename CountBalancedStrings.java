import java.util.Scanner;

/** 
 * Balanced strings are those who have equal quantity of "L" and
 * "R" characters. Given a balanced string s split it in the maximum
 * amount of balanced strings. Return the maximum amount of splitted
 * balanced strings
 * Example 1:
 * input: "RLRRLLRLRL"
 * output: 4
 * Explanation: "RLRRLLRLRL" can be split into "RL", "RRLL", "RL", "RL",
 * since each substring contains the same number of "L" and R"
 * Example 2:
 * input: "RLLLLRRRLR"
 * output: 3
 * Explanation: "RLLLLRRRLR" can be split into "RL", "LLLRRR","LR",
 * since each substring contains the same number of "L" and "R"
 * Example 3:
 * input: "LLLLRRRR"
 * output: 1
 * Explanation: "LLLLRRRR" can be split into "LLLLRRRR"
 * Example 4:
 * input: "RLRRRLLRLL"
 * output: 2
 * Explanation: "RLRRRLLRLL" can be split into "RL", "RRRLLRLL",
 * since each substring contains the same number of "L" and "R"
 * Please write a program to achieve this goal and name it CountBalancedStrings.java
 */

public class CountBalancedStrings {
  
  
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
		System.out.println("Enter Balanced String");
	  	String balanced = s.next();
	  	System.out.println(balanced(balanced));
  }
  public static int balanced(String s) {
	  int Rcounter = 0;
	  int Lcounter = 0;
	  int totalCounter = 0;
	  
	  for(int i = 0; i < s.length(); i ++ ) {
		  if(s.charAt(i) == 'R') {
			  Rcounter++;
		  }else {
			  Lcounter++;
		  }
		  if(Rcounter == Lcounter) {
			  totalCounter++;
		  }
	  }
	  return totalCounter;
  }
  
  
}
