import java.util.Scanner;

public class ArrAY19 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n= scan.nextInt();
		
		int[][] arr=new int[n][n];
		int value=1;
		int z=1;
		int temp=0;
		int inc=1;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				z++;
				arr[i][j]=value;
				value=value+z;
				
			}
		temp=arr[i][0];
	
		value=temp+inc;
		z=z-4;
		inc++;
		
		 	
			
		}
		for (int i=0;i<n;i++) {
	        for (int j=0;j<n;j++) {
	            System.out.print(arr[i][j]+" ");
	        }
	        System.out.println();
	    }
		
		
		
		
		
		
	

	}

}
