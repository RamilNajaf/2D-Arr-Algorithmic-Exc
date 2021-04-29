import java.util.Scanner;

public class nextsmalinteger {
	//find small integer superior to n whose digits are diffirent  from all of n's digits

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Integer n=scan.nextInt();
		String def=n.toString();
		while(true) {
			boolean flag=true;
			Integer z=n+1;
			String nn=n.toString(n);
			String zz=z.toString(z);
			
			
			for (int i = 0; i < def.length();i++) {
				for (int j = 0; j <zz.length(); j++) {
					if(zz.charAt(j)==def.charAt(i)) {
						flag=false;
							break;
					}	
				}
				
				}
			if(!flag) {
				n=n+1;
			}else {
				System.out.println(n+1);
			 break;
				
			}
		
		
		}

	}

}
