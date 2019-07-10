import java.util.Scanner;

public class Circles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1,y1,x2,y2,r1,r2;
		Scanner i = new Scanner(System.in);
		System.out.println("Enter the values of first circle");
		x1=i.nextInt();
		y1=i.nextInt();
		System.out.println("Enter the values of second circle");
		x2=i.nextInt();
		y2=i.nextInt();
		System.out.println("Enter the values of two radii");
		r1=i.nextInt();
		r2=i.nextInt();
		int cirDis,radDis;
		cirDis=(int) Math.sqrt(((x1-x2)*(x1-x2))+((y1-y1)*(y1-y2)));
		radDis=r1+r2;
		if(cirDis==radDis) {
			System.out.println("Two circles touch each other");
		}
		if(cirDis>radDis) {
			System.out.println("Two circles do not touch each other");
		}
		if(cirDis<radDis) {
			System.out.println("Two circles intersect each other");
		}
	}

}
