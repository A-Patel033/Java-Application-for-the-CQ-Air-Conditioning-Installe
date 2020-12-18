public class Address /* the class name Address means Bulding Details*/ extends  ACdetails //here address class was extends from the ACdetails class which make aggregation
{                                                                                         //that means Address (Bulding Details) has a AC installation details
	private String adrsOfInstl;   //ADdrsOfInstl menas Bulding address where we are going to installation

	/*public Address(String AdrsOfInstl, double  Horse_power, int Zones, int Outlets)
	{
		super(Horse_power, Zones, Outlets);
		this.AdrsOfInstl=AdrsOfInstl;
	}*/
	public Address() // here we have default declared constructor of the class
	{
		super();
		this.adrsOfInstl=null;
	}
	public Address(double hp,int zones,int outlets,String adrsOfInstl)  // here we have perameterized declared constructor of the class
	{
		super(hp,zones,outlets);
		this.adrsOfInstl=adrsOfInstl;
	}

	public void setAdrsOfInstl(String AdrsOfInstl)  //wrote set method for address of installation to take value
	{
		this.adrsOfInstl=AdrsOfInstl;
	}
	public String getAdrsOfInstl() //wrote get method for address of installation to take value
	{
		return this.adrsOfInstl;
	}
	public String showDetails()
	{
		return ("\n" + " Address Of Installation: " + this.getAdrsOfInstl() + "\n Installation Horse Power: " + super.getHorse_power()+ "\n Installation Zones: " +
		super.getZones()+ "\n Installation Outlets: "  + super.getOutlets());
	}
}