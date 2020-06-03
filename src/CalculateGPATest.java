import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateGPATest {

	@Test
	void testCalculateGPA() {

			GPACalculation gpa = new GPACalculation();
			gpa.setPRN("71630506C");
			gpa.setCrd_pts(272);
			gpa.calculateGPA(gpa.getCrd_pts());
			assertNotNull("GPA is ", gpa.getSGPA());
	
	}
}