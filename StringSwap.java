package guviTask9;

public class StringSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "HARISH";
		String reverse = "";
	   
	    int length = original.length();

	    for (int i = length - 1 ; i >= 0 ; i--)
	      reverse = reverse + original.charAt(i);

	    System.out.println("Reverse of the string: " + reverse);
	}

}
