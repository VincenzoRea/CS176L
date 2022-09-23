import java.util.Scanner;
public class HousePainting {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//Get all inputs
	System.out.print("Enter house length in feet:");
	double houseLength = sc.nextDouble();
	System.out.print("Enter house width in feet:");
	double houseWidth = sc.nextDouble();
	System.out.print("Enter house height in feet:");
	double houseHeight = sc.nextDouble();
	System.out.print("Enter the amount of winodws:");
	double windowTotal = sc.nextDouble();
	System.out.print("Enter the length of the the window feet:");
	double windowLength = sc.nextDouble();
	System.out.print("Enter the width of the winodw in feet:");
	double windowWidth = sc.nextDouble();
	System.out.print("Enter the number of doors:");
	double doorTotal = sc.nextDouble();
	System.out.print("Enter the length of the door in feet:");
	double doorLength = sc.nextDouble();
	System.out.print("Enter the width of the door in feet:");
	double doorWidth = sc.nextDouble();
	System.out.print("Enter how much the painter charges per SqFoot:");
	double pricePSF = sc.nextDouble();
	
	
	
			
	//Do calculations
	double windowDim = (windowLength * windowWidth * windowTotal);
	double doorDim = (doorLength * doorWidth * doorTotal);
	double totalMinus = (windowDim + doorDim);
	double normalSides =(houseLength * houseWidth)* 2;
	double peakSides = (0.5 *(houseLength*(houseHeight - houseWidth))) + (houseLength * houseWidth)*2;
	double totalAreaPaint = (normalSides + peakSides) - totalMinus;
	double priceCharged = (pricePSF +totalAreaPaint);
	
	
	
	
			
	
			
	//Output results
	System.out.print("Your paintable total area is " + totalAreaPaint);
	System.out.print("Your painter will charge: $" + priceCharged);
	
	
	

	}

}
