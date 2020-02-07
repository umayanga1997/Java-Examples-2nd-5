
import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
	
		Scanner scanner_variable = new Scanner (System.in);
		
		int num_01, num_02;
		
		num_01 = scanner_variable.nextInt();
		num_02 = scanner_variable.nextInt();
		
		System.out.println("num_01++ : "+ (num_01++));
		System.out.println("num_02-- : "+ (num_02--));
		
		System.out.println("++num_01 : "+ (++num_01));
		System.out.println("--num_01 : "+ (--num_02));
		
		System.out.println("num_01 += 10, "+"num_01 -= 10, "+"num_01 *= 10");
		System.out.println(num_01 += 10);
		System.out.println(num_02 -= 10);
		System.out.println(num_02 *= 10);
		
		System.out.println("num_01 + num_01 : "+ (num_01 + num_01));
		

	}

}
