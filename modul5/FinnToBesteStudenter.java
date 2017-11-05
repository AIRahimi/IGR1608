package modul5;

import java.util.Scanner;

public class FinnToBesteStudenter {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Oppgi antall studenter: ");
		int antallStudenter = input.nextInt();
		
		int score, f�rstePlass = 0, andrePlass = 0; 
		String navn = "", f�rsteNavn = "", andreNavn = "";
		
		System.out.println("Oppgi studentens score og navn: ");
		for (int i = 0; i < antallStudenter; i++) {
			score = input.nextInt();
			navn = input.nextLine();
			
			if (i==0) {
				f�rstePlass = score;
				f�rsteNavn = navn;
			} else if (i == 1 && score > f�rstePlass) {
				andrePlass = f�rstePlass;
				f�rstePlass = score;
				andreNavn = f�rsteNavn;
				f�rsteNavn = navn;
			} else if (i == 1) {
				andrePlass = score;
				andreNavn = navn;
			} else if (i > 1 && score > f�rstePlass && score > andrePlass) {
				andrePlass = f�rstePlass;
				andreNavn = f�rsteNavn;
				f�rstePlass = score;
				f�rsteNavn = navn;
			} else if (i > 1 && score > andrePlass) {
				andreNavn = navn;
				andrePlass = score;
			}
		}
		
		System.out.println("F�rste plass: " + f�rsteNavn + " med score: " + f�rstePlass + (antallStudenter > 1 ?  
				("\nAndre plass: " + andreNavn + " med score: " + andrePlass) : ""));
		input.close();
	}
}
