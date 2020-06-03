import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DisplayDetailsTest {
	
	@Test
	void testDisplayDetails() {
		GPACalculation gpa = new GPACalculation();
		gpa.setSGPA(5.913043478260869);
		gpa.setPRN("71630506C");
		gpa.setCrd_pts(272);
		gpa.setPercentage(52.03);
		gpa.displayDetails(gpa.getPercentage());
	}
}
