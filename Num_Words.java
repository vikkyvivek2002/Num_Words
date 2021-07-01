import java.util.*;

public class Num_Words
 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a string :");
		
		String a =s.nextLine();

        String b[] = a.split(" ") ;
         System.out.println("No of words = " + b.length);
		 
		
	
	}
}
