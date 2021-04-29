package OneDimensional;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
	Scanner scan= new Scanner(System.in);
	int a=scan.nextInt();
	
	double b;
	double milk=0.0;
	int pie=0;
	
	for (int i = 0; i < a; i++) {
		b=scan.nextInt();
		if(b<30.0){
			milk=milk+0.2;
			pie++;
		}
	}
	
	System.out.print(Math.ceil(milk/0.9)+" "+ pie);
	
	

	}
}

