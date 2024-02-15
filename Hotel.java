package guviTask9;

import java.util.Scanner;

public class Hotel {

	public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month from 1st to 12th: ");
        int month = sc.nextInt();
        System.out.println("Enter the room rent per day: ");
        int roomRent = sc.nextInt();
        System.out.println("Enter the number of days stayed: ");
        int NumberOfdays = sc.nextInt();
        double totalRoomRent;
        switch (month) 
        {
            case 4:
            case 5:
            case 6:
            case 11:
            case 12:
                totalRoomRent = roomRent * 1.20 * NumberOfdays; 
                break;
            default:
                totalRoomRent = roomRent * NumberOfdays;
        }
        System.out.println("Total room rent: $" + totalRoomRent);
    }
}
