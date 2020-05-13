package at.fhj.iit;

/**
 * @author RZ
 *This class adds some attributes fitting the term "coffee", generates constructors, getters and setters using those attributes
 *the purpose is not the code complexity but rather the usage of git(Hub) and JUnit
 */


public class Coffee extends Drink {
	
	// attributes
	
	private int intensity;
	private String origin;
	
	
	// constructors

	public Coffee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public Coffee(String name, int intensity, String origin) {
		super(name);
		this.intensity = intensity;
		this.origin = origin;
	}

	
	// getters and setters
	
	/**
	 * @return the intensity
	 */
	public int getIntensity() {
		return intensity;
	}

	/**
	 * @param intensity the intensity to set
	 */
	public void setIntensity(int intensity) {
		this.intensity = intensity;
	}

	/**
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * @param origin the origin to set
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	
	// methods from superclass

	@Override
	public double getVolume() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getAlcoholPercent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isAlcoholic() {
		// TODO Auto-generated method stub
		return false;
	}

}
