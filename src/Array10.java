import java.util.Scanner;

public class Array10 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int value=0;
		
		int[][] arr=new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j>=0; j--) {
				arr[i][j]=value;
				
			}
			value++;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n; j++) {
				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

	}


