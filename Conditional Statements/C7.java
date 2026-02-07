package Conditional_statement;
import java.util.Scanner;
public class C7 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the date:");
	        int d = sc.nextInt();
	        System.out.println("Enter the month:");
	        int m = sc.nextInt();
	        System.out.println("Enter the year:");
	        int y = sc.nextInt();
	        boolean valid = true;
	        if (m < 1 || m > 12)
	            valid = false;
	        else if (d < 1)
	            valid = false;
	        else if (m == 2) {
	            boolean leap = (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0));
	            if (leap && d > 29) valid = false;
	            if (!leap && d > 28) valid = false;
	        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
	            if (d > 30) valid = false;
	        } else {
	            if (d > 31) valid = false;
	        }
	        if (valid)
	            System.out.println("Valid Date");
	        else
	            System.out.println("Invalid Date");
	    }
	}


