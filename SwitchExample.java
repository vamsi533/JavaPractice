import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner i = new Scanner(System.in);
		int num;
		num=i.nextInt();
		switch(num) {
		case(1): System.out.println("1");break;
		case(2): System.out.println("2");break;
		case(3): System.out.println("3");break;
		case(4): System.out.println("4");break;
		default: System.out.println("Enter an integer between 1 and 4");
		}
	}
}
