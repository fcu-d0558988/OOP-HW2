package comprint;

import java.util.Scanner;

public class printNumberInword {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a integer:");
		int a=input.nextInt();
		switch(a){
		case 1:
			System.out.print("one");
			break;
		case 2:
			System.out.print("two");
			break;
		case 3:
			System.out.print("three");
			break;
		case 4:
			System.out.print("four");
			break;
		case 5:
			System.out.print("five");
			break;
		case 6:
			System.out.print("six");
			break;
		case 7:
			System.out.print("seven");
			break;
		case 8:
			System.out.print("eight");
			break;
		case 9:
			System.out.print("nine");
			break;
			default:
				System.out.print("other");
				break;
		}
	}
}
