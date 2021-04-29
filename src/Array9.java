import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 int n=scan.nextInt();
	 int[][] arr=new int[n][n];
	 int value=0;
	 
	 
	
	 
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=value;
			value++;
		 } 
		 value=0;
	 }
	 
	 
	 
	
	 for (int[] innerArray:arr) {
         for(int data: innerArray) {
             System.out.print(data+" ");
         }
         System.out.println();
	}
	 
	 
	 
}
}
