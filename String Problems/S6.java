package String_Problem;
import java.util.Scanner;
public class S6 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String str1 = sc.nextLine();
	        String str2 = sc.nextLine();
	        int result = str1.compareTo(str2);
	        if (result == 0) {
	            System.out.println("Equal");
	        } else if (result < 0) {
	            System.out.println(str1 + " < " + str2);
	        } else {
	            System.out.println(str1 + " > " + str2);
	        }
	        sc.close();
	    }
	}




