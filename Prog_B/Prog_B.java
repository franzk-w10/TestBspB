
public class Prog_B {

	public static void main(String[] args) {

		titel("Fibonacci-Folge");
		
		ende();

	}

	
	static void titel(String text) {
		
		System.out.print("\n\t\t");
		
		for (int i=0; i<text.length()+6; i++)
			System.out.print("*");
		
		System.out.print("\n\t\t*  "+ text + "  *\n\t\t");
		
		for (int i=0; i<text.length()+6; i++)
			System.out.print("*");
		
		System.out.println("\n");
	}	
	
	
	static void ende() {
		
		System.out.println("\n\n\t das wars!");
	}
}
