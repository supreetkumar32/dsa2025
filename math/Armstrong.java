package math;

public class Armstrong {

	public static void main(String[] args) {
//		int number=15;
//		int numDigits = String.valueOf(number).length();
//        int sum = String.valueOf(number)
//                .chars() // IntStream of character codes
//                .map(ch -> Character.getNumericValue(ch))
//                .map(digit -> (int)Math.pow(digit, numDigits))
//                .sum();
//        
//        if (sum == number) {
//            System.out.println(number + " is an Armstrong number.");
//        } else {
//            System.out.println(number + " is not an Armstrong number.");
//        }
        
        ///////////////////////////
        int number = 1531;
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (number > 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

	}

}
