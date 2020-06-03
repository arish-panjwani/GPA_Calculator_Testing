import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidatePRNTest {
	
	@Test
	void testValidatePRN_Valid() {
		GPACalculation gpa = new GPACalculation();
		String PRN = "71630506C";
		boolean result = gpa.validatePRN(PRN);
		assertTrue(result);
	}
	
	@Test
	void testValidatePRN_NotValid() {
		GPACalculation gpa = new GPACalculation();
		String PRN = "71630506";
		boolean result = gpa.validatePRN(PRN);
		assertFalse(result);
	}
}