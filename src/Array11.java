import java.util.Scanner;

public class Array11 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int[][] arr=new int[n][n];
		int defvalue=n;
		
		int z=1;
		int value=n*z;
		
		for (int i  = 0; i < n; i ++) {
			for (int j = 0; j< n; j++) {
				arr[i][j]=value;
				value--;
			}
			z++;
			value=n*z;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
