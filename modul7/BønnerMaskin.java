package modul7;

import java.util.Scanner;

public class BønnerMaskin {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Oppgi antall baller: ");
		int antallBaller = input.nextInt();
		System.out.println("Oppgi antall spor: ");
		int antallSpor = input.nextInt();
		int[] spor = new int[antallSpor];
		
		for (int i = 0; i < antallBaller; i++) {
			fåStiForEnBall(spor);
		}
		printResultat(spor, max(spor) + 1);
		input.close();
	}
	
	private static String fåStiForEnBall(int[] spor)  {
		StringBuilder stienTilBall = new StringBuilder();
		for (int i = 0; i < spor.length - 1; i++) {
			if (Math.random() < 0.5)
				stienTilBall.append("L");
			else
				stienTilBall.append("R");
		}
		spor[fåPosisjonTilEnBall(stienTilBall.toString())]++;
		System.out.println(stienTilBall.toString());
		return stienTilBall.toString();
	}
	
	private static int fåPosisjonTilEnBall(String sti) {
		int teller = 0;
		for (int i = 0; i < sti.length(); i++) {
			if(sti.charAt(i) == 'R') 
				teller++;
		}
		
		return teller;
	}
	
	private static int max(int[] spor) {
		int max = 0;
		for (int i = 0; i < spor.length; i++)  {
			if (spor[i] > max)
				max = spor[i];
		}
		return max;
	}
	
	private static void printResultat(int[] spor, int antallBaller) {
		for (int i = antallBaller; i > 0; i--) {
			for (int j = 0; j < spor.length; j++) {
				if (spor[j] >= i) {
					System.out.print(" O ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		for (int i = 0; i < spor.length; i++) {
			System.out.print("|"+i+"|");
		}
		
	}
	
}
	
