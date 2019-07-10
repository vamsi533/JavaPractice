import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,fact=1;
		Scanner i = new Scanner(System.in);
		System.out.println("Enter a number");
		num=i.nextInt();
		fact=factorial(num);
		System.out.println("The factorial of "+num+" is "+fact);
	}
	
	static int factorial(int num) {
		// TODO Auto-generated method stub
		if (num==0 || num==1)
		    return 1;    
		  else    
		    return(num*factorial(num-1));
	}
}
