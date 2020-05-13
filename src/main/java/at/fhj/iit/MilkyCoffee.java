/**
 * 
 */
package at.fhj.iit;

/**
 * @author RZ
 *This class adds some attributes that you may expect for a coffee with milk, it generates constructors, getters and setters using those attributes
 *the purpose is not the code complexity but rather the usage of git(Hub) and JUnit
 *Date: 13.05.2020
 */

public class MilkyCoffee extends Coffee {
	
	// attributes
	
	private String milkType;
	
	
	// constructors

	/**
	 * 
	 * @param name
	 */
	public MilkyCoffee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param intensity
	 * @param origin
	 */
	public MilkyCoffee(String name, int intensity, String origin) {
		super(name, intensity, origin);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name
	 * @param milkType
	 */
	public MilkyCoffee(String name, String milkType) {
		super(name);
		this.milkType = milkType;
	}
	
	/**
	 * @param name
	 * @param intensity
	 * @param origin
	 * @param milkType
	 */
	public MilkyCoffee(String name, int intensity, String origin, String milkType) {
		super(name, intensity, origin);
		// TODO Auto-generated constructor stub
		this.milkType = milkType;
	}
	
	
	// getters and setters
	
	/**
	 * @return the milkType
	 */
	public String getMilkType() {
		return milkType;
	}

	/**
	 * @param milkType the milkType to set
	 */
	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}

	
	// methods from superclass
	
	@Override
	public int getIntensity() {
		// TODO Auto-generated method stub
		return super.getIntensity();
	}

	@Override
	public void setIntensity(int intensity) {
		// TODO Auto-generated method stub
		super.setIntensity(intensity);
	}

	@Override
	public String getOrigin() {
		// TODO Auto-generated method stub
		return super.getOrigin();
	}

	@Override
	public void setOrigin(String origin) {
		// TODO Auto-generated method stub
		super.setOrigin(origin);
	}

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return super.getVolume();
	}

	@Override
	public double getAlcoholPercent() {
		// TODO Auto-generated method stub
		return super.getAlcoholPercent();
	}

	@Override
	public boolean isAlcoholic() {
		// TODO Auto-generated method stub
		return super.isAlcoholic();
	}

	
}
