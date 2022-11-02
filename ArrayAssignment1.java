import java.io.*;
import java.util.Arrays;

public class ArrayAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double values[] = {25.3, 100, -10, -1.5, 13, 98.6, 17, 123.145, 125.6, 123.146};
		System.out.println(Arrays.toString(values));
		 double max = values[0]; 
		for (int i = 0; i < values.length; i++) {
			if(values[i]>max) {
				max = values[i];
			}
		}
	
		System.out.println("The largest element in the Array is " + max);
		
		int count = 0;
		for (int i = 0; i < values.length; i++) {
			if (values[i] < 0) {
				count += 1;
			}
		}
		System.out.println("There are " + count + " negative values");
		
	
		
	
		
		
		    

		
		    
		    
		
		

		
			
			
		
	



	}
		
		
		
}



