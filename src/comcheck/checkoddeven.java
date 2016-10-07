package comcheck;
import java.util.Scanner;

public class checkoddeven {
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a integer:");
		int a=input.nextInt();
		if(a%2==0){
			System.out.println("The input interger is Even Number");
		}
		else{
			System.out.println("The input interger isn't Even Number");
		}
	}

}
