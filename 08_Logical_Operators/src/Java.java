
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		Scanner scanner_variable = new Scanner(System.in);
		
		System.out.println("Enter First Value :");
		int first_value = scanner_variable.nextInt();
		System.out.println("Enter Secound Value :");
		int secound_value = scanner_variable.nextInt();
		
		if (first_value<100 || secound_value < 200){
			System.out.println("Hello World..");
		}else{
			System.out.println("Hi World..");
		}

	}

}
