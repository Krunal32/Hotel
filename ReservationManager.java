import java.util.ArrayList;

public class ReservationManager {

    static ArrayList<Customer> customer_details = new ArrayList<Customer>();
    static ArrayList<Reservation> reservation_list = new ArrayList<Reservation>();;
   

	public void getCustomerInfo()
	{
		String fName, lName, email, phoneNumber;
		
		
		System.out.print("\nEnter first name of guest: ");
		fName = IO.readString();
				
		System.out.print("Enter last name: ");
		lName = IO.readString();
		System.out.print("Enter your email address: ");
		email = IO.readString();
		System.out.print("Enter your phone number: ");
		phoneNumber = IO.readString();

		Customer newCustomer = new Customer(fName, lName, phoneNumber, email);
		//customer_details.add(newCustomer);
		customer_details.add(newCustomer);
		System.out.println(newCustomer.getInfo());
		System.out.println("customer added");	
	}
	
	static void createReservation(String email)
	{
		
		for(Customer x : customer_details){
			if(x.getEmail().equalsIgnoreCase(email)){
				System.out.println("EamilFound");
				
				System.out.println("How many days will you be staying?");
				int days = IO.readInt();
				
				System.out.println("Please select a room type (1.Single, 2.Double, 3.Suite): ");
				int roomOption = IO.readInt();
				
				if(roomOption == 1){
					Single s = new Single();
					
					System.out.println(x.getInfo());
					System.out.println(s.getInfo());
					System.out.println(days);
					
					Reservation reserved = new Reservation(x, s, days);
					
					
					
					reservation_list.add(reserved);
					System.out.println(reserved.getInfo());
				}
				if(roomOption == 2){
					Dbl d = new Dbl();
					Reservation reserved = new Reservation(x, d, days);
					reservation_list.add(reserved);
					System.out.println(reserved.getInfo());
				}
				if(roomOption == 3){
					Suite st = new Suite();
					Reservation reserved = new Reservation(x, st, days);
					reservation_list.add(reserved);
					System.out.println(reserved.getInfo());
					
				}

				
			}
		}
		
	}
	public void showCurrentProfile(){
		for (Customer profile : customer_details){
			System.out.println(profile.getInfo());
		}
	}
	
	public void showCurrent(){
		
	 for (Reservation show : reservation_list){
		 System.out.println(show.getInfo());
		 
	 }
		System.out.println(reservation_list);
	}
}
		
	/*
	static Room lookupResv(String name, ArrayList<Reservation> resvs)
	{
		for (int i = 0 ; i < resvs.size(); i++) {
			Room hr = (Room)resvs.get(i);

			if (hr.getGuestName().equalsIgnoreCase(name)) {
				return hr;
			}
		}
		
		return null;
	}
	
	
	static void changeResv(ArrayList<Reservation> resvs)
	{
		Room hr;
		String guestname, roomtype;
		int resvlength;
		
		System.out.print("\nEnter name of guest: ");
		guestname = IO.readString();
		hr = lookupResv(guestname, resvs);
		if (hr == null) {
			System.out.println("\nYou have not yet made a reservation.");
			return;
		}

		while (true) {
			System.out.println("\nReservation for " + guestname + ":");
			System.out.println("Room type: \"" + hr.getRoomType() + "\"");
			System.out.println("Length: " + hr.getReservationLength() + " days");
			System.out.println("Estimated price: $" + hr.getEstimatedPrice());
			
			System.out.println("\nChange Reservation menu:");
			System.out.println("1 - Change room type");
			System.out.println("2 - Change reservation length");
			System.out.println("3 - Return to main menu");
			System.out.println("4 - Quit");

 			System.out.print("\nEnter choice: ");
			int choice = IO.readInt();

			switch (choice) {

				case 1:
					System.out.print("\nEnter type of room: ");
					roomtype = IO.readString();
					hr.setRoomType(roomtype);
					break;
					
				case 2:
					System.out.print("\nEnter reservation length (in days): ");
					resvlength = IO.readInt();
					hr.setReservationLength(resvlength);
					break;
					
				case 3:
					return;
					
				case 4:
					System.exit(0);
					
			}
		}
	}
	
		static void checkOut(ArrayList<Reservation> resvs)
		{
		HotelRoom hr;
		String guestname, roomtype;
		int days;
		
		System.out.print("\nEnter name of guest: ");
		guestname = IO.readString();
		hr = ReservationManager.lookupResv(guestname, resvs);
		if (hr == null) {
			System.out.println("\nYou have not yet made a reservation.");
			return;
		}

		System.out.print("Enter actual number of days stayed: ");
		days = IO.readInt();

		System.out.println("\nPrice at checkout: $" + hr.getActualPrice(days));
		resvs.remove(hr);
		}
	*/

