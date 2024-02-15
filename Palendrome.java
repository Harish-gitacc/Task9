package guviTask9;

public class Palendrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "TENET"; 
		String reverse = ""; 
		int length = original.length();
        for (int i = length - 1; i >= 0; i--) 
        reverse = reverse + original.charAt(i);

        if (original.equals (reverse))
        	System.out.println("Entered string is a palindrome.");
        else
            System.out.println("Entered string not a palindrome.");
	}

}
