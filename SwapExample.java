import java.util.Scanner;

public class SwapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Values before swapping "+num1+" "+num2);
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("Values after swapping "+num1+" "+num2);

	}

}
