package Conditional_statement;
import java.util.Scanner;
public class C8 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the hour:");
	        int h = sc.nextInt();
	        System.out.println("Enter the minutes:");
	        int m = sc.nextInt();
	        if (h >= 0 && h <= 23 && m >= 0 && m <= 59)
	            System.out.println("Valid Time");
	        else
	            System.out.println("Invalid Time");
	    }
	}

