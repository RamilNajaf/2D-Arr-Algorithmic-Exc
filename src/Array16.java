import java.util.Scanner;

public class Array16 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		int [][] arr=new int[n][n];
		int value=0;
		
		
		for (int i = 0; i < n; i++) {
			if(i%2==0) {
				for (int j = 0; j < n; j++) {
					value++;
					arr[j][i]=value;
					
				}
			
			} else {
				value=value+n;
				for (int j = 0; j < n; j++) {
					arr[j][i]=value;
					value--;
				}
				value=value+n;
				
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
