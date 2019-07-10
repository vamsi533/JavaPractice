
public class LoopsEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			if(i==4) {
				continue;
			}
			System.out.println("i="+i);
			
		}
		int a=5;
		while(a>=1) {
			System.out.println("a="+a);
			if(a==4) {
				break;
			}
			a--;
		}
		do {
			System.out.println(a);
		}while(a>6);
		
		int h[]= {1,2,3,4,5};
		for(int p:h) {
			System.out.println(p);
		}
	}
}
