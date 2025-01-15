package Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int number = sc.nextInt();
			sc.close();
			boolean b = true;
			if (number < 2) {
			    b = false;
			}
			if (number == 2) {
			    b = true;
			}
			for (int i = 2; i <= Math.sqrt(number); i++) {
			    if (number % i == 0) {
			        b = false;
			        break;
			    }
			}
			if (b) {
			    System.out.println("prime");
			} else {
			    System.out.println("not prime");
			}
		}
    }
}
