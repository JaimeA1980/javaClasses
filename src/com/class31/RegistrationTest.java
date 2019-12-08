package com.class31;

public class RegistrationTest {
	public static void main(String[] args) {
		
		Registration reg = new Registration();
		reg.setEmail("huasojaa@gmail.com");
		String str = reg.getEmail();
		System.out.println(str);
		
		Registration reg1 = new Registration();
		reg1.setUserName("Huaso1980");
		String str1 = reg1.getUserName();
		System.out.println(str1);
		
		Registration reg2 = new Registration();
		reg2.setPassword("LadyLoveLocks");
		String str2 = reg2.getPassword();
		System.out.println(str2);
	}

}
