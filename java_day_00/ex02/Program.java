// read from console until 42
// sum of digit
// is prime
// print Count of coffee-request –

import java.util.Scanner;
public class Program {
	public static int sum_of_digit(int number) {
		int sum = 0;

		for (;number != 0;) {
			sum = sum + number%10;
			number = number/10;
		}
		return sum;
	}

	public static boolean isPrime(int prime) {
		boolean status = true;
		for(int i = 2; i*i <= prime; i++) {
            if (prime%i == 0) {
                status = false;
                break;
            }
            status = true;
        }
		return status;
	}
    public static void main(String[] args) {
		int count = 0;
		int number;

		Scanner sequence = new Scanner(System.in);
		if (number = sequence.nextInt() != 42) {
			if (isPrime(sum_of_digit())) {
				count++;
			}
		}

		System.out.println("Count of coffee-request – " + count);
	}
}