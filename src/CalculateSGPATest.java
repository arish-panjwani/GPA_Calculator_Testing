import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateSGPATest {

	@Test
	void testCalculateSGPA() {
		GPACalculation gpa = new GPACalculation();
		double sgpa=5.913043478260869;
		double checksgpa= gpa.calculateSGPA(272);
		assertEquals(sgpa, checksgpa);
	}
	
	@Test
	void testCalculateSGPA_forZero() {
		GPACalculation gpa = new GPACalculation();
		double sgpa=0;
		double checksgpa= gpa.calculateSGPA(0);
		assertEquals(sgpa, checksgpa);
	}

}
