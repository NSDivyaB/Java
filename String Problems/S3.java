package String_Problem;
import java.util.Scanner;
public class S3 {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			String str=in.nextLine();
			boolean found=false;
			char find = in.nextLine().charAt(0);
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)==find) {
					found=true;
				}	
			}
			if(found) {
				System.out.println("Found");
			}
			else {
				System.out.println("Not Found");
			}
			
			in.close();
		}

	}

