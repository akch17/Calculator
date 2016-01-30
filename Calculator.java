import java.util.*;
public class Calculator {
		public static void main (String [] args){
			Scanner scanner = new Scanner(System.in);
			System.out.print( " Bitte eingeben [ +-*/] zahl1 zahl2 ");
			String Operator = scanner.next();
			int zahl1=scanner.nextInt();
			int zahl2=scanner.nextInt();
			int result = 0;

			if (Operator.equals("+")){
				result = zahl1 + zahl2;
			}
			else if (Operator.equals("-")){
				result = zahl1 - zahl2;

			}
			System.out.println(zahl1 + " " + Operator + " " + zahl2 + " = " + result);
		}
	}