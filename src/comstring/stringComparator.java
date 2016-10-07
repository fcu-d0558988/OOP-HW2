package comstring;

import java.util.Scanner;

public class stringComparator {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string1:");
		String a=input.next();
		System.out.print("Enter a string2:");
		String b=input.next();
		if(a.equalsIgnoreCase(b)){
			System.out.println("The two strings are the same.");
		}
	}

}
