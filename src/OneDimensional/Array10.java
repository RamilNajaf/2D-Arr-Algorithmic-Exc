package OneDimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
    
	
	int[] arr= {1,2,3,4,5,};
	int z=0;
    int y=arr.length;
	
	int [] arr1=new int[arr.length];
	
	int numb=scan.nextInt();
	
	System.out.println("(r)ight or (l)eft");
	
	
	String direction=scan.next();
	if(direction.equals("r")) {
	for (int i = arr.length-numb; i <arr.length; i++) {
		arr1[z]=arr[i];
		z++;
	}
	z=0;
	
	for (int i = 0; i < arr1.length; i++) {
		if(arr1[i]==0){
			arr1[i]=arr[z];
			z++;
		}
	}
	}else if(direction.equals("l")){
		for (int i = 0; i < arr1.length; i++) {
			arr1[y-1-i]=arr[i];
		}
		
	z=z+numb;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i]==0){
				arr1[i]=arr[z];
				z++;
			}
	}
	}
	System.out.println(Arrays.toString(arr1));
	
	


	}

}
