import java.io.*;
import java.util.Scanner;
package strings;

import java.util.Scanner;

public class Reverse_string {
	
	static void reverse(String str) {
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	
	for(int i=0;i<str.length/2;i++) {
	   String s;
	   s = str[i];
	   str[i] = str[length-1-i] ;
	   str[length-1-i] = s;
	}
	}
	
	
public static void main(String[] args) {
	String s="abcde";
	reverse(s);
	
	
}

}
