import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the nth term");
		num=sc.nextInt();
		for(int i=0;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("Sum is "+sum);
	}

}
