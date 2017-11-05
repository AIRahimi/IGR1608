package modul9;

public class TestMyInteger {
	
	public static void main(String[] args) {
		MyInteger numberOne = new MyInteger(5);
		System.out.printf("Er numberOne partall? %s %n", numberOne.isEven() ? "Ja" : "Nei");
		System.out.printf("Er numberOne primtall? %s %n", numberOne.isPrime() ? "Ja" : "Nei");
		System.out.printf("Er 15 en primtall? %s %n", MyInteger.isPrime(15) ? "Ja" : "Nei");

		System.out.println("parseInt med array:  " + MyInteger.parseInt(new char[] {'3', '5', '3', '9'}));

		System.out.println("parseInt med string: " + MyInteger.parseInt("3539"));

		MyInteger numberTwo = new MyInteger(24);
		System.out.printf("Er numberOne oddetall? %s %n", numberTwo.isOdd() ? "Ja" : "Nei");
		System.out.printf("Er 45 oddetall? %s %n", MyInteger.isOdd(45) ? "Ja" : "Nei");
		System.out.printf("Er numberOne lik numberTwo? %s %n", numberOne.equals(numberTwo) ? "Ja" : "Nei");
		System.out.printf("Er numberOne lik 5? %s %n", numberOne.equals(5) ? "Ja" : "Nei");
		
		
	}

}

class MyInteger {
	private int value;
	
	public MyInteger(int verdi) {
		value = verdi;
	}
	
	public int getValue() {
		return value;
	}
	
	public boolean isPrime() {
		if (value == 1 || value == 2) return true;
		else if (value % 2 == 0) return false;
	    for (int i = 3; i * i < value; i += 2)
	        if (value % i == 0) return false;
	    return true;
		
	}
	
	public static boolean isPrime(int integer) {
		if (integer == 1 || integer == 2) return true;
		else if (integer % 2 == 0) return false;
	    for (int i = 3; i * i < integer; i += 2)
	        if (integer % i == 0) return false;
	    return true;
	}
	
	public static boolean isPrime(MyInteger integer) {
		return integer.isPrime();
	}
	
	public boolean isEven() {
		return (value % 2) == 0;
	}
	
	public static boolean isEven(int integer) {
		return (integer % 2) == 0;
	}
	
	public static boolean isEven(MyInteger integer) {
		return integer.isEven();
	}
	
	public boolean isOdd() {
		return (value % 2) == 1;
	}
	
	public static boolean isOdd(int integer) {
		return (integer % 2) == 1;
	}
	
	public static boolean isOdd(MyInteger integer) {
		return integer.isOdd();
	}
	
	public boolean equals(int integer) {
		return integer == value;
	}
	
	public boolean equals(MyInteger integer) {
		return integer.value == this.value;
	}
	
	public static int parseInt(String string) {
	    return MyInteger.parseInt(string.toCharArray());
	}
	
	public static int parseInt(char[] chars) {
		int sum = 0;
		int position = 1;
		for (int i = chars.length-1; i >= 0; i--) {
			sum += Character.getNumericValue(chars[i]) *position;
			position = position*10;
		}
		return sum;
	}
	
	
}