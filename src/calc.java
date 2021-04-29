import java.util.Scanner;

public class calc {

	public static void main(String[] args) {
		
		Integer result=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.print("ilk ədədi daxil edin: ");
		int first =scan.nextInt();
		System.out.print("ikinci ədədi daxil edin: ");
		int second =scan.nextInt();
		System.out.print("operatoru  daxil edin (+,-,/,*,%,$): ");
		String op=scan.next();
		
		switch(op) {
		case "+":
			result=first+second;
			break;
		
		case "-":
			result=first-second;
			break;
		case "/":
			if(second==0) {
				System.out.println("0 bölmək olmaz");
				return;
			}
			else {
				result=first/second;
			}
			break;
		case "*":
			result=first*second;
			break;
		case "%":
			result=first%second;
			break;
		case "$":
			result=(int) Math.pow(first,second);
			break;
		}
		System.out.println("Nəticə: "+ result);
		

	}
	}

