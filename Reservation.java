
public class Reservation {

	protected Customer customer;
	protected Room room;
	protected int days;
	
	
	public Reservation() {
		this.customer = null;
		this.room = null;
		this.days = 0;
	}
	
	public Reservation(Customer cust, Room rm, int resvDays){
		this.customer=cust;
		this.room=rm;
		this.days=resvDays;
	}
	
    public String getInfo() {
        String info = new String("     Name: " + customer.firstName + "" + customer.lastName +
        "\nRm. type: " + room.roomType +
        "\n     Rm. #: " + room.roomNumber +
        "\n      Price: $" + room.roomPrice + " per night" +
        "\n   Lengeth of Stay: " + days + " day(s)");
        return info;
    }
	
}