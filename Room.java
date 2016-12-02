
public abstract class Room {
	
	public String roomType;
	protected double roomPrice;
	
	public Room(){

	}

    public double getPrice() {
        return this.roomPrice;
    }

    public String getType() {
        return this.roomType;
    }

    public String getInfo() {
        String info = new String("    Rm. #: " + 
                "\nRoom Type: " + roomType +
                "\n    Price: " + roomPrice);
        return info;
    }

	
	
	
}
