import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		char choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter the choice");
		choice=sc.next().charAt(0);
		switch(choice) {
		case'+':System.out.println(num1+num2);break;
		case'-':System.out.println(num1-num2);break;
		case'*':System.out.println(num1*num2);break;
		case'%':System.out.println(num1%num2);break;
		case'/':System.out.println(num1/num2);break;
		default:System.out.println("Please enter any of +,-,*,%,/  operations");
		}
	}

}
