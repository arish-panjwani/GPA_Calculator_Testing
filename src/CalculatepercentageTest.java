import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatepercentageTest {

	@Test
	void testCalculatepercentage() {
		GPACalculation gpa = new GPACalculation();
		gpa.setSGPA(5.913043478260869);
		gpa.setCrd_pts(272);
		gpa.setPRN("71630506C");
		gpa.calculatepercentage(gpa.getSGPA());
		assertNotNull("Percentage is ", gpa.getPercentage());
	}
}
