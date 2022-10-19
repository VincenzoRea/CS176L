
public class Microwave {
	int time = 0;
	int power_switch = 1;
	
	public void start() {
		System.out.println("Cooking for "+ time + " seconds at level " + power_switch);
	}
	public void time() {
		time = time + 30;
		System.out.println("TIme button was pressed. Time is " + time + " seconds");
		
	}
	public void power() {
		if (power_switch == 1)
			power_switch = 2;
		else
			power_switch = 1;
		System.out.println("Power button is pressed. Power is at level " + power_switch);
		
	}
	public void reset() {
		time = 0;
		power_switch = 1;
		System.out.println("Reset button was pressed. Time is at " + time + " and power level is at " +power_switch);
		
		
				
	}
	
	
	}


