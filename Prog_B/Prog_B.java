
public class Prog_B {

	public static void main(String[] args) {

		titel("Fibonacci-Folge");
		
		int i = 1;
		int temp=fibo(1);
		
		System.out.println("Ausgabe der Fibonacci-Zaahlen <= 1000000: ");
		
		ende();

	}

	
	//Fibozahlen rekursiv ermitteln
	static int fibo(int n) {
		if (n<3)
			return 1;
		else
			return fibo(n-1);
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
