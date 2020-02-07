
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		Scanner scanner_variable = new Scanner(System.in);
		
		System.out.println("Enter Number :");
		int num = scanner_variable.nextInt();
		
		if (num<100){
			System.out.println("It's My Lucky Number..");
			}
		else{
			System.out.println("It's My Like Number..");	
		}
	}

}