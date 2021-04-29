import java.util.Random;
import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		int[][] arr= {
						{11,32,91},
					
						{42,71,82},
					
						{13,44,51}
				};
		
		
		
		
		for (int i=0;i<3;i++) {
	        for (int j=0;j<3;j++) {
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    }
		
	System.out.println("----------------");
	
	
	System.out.print("(c)lock or (a)nti-clock: ");
	String chc=scan.nextLine();
		
		
	System.out.println("----------------");
		
		if(chc.equals("c")) {
			
				for (int i = 0; i <3; i++) {
					
					for (int j =3-1; j>=0; j--) {
						System.out.print(arr[j][i]+" ");
				
					}
					System.out.println();
					
				}
			
		} else {
			
			for (int i = 3-1; i >=0; i--) {
				for (int j = 0; j<3; j++) {
					System.out.print(arr[j][i]+" ");
					
				}
				System.out.println();
		
				
			}
			
		}
		
		
		
		
}
}
