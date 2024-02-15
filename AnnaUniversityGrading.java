package guviTask9;

import java.util.Scanner;

public class AnnaUniversityGrading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks: ");
        int marks = sc.nextInt();
        String grade = GradeCalc(marks);
        System.out.println("Grade: " + grade);
    }
    public static String GradeCalc(int marks) {
        if (marks > 100) 
        {
            return "Invalid Input";
        }
        else if (marks >= 90)
        {
            return "A";
        } 
        else if (marks >= 80) 
        {
            return "B";
        } 
        else if (marks >= 70)
        {
            return "C";
        } 
        else if (marks >= 60)
        {
            return "D";
        } 
        else if (marks >= 50)
        {
            return "E";
        } 
        else
        {
            return "F";
        }
    }
	}


