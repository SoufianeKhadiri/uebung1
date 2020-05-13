/**
 * 
 */
package at.fhj.iit;

/**
 * @author RZ
 **This class adds some attributes that you may expect for a coffee with alcohol, it generates constructors, getters and setters using those attributes
 *the purpose is not the code complexity but rather the usage of git(Hub) and JUnit
 *Date: 13.05.2020
 */

public class AlcoholicCoffee extends Coffee {
	
	// attributes
	
	private boolean hasAlcohol;
	private String alcoholType;
	
	
	// constructors

	public AlcoholicCoffee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public AlcoholicCoffee(String name, int intensity, String origin) {
		super(name, intensity, origin);
		// TODO Auto-generated constructor stub
	}

	public AlcoholicCoffee(String name, boolean hasAlcohol, String alcoholType) {
		super(name);
		this.hasAlcohol = hasAlcohol;
		this.alcoholType = alcoholType;
	}
	
	public AlcoholicCoffee(String name, int intensity, String origin, boolean hasAlcohol, String alcoholType) {
		super(name, intensity, origin);
		this.hasAlcohol = hasAlcohol;
		this.alcoholType = alcoholType;
	}
	
	
	// getters and setters

	/**
	 * @return the hasAlcohol
	 */
	public boolean isHasAlcohol() {
		return hasAlcohol;
	}

	/**
	 * @param hasAlcohol the hasAlcohol to set
	 */
	public void setHasAlcohol(boolean hasAlcohol) {
		this.hasAlcohol = hasAlcohol;
	}

	/**
	 * @return the alcoholType
	 */
	public String getAlcoholType() {
		return alcoholType;
	}

	/**
	 * @param alcoholType the alcoholType to set
	 */
	public void setAlcoholType(String alcoholType) {
		this.alcoholType = alcoholType;
	}
	
	
	// methods of the superclass

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
