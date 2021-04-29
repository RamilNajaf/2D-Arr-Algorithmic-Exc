package OneDimensional;

public class Array9 {

	public static void main(String[] args) {
	int[] arr= {3,4,2,5,6,5,4};
	int[] arr1=new int[arr.length];
	
	int iOdd=0;
	int iEven=arr.length-1;
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]%2==0) {
			arr1[iOdd]=arr[i];
			iOdd++;
		}else {
			arr1[iEven]=arr[i];
			iEven--;
		}
	}
	
	for (int i = 0; i < arr1.length; i++) {
		System.out.print(arr1[i]+" ");
	}
	
	
	
	
	
	

	}

}
