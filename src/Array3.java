import java.util.Random;
import java.util.Scanner;

public class Array3{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int n,m;
		n=scan.nextInt();
		m=scan.nextInt();
		
		
		
		int[][] arr1=new int [n][m];
		int[][] arr2=new int [n][m];
		int[][] arr3=new int [n][m];
	
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				arr1[i][j]=rand.nextInt(10);
				arr2[i][j]=rand.nextInt(10);

			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				System.out.print(arr1[i][j]+" ");
			

			}
			System.out.println();
		}
		System.out.println("+");
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				System.out.print(arr2[i][j]+" ");
			

			}
			System.out.println();
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			
			}
		}
		
		System.out.println("=");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				
			System.out.print(arr3[i][j]+" ");
			
			}
			System.out.println();
		}
		
		
		
		
		
		
	}
}



