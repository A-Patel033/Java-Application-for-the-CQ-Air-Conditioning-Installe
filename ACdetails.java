public class ACdetails  //here we have created class
{
	private double  horse_power = 5.0;
    private int zones = 2;
    private int outlets = 2;

    /*public ACdetails(double  Horse_power, int Zones, int Outlets)
    {
		this.Horse_power=Horse_power;
		this.Zones=Zones;
		this.Outlets=Outlets;
	}*/
	public ACdetails()   // here we have default declared constructor of the class
    {
    	this.horse_power=5.0;
    	this.zones=2;
    	this.outlets=2;
    }
    public ACdetails(double hp, int zones, int outlets)  // here we have perameterized declared constructor of the class
    {
    	this.horse_power=hp;
    	this.zones=zones;
    	this.outlets=outlets;
    }
    public void setHorse_power(double Horse_power)    //wrote set method for horse power to take value
    {
    	this.horse_power=Horse_power;
    }
    public void setZones(int Zones)     //wrote set method for Zones to take value
    {
    	this.zones=Zones;
    }
    public void setOutlets(int Outlets)    //wrote set method for outlets to take value
    {
    	this.outlets=Outlets;
    }
    public double getHorse_power()   //wrote get method for horse power to take value
    {
    	return this.horse_power;
    }
    public int getZones()        //wrote get method for Zones to take value
    {
    	return this.zones;
    }
    public int getOutlets()    //wrote get method for outlets to take value
    {
    	return this.outlets;
    }
    @Override
    public String toString()    // Here, we have written toString method to return the String representation
    {
    	return "";
    }
}