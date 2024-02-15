package guviTask9;

public class Pattern2 {

	public static void main(String[] args) 
	      {
		// TODO Auto-generated method stub
		int size = 5; // Size of the pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || i + j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
