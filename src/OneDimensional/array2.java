package OneDimensional;

import java.util.Random;
import java.util.Scanner;

public class array2 {

	public static void main(String[] args) {
		Random rand=new Random();
		
		Scanner scan =new Scanner(System.in);
		int n= scan.nextInt();
		boolean check=false;
		int[] arr=new int[n];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rand.nextInt(100);
		
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		
		}
	    System.out.println("");
		
		System.out.print("Insert Number: ");
		
		int querry=scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==querry) {
				System.out.println("Foundded at "+i+ " index");
				check=true;
			}
		
		}
		
	if(!check) {
		System.out.println("Not Found");
	}

		
		
		
		
		
		
		
		
		
 
	}

}
