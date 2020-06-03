import java.util.Scanner;

public class GPACalculation {

	final static double Total_Credits = 46;
	final static double convert = 8.8;
	
	private long Earned_Credits;
	private double SGPA;
	private double percentage;
	private static String PRN;
	private static double Crd_pts;
	
	public static void main(String[] args) {

		System.out.println("\nWelcome to GPA calculation Screen for TE-Computers! \n");
		System.out.println("Please enter your PRN number:");
		Scanner sc = new Scanner(System.in);
		PRN = sc.next();
		System.out.println("\nEnter your Credit points (Sum of the last column in your Report): ");
		sc = new Scanner(System.in);
		Crd_pts = sc.nextInt();
		sc.close();
		
		GPACalculation gpCal = new GPACalculation();
		if(gpCal.validatePRN(PRN)) {
			gpCal.calculateGPA(Crd_pts);
		}else {
			System.out.println("As PRN not valid Existing from system.");
		}
	}

	boolean validatePRN(String PRN_NUMBER) {
		int prnLen = PRN_NUMBER.length(); 
		if(prnLen == 9) {
			System.out.println("\nPRN Number Validated \n");
			return true;
		}else {
			System.out.println("PRN is not valid. Please Enter valid 9 digit PRN. \n");
			return false;
		}
	}

	void calculateGPA(double Crd_pts) {
		System.out.println("Total Credits that can be earned are " + Total_Credits + "\n");
		double SGPA = calculateSGPA(Crd_pts);
		calculatepercentage(SGPA);
	}

	void calculatepercentage(double SGPA) {
		double percentage = SGPA * convert;
		percentage=Math.round(percentage*100.0)/100.0;
		System.out.println("Percentage is " + percentage + "\n");
		displayDetails(percentage);
	}
	
	void displayDetails(double percentage) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("      ******************************** Result Details *********************************   ||");
		sb.append("\n\n");
		sb.append(String.format("%2s", "PRN Number "));
		sb.append(String.format("%20s", "Credit Points "));
		sb.append(String.format("%15s", "GPA"));
		sb.append(String.format("%30s", "Percentage"));
		sb.append("\n\n");
		sb.append("------------------------------------------------------------------------------------------||");
		sb.append("\n\n");
		sb.append(String.format("%2s", PRN));
		sb.append(String.format("%15s", Crd_pts));
		SGPA=Math.round(SGPA*100.0)/100.0;
		sb.append(String.format("%23s", SGPA));
		sb.append(String.format("%25s", percentage));
		sb.append("\n\n");
		sb.append("------------------------------------------------------------------------------------------||");
		System.out.println(sb.toString());
	}

	
	
	double calculateSGPA(double Crd_pts) {
		SGPA = (Crd_pts / Total_Credits);
		return SGPA;
	}
	

	public double getSGPA() {
		return SGPA;
	}

	public void setSGPA(double sGPA) {
		SGPA = sGPA;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public static String getPRN() {
		return PRN;
	}

	public static void setPRN(String pRN) {
		PRN = pRN;
	}

	public static double getCrd_pts() {
		return Crd_pts;
	}

	public static void setCrd_pts(double Crd_pts) {
		GPACalculation.Crd_pts = Crd_pts;
	}

	public static double getTotal_Credits() {
		return Total_Credits;
	}
}


