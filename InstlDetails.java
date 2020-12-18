public class InstlDetails /* Herer InstlDetails means installation details */ extends TechnicianDetails //here instlDetails class also extends from the TechnicianDetails which make aggregation
{                                                         // that means installation details has a technician details in this way it make a sence
	private String startDate;
	private String endDate;

	/*public InstlDetails(String startDate, String endDate, String Name, String ContactNumber )
	{
		super(Name, ContactNumber);
		this.startDate=startDate;
		this.endDate=endDate;
	}*/

	public InstlDetails() // here we have declared default constructor of the class

	{
		super();
		this.startDate=null;
		this.endDate=null;
	}
	public InstlDetails(String name,String contactNumber,String startDate,String endDate)   // here we have declared perameterized constructor of the class
	{
		super(name,contactNumber);
		this.startDate=startDate;
		this.endDate=endDate;
	}

	public void setstartDate(String startDate)  //wrote set method for start date to take value
	{
		this.startDate=startDate;
	}
	public void setendDate(String endDate)   //wrote set method for end date to take value
	{
		this.endDate=endDate;
	}
	/*public void setName(String Name)
	{
		super.setName(Name);
	}
	public void setcontactNumber(String Number)
	{
		super.setContactNumber(Number);
	}*/

	public String getstartDate()    //wrote get method for start date to take value
	{
		return this.startDate;
	}
	public String getendDate()    //wrote get method for enddate to take value
	{
		return this.endDate;
	}
	/*public String getName()
	{
		return super.getName();
	}
	public String getcontactNumber()
	{
		return super.getContactNumber();
	}*/

	public String showInstlDetails()
	{
		return "\n Technician Name: " + getName() + "\n Contact Number: " + getContactNumber() + "\n Staring Date: " + getstartDate() + "\n Ending Date" + getendDate();
	}
}