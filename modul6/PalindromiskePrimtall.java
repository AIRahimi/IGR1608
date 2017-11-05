package modul6;

public class PalindromiskePrimtall {
	
	public static boolean isPrime(long tall) {
		for(int i = 2; i < tall; i++)
			if(tall % i == 0)
				return false;
		return true;
	}
	
	public static boolean isPalindrome(long tall) {
		if (reversertTall(tall) == tall)
			return true;
		else
			return false;
	}
	
	public static long reversertTall(long tall) {
		long resterende = 0;
		long reversert = 0;
		
		while(tall > 0) {
			resterende = tall % 10;
			reversert = reversert * 10 + resterende;
			tall = tall / 10;
		}			
		return reversert;
	}
	
	public static void main (String[] args) {
		int palindromiskePrimtall = 0; 
		for(int i = 11; palindromiskePrimtall < 100; i++) {
			if (isPrime(i) && isPalindrome(i)) {
				palindromiskePrimtall++;
				System.out.printf("%6d", i);
				if (palindromiskePrimtall % 10 == 0 && i!= 0) {
					System.out.println();
				}
			}
		}
	}
}
