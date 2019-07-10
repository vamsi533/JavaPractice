
public class StaticExample {
	
	static int age;
	static String name;
	static void disp(){
	      System.out.println("Age is: "+age);
	      System.out.println("Name is: "+name);
	  }
	public static void main(String[] args) {		  
		age = 21;
		name = "Mohan";
		disp();
	
	}
}
