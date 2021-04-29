import java.util.Scanner;

public class Array18 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[][] arr=new int[n][n];
		int value=1;
		
		int jIndex = 0;
		
		for (int i=0; i < n; i++) {
			int j=jIndex;
			for (; j <n; j++) {
				arr[i][j]=value;
				value++;
				
			}
			jIndex++;
			
		
			for (int j2 = 0; j2 < n; j2++) {
				if(arr[i][j2]==0) {
					arr[i][j2]=value;
					value++;
				}
			}
			
		}
		
		
		for (int d=0;d<n;d++) {
	        for (int b=0;b<n;b++) {
	            System.out.print(arr[d][b]+" ");
	        }
	        System.out.println();
	    }
		
		
		
		
		
//		 1  2  3  4  5
//		 10  6  7  8  9
//		 14 15 11 12 13
//		 18 19 20 16 17
//		 22 23 24 25 21
		
}
}
