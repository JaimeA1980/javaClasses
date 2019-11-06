package com.class6;

public class Recap {
	public static void main(String[] args) {
		
		/*declare the time (1-24)
		 * based on the time identify wheter it is morning, afternoon, evening or night
		 *if 1-11->morning
		 *if 12-15->evening
		 *if>20->night
		 */
		
		int time=10;
		String timeOfDay;
		
		if (time>=1 && time<=11) {
			timeOfDay="Morning";
		}else if (time>=12 && time<=15) {
			timeOfDay="Noon";
		}else if (time>=16 && time<=20) {
			timeOfDay="Evening";
		}else if (time>20 && time<24) {
			timeOfDay="Night";
		}else {
			timeOfDay="Invalid";
		}
		
		System.out.println("Time of the day is "+timeOfDay);
		
		if (timeOfDay.equals("Morning")) {
			System.out.println("Good morning");
			
		}
		
	}

}
