package Conditional_statement;
import java.util.Scanner;
public class C9 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter  the a value:");
	        int a = sc.nextInt();
	        System.out.println("Enter the operator");
	        char op = sc.next().charAt(0);
	        int b = sc.nextInt();
            System.out.println("Enter the b value:");
	        switch (op) {
	            case '+': System.out.println(a + b); break;
	            case '-': System.out.println(a - b); break;
	            case '*': System.out.println(a * b); break;
	            case '/': System.out.println(a / b); break;
	            case '%': System.out.println(a % b); break;
	            default: System.out.println("Invalid Operator");
	        }
	    }
	}


