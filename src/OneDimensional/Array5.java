package OneDimensional;

import java.util.Arrays;

public class Array5 {
	public static void main(String[] args) {
		int[] arr= {1,4,2,5,12,9,11};
		int max=0;
		int max_id=0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				max_id=i;
				
			}
		 
		}
		int temp=arr[max_id];
		
		arr[max_id]=arr[0];
		arr[0]=temp;
		max=0;
		
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				max_id=i;
				
			}
		 
		}
		
		System.out.println(max);
		
		
		
		
	}
}
