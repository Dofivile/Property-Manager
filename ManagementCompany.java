/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 11/09/2022
 * Platform/compiler:
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Robel Endashaw
*/


public class ManagementCompany {
	
	public final int MAX_PROPERTY = 5;
	public final int MGMT_WIDTH = 10;
	public final int	MGMT_DEPTH = 10;
	private String name;
	private String taxID;
	private Property[] properties;
	private double mgmFee;
	private Plot plot;
	


	public ManagementCompany(){
		this.name = "";
		this.taxID = "";
		this.plot = new Plot(0, 0, 1, 1);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(0, 0, MGMT_WIDTH, MGMT_DEPTH);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(String name, String taxID, double mgmFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFee = mgmFee;
		this.plot = new Plot(x, y, width, depth);
		this.properties = new Property[MAX_PROPERTY];
	}

	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFee = otherCompany.mgmFee;
		this.plot = otherCompany.plot;
		this.properties = otherCompany.properties;
	}

	
	
	public int addProperty(Property property) 
	{
		int index = 0;
		
		
		if (isPropertiesFull())
		{
			index = -1;
		}
		
		else if(property == null)
		{
			return -2;
		}
		
		if(!plot.encompasses(property.getPlot()))
		{
			return -3;
		}

		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				Property house = new Property(property);
				
				properties[i] = house;
				index = i;
				break;
			}
			
			else if (properties[i].getPlot().overlaps(property.getPlot()))
			{
				index = -4;
				break;
			}
			
		}
		
		
		return index;
	}

	public int addProperty(String name, String city, double rent, String owner) 
	{
		Property property = new Property(name, city, rent, owner);
		int index = 0;
		
		
		if (isPropertiesFull())
		{
			index = -1;
		}
		
		else if(property == null)
		{
			return -2;
		}
		
		if(!plot.encompasses(property.getPlot()))
		{
			return -3;
		}
		
		

		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				Property house = new Property(property);
				
				properties[i] = house;
				index = i;
				break;
			}
			
			else if (properties[i].getPlot().overlaps(property.getPlot()))
			{
				index = -4;
				break;
			}
			
		}
		
		
		return index;
	}

	public int addProperty(String name, String city, double rent, String owner, int x, int y, int width, int depth) 
	{

		
		Property property = new Property(name, city, rent, owner, x, y, width, depth);
		int index = 0;
		
		
		if (isPropertiesFull())
		{
			index = -1;
		}
		
		else if(property == null)
		{
			return -2;
		}
		
		if(!plot.encompasses(property.getPlot()))
		{
			return -3;
		}
		
		

		for(int i = 0; i < properties.length; i++)
		{
			if(properties[i] == null)
			{
				Property house = new Property(property);
				
				properties[i] = house;
				index = i;
				break;
			}
			
			else if (properties[i].getPlot().overlaps(property.getPlot()))
			{
				index = -4;
				break;
			}
			
		}
		
		return index;
	}
	
	public void removeLastProperty()
	{
		properties[properties.length - 1] = null;
	}
	
	public boolean isPropertiesFull()
	{
		return (properties.length == MAX_PROPERTY);
	}
	
	public int getPropertiesCount()
	{
		int count = 0;
		
		for(int i = 0; i < properties.length; i++) {
			if(properties[i] != null){
			count ++;
			}
		}
		return count;
	}
	
	
	public double getTotalRent() 
	{
		double sum = 0.0;
		
		for (int i = 0; i < properties.length; i++) 
		{
			if(properties[i]!=null)
				sum += properties[i].getRentAmount();
		}
		
		return sum;
	}
	
	
	public Property getHighestRentPropperty()
	{
		int maxIndex = 0;
		double maxRent = properties[0].getRentAmount();
		
		for (int i = 0; properties[i] != null && i < properties.length; i++) 
		{
			if (properties[i].getRentAmount() > maxRent)
			{
				maxRent = properties[i].getRentAmount();
				maxIndex = i;
			}
		}
		return (properties[maxIndex]);
		
		
	}
	
	public boolean isMangementFeeValid()
	{
	
		return(mgmFee >= 0 && mgmFee <= 100);
			
		
		
	}

	
	public String getName() 
	{
		return name;
	}

	
	public String getTaxID() 
	{
		return taxID;
	}
	
	public Property[] getProperties() 
	{

		Property[] p = new Property[properties.length];
		
		for (int i = 0; i < properties.length; i++)
			p[i] = properties[i];

		return p;

	}
	
	public double getmgmFeePer()
	{
		return mgmFee;
	}
	

	public Plot getPlot() 
	{
		return new Plot(plot);
	}

	public int getMAX_PROPERTY() 
	{
		return MAX_PROPERTY;
	}

	public String toString() 
	{
		String s = "List of the properties for " + getName() + ", taxID: " + getTaxID() + "\n";
		s +=  "_______________________________________\n";
		for(int i = 0; i < properties.length; i++) {
			if(properties[i]!=null) {
			s += properties[i].toString() + "\n";
		}
		}
		s +=  "________________________________________\n";
		
		s += "\nTotal management fee: " + ((getTotalRent() * mgmFee) / 100);
		

		return s;
	}

}



