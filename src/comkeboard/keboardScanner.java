package comkeboard;
import java.util.Scanner;

public class keboardScanner {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a integer:");
		int a=input.nextInt();
		System.out.print("Enter a float point number:");
		float b=input.nextFloat();
		System.out.print("Enter a your name:");
		String c=input.next();
		float t=a*b;
		System.out.print("Hi "+c+",the multiplication of "+a+" and "+b+" is ");
		System.out.printf("%4.2e",t);
	}

}
