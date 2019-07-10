import java.util.Scanner;

public class CubeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner i = new Scanner(System.in);
		System.out.println("Enter the face of a dice");
		int face=i.nextInt();
		int oppositeFace=0;
		if(face<=6) {
			if(face+oppositeFace!=7)
			{
				oppositeFace=7-face;
			}
			System.out.println("The opposite face of dice is "+oppositeFace);
		}
		else {
			System.out.println("All the dice will have only 6 faces");
		}
	}
}
