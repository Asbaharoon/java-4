import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String");
		s.append(scanner.nextLine());
		String ck=s.toString();
		//System.out.println("The reverse of the String is");
		//System.out.println(s.reverse().toString());
       //System.out.println(s.toString());
		if(s.reverse().toString().equals(ck)){
    	   System.out.println("Palindrome");
       }
       else{
    	   System.out.println("Non Palindrome");
       }
		
		
		scanner.close();

	}

}
