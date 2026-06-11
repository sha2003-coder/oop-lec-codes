import java.util.Scanner;
public class Operation
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		String op=sc.next();
		int num2=sc.nextInt();
		if (op.equals("+")) {
            System.out.println("Result: " + (num1 + num2));
        } 
        else if (op.equals("-")) {
            System.out.println("Result: " + (num1 - num2));
        } 
        else if (op.equals("*")) {
            System.out.println("Result: " + (num1 * num2));
        } 
        else if (op.equals("/")) {
            // Good practice: Check for division by zero
            if (num2 == 0) {
                System.out.println("Error: Division by zero");
            } else {
                System.out.println("Result: " + (num1 / num2));
            }
        } 
        else {
            System.out.println("undefined operation");
        }
	}
}