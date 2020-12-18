public class Entry
{
	private int entryNumber;
	private String entryDate;
	private InstlDetails installation;
	private Address adr;
	private static int curEntry=1;
	//private TechnicianDetails technician;
	//private ACdetails Ac;

	public Entry()   // here we have default declared constructor of the class
	{
		this.entryDate=null;
		this.installation=null;
		this.adr=null;
	}

	public Entry(String entryDate,InstlDetails installation,Address adr)  // here we have perameterized declared constructor of the class
	{
		this.entryDate=entryDate;
		this.installation =installation;
		this.adr=adr;
		setEntry();
	}

	public void setEntry()   //wrote set method for entry to take value
	{
		this.entryNumber=curEntry;
	}

	public void setentryDate(String entryDate)   //wrote set method for entry date to take value
	{
		this.entryDate=entryDate;
	}

	public void setInstlDetails(InstlDetails installation) //wrote set method for installation details to take value
	{
		this.installation=installation;
	}

	public void setAddress(Address adr)  //wrote set method for address to take value
	{
		this.adr=adr;
	}

	public String getentryDate()   //wrote get method for entry to take value
	{
		return this.entryDate;
	}
	public int getentryNumber()  //wrote get method for entry date to take value
	{
		return entryNumber;
	}
	public Address getAddress()   //wrote get method for address to take value
	{
		return this.adr;
	}
	public InstlDetails getInstlDetails()   //wrote get method for installation to take value
	{
		return this.installation;
	}
	public static int getcurEntry()
	{
		return curEntry++;
	}
    public String toString()       // Here, we have written toString method to return the String representation
    {
        return this.adr.showDetails() +" which was installed by " + this.installation.showInstlDetails();
    }

}