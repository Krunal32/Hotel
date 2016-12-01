
public abstract class Room {
	
	public String roomType;
	protected int roomNumber;
	protected double roomPrice;
	
	
    public int getRmNumber() {
        return this.roomNumber;
    }

    public double getPrice() {
        return this.roomPrice;
    }

    public void setRmNumber(int r) {
        this.roomNumber = r;
    }

    public String getInfo() {
        String info = new String("    Rm. #: " + roomNumber + 
                "\nRoom Type: " + roomType +
                "\n    Price: " + roomPrice);
        return info;
    }

	
	
	
}
