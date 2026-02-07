package String_Problem;
import java.util.Scanner;
public class S2 {
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			String str=in.nextLine();
			int count=0;
			for(char s:str.toCharArray()) {
				count++;
			}
			System.out.println(count);
			in.close();
		}

	}













	

