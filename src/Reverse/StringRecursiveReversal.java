package Reverse;


import java.util.Scanner;

public class StringRecursiveReversal {
 String reverse = "";
 public String reverseString(String str){
 	
	 if(str.length() == 1){
	 return str;
 	}
	else {
 	reverse += str.charAt(str.length()-1)
 	+reverseString(str.substring(0,str.length()-1));
 	return reverse;
 	}
 }
 public static void main(String a[]){
 	StringRecursiveReversal srr = new StringRecursiveReversal();
 
 	System.out.println("Enter lawda size for girls ");
 	Scanner scanner = new Scanner(System.in);
	String inputString=  scanner.nextLine();
 	System.out.println("Result: "+srr.reverseString(inputString));
 }
}