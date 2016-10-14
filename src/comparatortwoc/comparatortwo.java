package comparatortwoc;

import java.util.Scanner;

public class comparatortwo {
		public static void main(String[] args){
			
			Scanner input=new Scanner(System.in);
			int c=-1;
			
			do{
			System.out.print("Enter a string1:");
			String a=input.next();
			System.out.print("Enter a string2:");
			String b=input.next();
			c=a.compareToIgnoreCase(b);
			}while(c!=0);
			System.out.println("The two strings are the same.");
			
		}
}
