package com.class33;

import java.util.ArrayList;
import java.util.List;

public class InstructorsList {
	public static void main(String[] args) {
		List<Instructor> ilist = new ArrayList<>();
		ilist.add(new Instructor("Asel","Umurzakova"));
		ilist.add(new Instructor("Diego","Juarez"));
		ilist.add(new Instructor("Mohammad","Shokriyan"));
		ilist.add(new Instructor("Weqas", "Haq"));
		
		for (Instructor i:ilist) {
			System.out.println(i.lastName);
			i.display();
		}
		
	}

}
