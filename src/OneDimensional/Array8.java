package OneDimensional;

public class Array8 {

	public static void main(String[] args) {
		int[]arr= {1,4,1,5,6,3,1,2};
		
		for (int i = 0; i < arr.length; i++) {
			boolean check= true;
			for (int j = i+1;j<arr.length ; j++) {
			
				if(arr[i]<arr[j]) {
					check=false;
				}
				
				
			}
			if(check) {
				System.out.println(arr[i]+" is leader ");
			}
		}
		
		
		
		
		
		
		}

	}


