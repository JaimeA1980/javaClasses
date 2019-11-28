package com.class25;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Create an object of an Employee Class");
		Employee emp = new Employee();
		emp.salary=70000;
		Employee.companyName="Syntax";
		emp.work();
		emp.getPaid();
		
		System.out.println("Creating an object of the ScrumTeam class");
		ScrumTeam sm = new ScrumTeam();
		sm.work();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Product Backlog, Sprint Backlog, BurnDown Chart";
		sm.ceremonies="Sprint Demo, Planning, Retro, Daily StandUp";
		sm.attendScrumMeetings();
		
		System.out.println("Creating an object of the ScrumTeam class");
		Developer dev = new Developer();
		dev.salary=130000;
		dev.work();
		dev.getPaid();
		dev.code();
		dev.artifacts="Sprint Backlog";
		dev.ceremonies="Sprint demo, Planning, Retro, Daily Standup";
		dev.attendScrumMeetings();
		dev.employeeId=101;
		//dev.employeeSsn not accessable
		
		
		System.out.println("Creating an object of the Tester class");
		Tester test = new Tester();
		test.salary=80000;
		test.work();
		test.getPaid();
		test.test();
		test.artifacts="Sprint Backlog";
		test.ceremonies="Sprint demo, Planning, Retro, Daily Standup";
		test.attendScrumMeetings();
		
		System.out.println("Creating an object of the ProductOwner Class");
		ProductOwner po = new ProductOwner();
		po.salary = 120000;
		po.work();
		po.getPaid();
		po.prioritize();
		po.artifacts="Sprint Backlog";
		po.ceremonies="Sprint demo, Planning, Retro";
		po.attendScrumMeetings();
		
		
		
		
		
	}

}
