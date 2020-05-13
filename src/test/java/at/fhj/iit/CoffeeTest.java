package at.fhj.iit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


	@DisplayName("Testing Coffe implementation")
	public class CoffeeTest {
		private Coffee C ;

		/**
		 * inits an Coffe liquid 
		 */
		
		@BeforeEach
		void setup() {
			// SETUP PHASE
		    C = new Coffee("arabica", 5, "oman");
			
		}

		@Test
		@DisplayName("Testing constructor ")
		public void testConstructorNonAlcoholic(){
			assertEquals(C.getIntensity(), 5);
			assertEquals(C.getOrigin(), "oman");
			assertEquals(C.getAlcoholPercent(), 0, 0.001);
			assertEquals(C.isAlcoholic(), false);
			assertEquals(C.getVolume(), 0.5,0.006);
		}
		
		
		
}
