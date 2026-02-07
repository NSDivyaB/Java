package looping_statement;
import java.util.Scanner;
public class L6 {
	    static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++)
	            fact *= i;
	        return fact;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int count = sc.nextInt();
	        int sum = 0;
	        for (int i = 0; i < count; i++) {
	            int num = sc.nextInt();
	            sum += factorial(num);
	        }
	        System.out.println(sum);
	    }
	}


