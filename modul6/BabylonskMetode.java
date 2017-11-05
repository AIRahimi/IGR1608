package modul6;

import java.util.Scanner;

public class BabylonskMetode {

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Skriv inn et positivt tall: ");
		int tall = input.nextInt();
		System.out.println("Gi en antagelse for kvadratroten: ");
		double seed = input.nextDouble();
		System.out.println("Tilnærmet verdi for kvadratroten av " + tall + " er " +  kvadratrot(tall, seed));
		input.close();
		
	}
	
	public static double kvadratrot(int tall, double seed) {
		double lastGuess = seed;
		double nextGuess = (lastGuess + tall / lastGuess) / 2;
		while(nextGuess - lastGuess > 0.00001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + tall / lastGuess) / 2;
		}
		lastGuess = nextGuess; 
		return nextGuess = (lastGuess + tall / lastGuess) / 2;
	}

}
