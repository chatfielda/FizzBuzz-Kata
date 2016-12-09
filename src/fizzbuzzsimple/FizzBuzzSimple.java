package fizzbuzzsimple;

public class FizzBuzzSimple {

	public static void main(String[] args) {

		// Creating a loop with 100 iterations.
		for (int i = 1; i <= 100; i++) {

			// Not strictly necessary for completion of the exercise but I want
			// my output to display the iteration number on each line.
			// I use 'print' instead of 'println' so as to keep the overall
			// output on the same line.
			System.out.print("(" + i + ")" + " : ");

			// First find if the number is divisible by both 3 and 5.
			if (i % 5 == 0 && i % 3 == 0) {

				// If so, print "FizzBuzz". The use here of 'println' will add a
				// line break after the output so that the overall output of the
				// loop is not on a single long line.
				System.out.println("FizzBuzz");

			} else

			// If not, check next if number is divisible by 5.
			if (i % 5 == 0) {

				// Print "Buzz" if it is.
				System.out.println("Buzz");

			} else

			// If not, check next if number is divisible by 3.
			if (i % 3 == 0) {

				// Print "Fizz" if it is.
				System.out.println("Fizz");

			} else

				// If the number is not divisible by either 3 or 5 (i.e. if none
				// of the previous conditionals are met) then display just the
				// number itself.F
				System.out.println(i);

		}

	}

}
