package OneDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] arr= {12,41,15,23,49,3,212};
		
		System.out.print("Write  Number to remove : ");
		
		int num=scan.nextInt();
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num) {
				index=i;
				break;
			}
			
		}	
		
		
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
