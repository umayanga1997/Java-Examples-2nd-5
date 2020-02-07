
import java.util.Scanner;

public class Java {


	public static void main(String[] args) {
		Scanner scanner_variable = new Scanner (System.in);
		String y = "";
                System.out.println("Enter Number here :");
		int x = scanner_variable.nextInt();
		 
		 switch (x){
		 
		 case 1:
			 x=100;
			 y="New_1";
			 break;
		 case 2:
			 x=200;
			 y="New_2";
			 break;
		 case 3:
			 x=300;
			 y="New_3";
			 break;
		 case 4:
			 x=400;
			 y="New_4";
			 break;
		 case 5:
			 x=500;
			 y="New_5";
			 break;
		 case 6:
			 x=600;
			 y="New_6";
			 break;
		 case 7:
			 x=700;
			 y="New_7";
			 break;
		 case 8:
			 x=800;
			 y="New_8";
			 break;
		 case 9:
			 x=900;
			 y="New_9";
			 break;
		 case 10:
			 x=1000;
			 y="New_10";
			 break;
		 
		 }
		 System.out.println(x);
                 System.out.print(y);

	}

}
