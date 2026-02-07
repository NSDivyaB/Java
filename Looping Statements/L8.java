package looping_statement;
import java.util.Scanner;
public class L8 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number:");
	        int n = sc.nextInt();
	        if (n <= 1) {
	            System.out.println("Not Prime");
	            return;
	        }
	        boolean prime = true;
	        for (int i = 2; i <= n / 2; i++) {
	            if (n % i == 0) {
	                prime = false;
	                break;
	            }
	        }
	        if (prime)
	            System.out.println("Prime");
	        else
	            System.out.println("Not Prime");
	    }
	}


