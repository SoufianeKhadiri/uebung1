package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


	@DisplayName("Testing SimpleDrink implementation")
	public class SimpleDrinkTest  {
		private SimpleDrink SD;

		/**
		 * inits an alcoholic and nonalcoholic liquid for EACH test
		 */
		
		Liquid l = new Liquid("softy",2,3);
		
		@BeforeEach
		void setup() {
			// SETUP PHASE
			SD= new SimpleDrink("softy",l);
			
		}

		@Test
		@DisplayName("Testing constructor")
		public void testConstructorNonAlcoholic(){	
			assertEquals(SD.getVolume(), 0.5, 0.006);
			assertEquals(SD.getAlcoholPercent(), 0, 0.001);
		
		}

		

		}

