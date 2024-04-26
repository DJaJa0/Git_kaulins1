import java.util.Scanner;
import java.util.Random;

public class Kaulins {
	
	static void mestKaulinu(int reizes) {
		int lielakais =0;
		Random rand = new Random();
		
		for(int i = 0; i < reizes; i++) {
			int skaitlis = rand.nextInt(6) + 1;
			System.out.println("Uzkrita skaitlis: " + skaitlis);
			if(lielakais<skaitlis)
				lielakais = skaitlis;
		}
		System.out.print("Lielākais skaitlis no visiem metieniem: "+lielakais);
	}
	
	public static void main(String[] args) {
		int reizes;
		Scanner scan = new Scanner(System.in);
		do {
		System.out.println("Cik reizes mest kauliņu?");
		reizes = scan.nextInt();
		}while(reizes<1);
		mestKaulinu(reizes);
		scan.close();
	}
}
