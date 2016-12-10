# FizzBuzz-Kata
:sparkles:The classic FizzBuzz coding kata.

- For each number 1 through 100:
  - Print "Fizz" if the number is divisible by 3
  - Print "Buzz" if the number is divisible by 5
  - Print "FizzBuzz" if the number is divisible by both 3 and 5
  - Otherwise just print the number
  
# Core Code

		// Creating a loop with 100 iterations.
		for (int i = 1; i <= 100; i++) {

			// Not strictly necessary for completion of the exercise but I want
			// my output to display the iteration number on each line.
			// I use 'print' instead of 'println' so as to keep the overall
			// output on the same line.
			System.out.print("(" + i + ")" + " : ");

			// First find if the number is divisible by both 3 and 5.
			// Some completions of this exercise recognize that if a number is
			// divisible by both 3 and both then it is divisible by 15, and thus
			// use "if (i % 15 == 0 ) for this conditional. For clarity I prefer
			// to code this with an AND operator.
			if (i % 5 == 0 && i % 3 == 0) {

				// If so, print "FizzBuzz". The use here (and in the other
				// conditionals) of 'println' will add a
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
				// number itself.
				System.out.println(i);

		}

# Output

(1) : 1
(2) : 2
(3) : Fizz
(4) : 4
(5) : Buzz
(6) : Fizz
(7) : 7
(8) : 8
(9) : Fizz
(10) : Buzz
(11) : 11
(12) : Fizz
(13) : 13
(14) : 14
(15) : FizzBuzz
(16) : 16
(17) : 17
(18) : Fizz
(19) : 19
(20) : Buzz
(21) : Fizz
(22) : 22
(23) : 23
(24) : Fizz
(25) : Buzz
(26) : 26
(27) : Fizz
(28) : 28
(29) : 29
(30) : FizzBuzz
(31) : 31
(32) : 32
(33) : Fizz
(34) : 34
(35) : Buzz
(36) : Fizz
(37) : 37
(38) : 38
(39) : Fizz
(40) : Buzz
(41) : 41
(42) : Fizz
(43) : 43
(44) : 44
(45) : FizzBuzz
(46) : 46
(47) : 47
(48) : Fizz
(49) : 49
(50) : Buzz
(51) : Fizz
(52) : 52
(53) : 53
(54) : Fizz
(55) : Buzz
(56) : 56
(57) : Fizz
(58) : 58
(59) : 59
(60) : FizzBuzz
(61) : 61
(62) : 62
(63) : Fizz
(64) : 64
(65) : Buzz
(66) : Fizz
(67) : 67
(68) : 68
(69) : Fizz
(70) : Buzz
(71) : 71
(72) : Fizz
(73) : 73
(74) : 74
(75) : FizzBuzz
(76) : 76
(77) : 77
(78) : Fizz
(79) : 79
(80) : Buzz
(81) : Fizz
(82) : 82
(83) : 83
(84) : Fizz
(85) : Buzz
(86) : 86
(87) : Fizz
(88) : 88
(89) : 89
(90) : FizzBuzz
(91) : 91
(92) : 92
(93) : Fizz
(94) : 94
(95) : Buzz
(96) : Fizz
(97) : 97
(98) : 98
(99) : Fizz
(100) : Buzz
