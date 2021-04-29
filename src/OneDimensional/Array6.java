package OneDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {
	public static void main(String[] args) {
		 
	      Scanner sc = new Scanner(System.in);
	   
	      int size = sc.nextInt();
	      int[] Arr = new int[size];
	   
	      for(int i=0; i<size; i++){
	        Arr[i] = sc.nextInt();
	      }
	 
	      System.out.print("Enter the number: ");
	      int num = sc.nextInt();
	      System.out.println("Your array: "+Arrays.toString(Arr));
	      System.out.println("index of the elements whose sum is: "+num);
	      for(int i=0; i<Arr.length; i++){
	         for (int j=i; j<Arr.length; j++){
	            if((Arr[i]+Arr[j])== num && i!=j){
	               System.out.println(i+", "+j);
	            }
	         }
	      }
	}
}
