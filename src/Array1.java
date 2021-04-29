import java.util.Random;
import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		int n,m;
	    n=scan.nextInt();
	    m=scan.nextInt();
	    
	    int[][] arr=new int[n][m];
	    
	    
	    
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<m;j++) {
	    		arr[i][j]=rand.nextInt(1000);
	    	}
	    }
	    for(int i=0;i<n;i++) {
	    	for(int j=0;j<m;j++) {
	    	     if(arr[i][j]%2==0) {
	    	    	 System.out.println(arr[i][j]);
	    	     }
	    	}
	    	
	    }
	    
	    
		
		
		
		
		
	}

}
