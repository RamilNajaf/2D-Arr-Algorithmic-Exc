package OneDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr= {3,5,9,51,22,33,222};
		
		System.out.print("Write  index to remove : ");
		
		int index=scan.nextInt();
			
		
		
		for (int i = index; i < arr.length; i++) {
			 if(i==6) {
				 arr[i]=0;
			 }else {
				 arr[i]=arr[i+1];
			 }
				
			
		}
		System.out.println(Arrays.toString(arr));

	}

	}


