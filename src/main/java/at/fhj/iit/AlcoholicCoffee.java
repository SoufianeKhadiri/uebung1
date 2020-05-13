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
	
	private boolean isDeadly;
	private String alcoholType;
	
	
	// constructors

	/**
	 * 
	 * @param name
	 */
	public AlcoholicCoffee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param name
	 * @param intensity
	 * @param origin
	 */
	public AlcoholicCoffee(String name, int intensity, String origin) {
		super(name, intensity, origin);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param name
	 * @param isDeadly
	 * @param alcoholType
	 */
	public AlcoholicCoffee(String name, boolean isDeadly, String alcoholType) {
		super(name);
		this.isDeadly = isDeadly;
		this.alcoholType = alcoholType;
	}
	
	/**
	 * 
	 * @param name
	 * @param intensity
	 * @param origin
	 * @param isDeadly
	 * @param alcoholType
	 */
	public AlcoholicCoffee(String name, int intensity, String origin, boolean isDeadly, String alcoholType) {
		super(name, intensity, origin);
		this.isDeadly = isDeadly;
		this.alcoholType = alcoholType;
	}
	
	
	// getters and setters

	/**
	 * @return the hasAlcohol
	 */
	public boolean isHasAlcohol() {
		return isDeadly;
	}

	/**
	 * @param hasAlcohol the hasAlcohol to set
	 */
	public void setHasAlcohol(boolean hasAlcohol) {
		this.isDeadly = hasAlcohol;
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
	
	
	// own methods
	/**
	 * just a little joke about the fact that too many alcoholic / deadly drinks reduce lifetime :)
	 * @param numberOfDeadlyDrinks
	 */
	public void calcutateTimeToLive(int numberOfDeadlyDrinks) {
		int percentOfLifeTime = 100;
		int timeToLive;
		try {
			timeToLive = percentOfLifeTime / numberOfDeadlyDrinks;
			System.out.println("If you drink too many deadly drinks, you have less lifetime left. You drank " + numberOfDeadlyDrinks + " and you have " + timeToLive + " years left. So don't overdoo it!!");
		}
		catch(ArithmeticException e) {
			System.out.println("Didn't the prof tell you 100 times not to divide my zero?!!");
		}
	}
}
