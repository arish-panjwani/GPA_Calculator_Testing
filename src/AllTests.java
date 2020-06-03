import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
	@Test
	void testMain() {
		GPACalculation gpa = new GPACalculation();
		gpa.setSGPA(5.913043478260869);
		gpa.setPRN("71630506C");
		gpa.setCrd_pts(272);
		gpa.calculateGPA(gpa.getCrd_pts());
		gpa.calculatepercentage(gpa.getSGPA());
	}

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

	@Test
	void testCalculateGPA() {

			GPACalculation gpa = new GPACalculation();
			gpa.setPRN("71630506C");
			gpa.setCrd_pts(272);
			gpa.calculateGPA(gpa.getCrd_pts());
			assertNotNull("GPA is ", gpa.getSGPA());
	
	}

	@Test
	void testCalculatepercentage() {
		GPACalculation gpa = new GPACalculation();
		gpa.setSGPA(5.913043478260869);
		gpa.setCrd_pts(272);
		gpa.setPRN("71630506C");
		gpa.calculatepercentage(gpa.getSGPA());
		assertNotNull("Percentage is ", gpa.getPercentage());
	}

	@Test
	void testDisplayDetails() {
		GPACalculation gpa = new GPACalculation();
		gpa.setSGPA(5.913043478260869);
		gpa.setPRN("71630506C");
		gpa.setCrd_pts(272);
		gpa.setPercentage(52.03);
		gpa.displayDetails(gpa.getPercentage());
	}

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
