package modul7;

import java.util.Scanner;

public class EtterTest {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Oppgi tekststrengen: ");
		String tekstUtenMellomrom = input.nextLine().replaceAll("\\s", "");
		char[] charArray = tekstUtenMellomrom.toCharArray();
		java.util.Arrays.sort(charArray);
		
		System.out.print("Sortert tekststrengen: ");
		System.out.println(charArray);

	}

}
