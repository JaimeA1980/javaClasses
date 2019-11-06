package com.class8;

public class ForLoopTask1 {
	public static void main(String[] args) {
		
	for (int i=1; i<=100; i++) {
		System.out.print(i+" ");
	}
		for (int i=100; i>=1;i--) {
			System.out.print(i+" ");	}
	for (int i=20; i>=1;i-=2) {
		System.out.print(i+" ");
}
	for (int i=20; i>=1;i-=2) {
		if (i%2==0) {
			System.out.println(i);
		}
			
				
			}
	for (int i=21; i<=50;i+=2) {
				System.out.println(i); //or do as if int(i%2!=2) or int( i%2 ! =0)
	}
	System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------");
	//what is the output
	int sumAll=0;
			for (int i=0; i<=20; i+=5) {//0,5,15,20
				sumAll=sumAll+i;
			}
	System.out.println(sumAll);
	
	System.out.println("********************************************************************************");
	
	int total=2;
	for (int y=1; y<=3; y++) {
		total=total*y;//2=2*1; 4=2*2; 12=4*3
	}
	System.out.println(total);
	
	}
}
