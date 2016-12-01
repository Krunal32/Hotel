
public class Customer {

    protected String firstName;
    protected String lastName;
    protected String phoneNumber;
    private String email;
    
    public Customer() {
        this.firstName = null;
        this.lastName = null;
        this.phoneNumber = null;
        this.email = null;
    }
  
    
    public Customer(String fName, String lName, String phNum, String mail){
    	this.firstName=fName;
    	this.lastName=lName;
    	this.phoneNumber=phNum;
    	this.email=mail;
    }
	
    
    public String getInfo() {
        String info = new String(" Name: " + firstName + " " + lastName + "" +
        "\n Phone #: "+ phoneNumber + 
        "\n E-Mail: " + email);
        return info;
    }
    
    public String getfirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public String getEmail() {
        return this.email;
    }
    
    public void setFname(String fn) {
        this.firstName = fn;
    }
    
    public void setLname(String ln){
    	this.lastName = ln;
    }
    
    public void setPhoneNumber(String n) {
        this.phoneNumber = n;
    }
    
    public void setEmailAddress(String e) {
        this.email = e;
    }
    
    
}
