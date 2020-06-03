import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GPACalculationMainTest {

	@Test
	void testMain() {
		GPACalculation gpa = new GPACalculation();
		gpa.setSGPA(5.913043478260869);
		gpa.setPRN("71630506C");
		gpa.setCrd_pts(272);
		gpa.calculateGPA(gpa.getCrd_pts());
		gpa.calculatepercentage(gpa.getSGPA());
	}
}