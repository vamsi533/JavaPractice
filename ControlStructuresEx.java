import java.util.Scanner;

public class ControlStructuresEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner i =new Scanner(System.in);
		System.out.println("Enter a number");
		num=i.nextInt();
	
		if(num==5) {
			System.out.println("Entered number is 5");
		}
		else {
			System.out.println("Entered number is not 5");
		}
		
		
		if(num%4==0) {
			if(num%2==0) {
				System.out.println("Entered number is divisible by both 2 and 4");
			}
			else {
				System.out.println("Entered number is divisible by 2");
			}
		}
		else {
			System.out.println("Entered number is not divisible by 2 and 4");
		}	
	}

}
