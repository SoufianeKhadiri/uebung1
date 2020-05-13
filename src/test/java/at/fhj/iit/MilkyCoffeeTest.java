package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


	@DisplayName("Testing MilkyCoffee implementation")
	public class MilkyCoffeeTest  {
		private MilkyCoffee MC;

		/**
		 * inits an alcoholic and nonalcoholic liquid for EACH test
		 */
		
	
		
		@BeforeEach
		void setup() {
			// SETUP PHASE
			MC= new MilkyCoffee ("THE MIlky One");
			
		}

}
