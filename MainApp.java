import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    static Room[] room_list;
    static ArrayList<Reservation> reservation_list;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	
		
	      	room_list = new Room[20];
	        reservation_list = new ArrayList<Reservation>();
	        for (int i = 0; i < room_list.length; i++) {
	            if (i < 5) {
	                room_list[i] = new Single(100 + i);
	            }
	            else if (i < 10) {
	                room_list[i] = new Double(200 + (i-5));
	            }
	            else if (i < 15) {
	                room_list[i] = new Suite(300+(i-10));
	            }     
	        }
	    
		
		
		while (true) {
			System.out.println("\nTest menu:");
			System.out.println("1 - Make new reservation");
			System.out.println("2 - View/change existing reservation");
			System.out.println("3 - Check out of hotel");
			System.out.println("4 - quit");

 			System.out.print("\nEnter choice: ");
			int choice = IO.readInt();

			switch (choice) {

				case 1:
					ReservationManager.makeNewResv(reservation_list);
					break;
				
				case 2:
					ReservationManager.changeResv(resvs);
					break;
				
				case 3:
					ReservationManager.checkOut(resvs);
					break;
					
				case 4:
					System.out.println("GoodBye!");
					return;
					
			}
		}
	        
	}
}
