package com.class5;

public class NestedIfRecap {
	public static void main(String[] args) {
		/*Verify if button is displayed on the syntax home page
		 * if button is displayed the we need to verify text on
		 * if text equal to sing in--> Test case pass
		 * otherwise---> Wrong text is displaygn
		 */
		
		
		boolean isDisplayed=true;
		String buttonText="Sign In";
		
		if (isDisplayed) {
			System.out.println("Button is displayed");
			
			if(buttonText.equals("Sign In")) {
				System.out.println("Test case pass");
			}else {
				System.out.println("Wrong text is displayed");
			}
						
		}else {
			System.out.println("Button is not displayed");
		}
	}

}
