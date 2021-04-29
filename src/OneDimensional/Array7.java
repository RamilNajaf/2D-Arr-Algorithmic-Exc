package OneDimensional;

public class Array7 {
	public static void main(String[] args) {
		int[] arr= {1,0,5,0,5,0,13,0,1,0,3,0,1,2,19,0,11,22};
		int temp;
		
		for (int j = 0; j < arr.length; j++) {
			for(int i=0;i<arr.length-1;i++) {
				if(arr[i]==0) {
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
			}
		}
	}
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
		
}
}
