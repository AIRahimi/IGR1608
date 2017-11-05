package modul8;

public class UseStopwatch {
	
	public static void main (String[] args) {
		Stopwatch myStopwatch = new Stopwatch();
		myStopwatch.start();
		for (int i = 1; i < 30000; i++) {
			isPrimeBad(i);
		}
		myStopwatch.end();
		System.out.printf("Tid for å finne 30000 primtall med isPrimeBad er: %5d\n"
				, myStopwatch.getElapsedTime());
		
		myStopwatch.start();
		for (int i = 1; i < 30000; i++) {
			isPrimeGood(i);
		}
		myStopwatch.end();
		System.out.printf("Tid for å finne 30000 primtall med isPrimeGood er: %8d\n"
				, myStopwatch.getElapsedTime());
	}
	
	private static boolean isPrimeBad(long number) {
		for (int divisor = 2; divisor <= number / 2; divisor++)
			if (number % divisor == 0)  
				return false; 

		return true; 
	}
	
	private static boolean isPrimeGood(long number) {
		    if (number % 2 == 0) return false;
		    for (int i = 3; i * i < number; i += 2)
		        if (number % i == 0) return false;
		    return true;
		
	}

}

class Stopwatch {
	private long startTime;
	private long endTime;
	
	public void start() {
		startTime = System.nanoTime();
	}
	
	public void end() {
		endTime = System.nanoTime();
	}
	
	public long getElapsedTime() {
		return endTime-startTime;
	}
}
