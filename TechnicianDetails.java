public class TechnicianDetails
{
	private String name;
	private String contactNumber;

	/*public TechnicianDetails(String Name, String ContactNumber)
	{
		this.Name=Name;
		this.ContactNumber=ContactNumber;

	}*/

	public TechnicianDetails()          // here we have declared default constructor of the class
	{
		this.name=null;
		this.contactNumber=null;
	}
	public TechnicianDetails(String Name, String ContactNumber)    // here we have parameterized  default constructor of the class
	{
		this.name=Name;
		this.contactNumber=ContactNumber;
	}

	public void setName(String Name)   //wrote set method for technician name to take value
	{
		this.name=Name;
	}
	public void setContactNumber(String ContactNumber)   //wrote set method for contact number of technician to take value
	{
		this.contactNumber=ContactNumber;
	}

	public String getName()   //wrote get method for technician name to take value
	{
		return this.name;
	}
	public String getContactNumber()   //wrote get method for contact number of technician to take value
	{
		return this.contactNumber;
	}
	@Override
	public String toString()       // Here, we have written toString method to return the String representation
	{
		return this.name;
	}

}