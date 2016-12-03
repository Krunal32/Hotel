import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    //static Room[] room_list;
    static ArrayList<Customer> customer_details;
    static ArrayList<Reservation> reservation_list;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ReservationManager rm = new ReservationManager();
	Customer customer = new Customer();
	
		
		while (true) {
			System.out.println("\nTest menu:");
			System.out.println("1 - Create a Profile");
			System.out.println("2 - Create Reservation");
			System.out.println("3 - Display Currey Reservation");
			System.out.println("4 - Display Profiles");

 			System.out.print("\nEnter choice: ");
			int choice = IO.readInt();

			switch (choice) {

				case 1:
				rm.getCustomerInfo();
				break; 
				
				case 2:
				System.out.println("Enter your email: ");
				String email =IO.readString();
				ReservationManager.createReservation(email);
				break;
				
				case 3:
					rm.showCurrent();
					break;
				case 4:
					rm.showCurrentProfile();
					break;
					//System.out.println("Customer added");
			
			/*	case 2:
					ReservationManager.changeResv(reservation_list);
					break;
				
				case 3:
					ReservationManager.checkOut(reservation_list);
					break;
					
				case 4:
					System.out.println("GoodBye!");
					return;
			*/		
			}
		}
	        
	}
}
