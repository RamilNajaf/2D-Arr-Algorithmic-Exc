import java.util.Iterator;
import java.util.Scanner;

public class Array17 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();

	int value=1;
	int Jindex=0;
	
	
	int[][] arr=new int[n][n];
	
	for (int i = 0; i < n; i++) {
		int j=Jindex;
		for (; j < n;  j++) {
			arr[i][j]=value;
			value++;
			
		}
		Jindex++;
		
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j <n; j++) {
			
			if(arr[i][j]==0) {
				arr[i][j]=value;
				value++;
			}
		}
		
	}
	
	for (int i = 0; i < n; i++) {
		for (int j = 0; j <n; j++) {
			
			System.out.print(arr[i][j]+ " ");
		}
		System.out.println();
	}
}
}

	
