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
public class Property {
	
	private String propertyName;
	private String city;
	private String owner; 
	private double rentAmount; 
	private Plot plot;
	
	public Property() {
		this.propertyName="";
		this.city="";
		this.owner="";
		this.rentAmount=0.0;
		this.plot=new Plot(0,0,1,1);
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName=propertyName;
		this.city=city;
		this.owner=owner;
		this.rentAmount=rentAmount;
		this.plot=new Plot(0,0,1,1);
	}
	

	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName=propertyName;
		this.city=city;
		this.owner=owner;
		this.rentAmount=rentAmount;
		this.plot=new Plot(x,y,width,depth);
	}
	
	public Property(Property otherProperty) {
		this.propertyName=otherProperty.propertyName;
		this.city=otherProperty.city;
		this.owner=otherProperty.owner;
		this.rentAmount=otherProperty.rentAmount;
		this.plot=otherProperty.plot;
		
	}

	public String getPropertyName() {
		return propertyName;
	}

	public String getCity() {
		return city;
	}

	public String getOwner() {
		return owner;
	}

	public double getRentAmount() {
		return rentAmount;
	}


	public Plot getPlot() {
		return plot;
	}
	@Override
	public String toString() {
		
		return("" +propertyName+ "," +city+ "," +owner+ "," +rentAmount);
	}

}
