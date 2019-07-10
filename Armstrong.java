import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, originalNumber, remainder, result = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		number=sc.nextInt();
		originalNumber = number;
	    while (originalNumber != 0)
	    {
	        remainder = originalNumber%10;
	        result += remainder*remainder*remainder;
	        originalNumber /= 10;
	    }
	    if(result == number)
	        System.out.println("Armstrong number.");
	    else
	        System.out.println("Not an Armstrong number.");
		
	}

}
