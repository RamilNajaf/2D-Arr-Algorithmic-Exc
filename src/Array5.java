import java.util.Scanner;



public class Array5 {
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	int n=scan.nextInt();
	
	int[][] arr=new int[n][n];
	int value=1;
	
	
	
   for(int i=0;i<n;i++) {
	   for(int j=0;j<n;j++) {
		 arr[i][j]=value;
		 value++;
	   }
   }
   for(int i=0;i<n;i++) {
	   for(int j=0;j<n;j++) {
		 System.out.print(arr[i][j]+" ");
	   }
	   System.out.println();
   }
   
   
   
}
}
