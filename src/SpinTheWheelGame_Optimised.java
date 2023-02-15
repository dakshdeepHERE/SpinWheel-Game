import java.util.*;

public class SpinTheWheelGame_Optimised {

    private List<Integer> spinningWheel = new ArrayList<Integer>();

    public static void main(String[] args) {
        SpinTheWheelGame_Optimised game = new SpinTheWheelGame_Optimised();
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            game.generateSpinningWheel();
            int sectorValue = game.spinTheWheel();
            game.playTheGame(sectorValue);

            System.out.println("Do you want to play again? (yes or no)");
            playAgain = scanner.next();
        } while (playAgain.equalsIgnoreCase("yes"));

        scanner.close();
        //Here we will take the input of the person if he/she wants to continue
    }

    private void generateSpinningWheel() {
        // Check if the spinning wheel already has 5 values
        if (spinningWheel.size() < 5) {
            // Generate a random number from 1 to 299 (inclusive)
            int randomNumber = generateRandomNumber(0, 299);
            // Check if the spinning wheel already contains the generated number
            if (!spinningWheel.contains(randomNumber)) {
                // If the generated number is unique, add it to the spinning wheel
                spinningWheel.add(randomNumber);
            }
            // Recursively call the generateSpinningWheel method until the spinning wheel has 5 unique values
            generateSpinningWheel();
        }
    }

    private int spinTheWheel() {
        // Generate a random integer between 1 and 5 (inclusive) to represent the sector number
        int sectorNumber = generateRandomNumber(1, 5);
        // Retrieve the corresponding sector value from the spinningWheel list
        // Note: the list is zero-indexed, so we subtract 1 from the sectorNumber to get the correct index
        return spinningWheel.get(sectorNumber - 1);
    }

    private void playTheGame(int sectorValue) {
        if (sectorValue >= 1 && sectorValue <= 99) {
            // if sector value is between 1 and 99, call printHailstoneSequence method
            System.out.println("Hailstone sequence:");
            printHailstoneSequence(sectorValue);
        } else if (sectorValue >= 100 && sectorValue <= 199) {
            // if sector value is between 100 and 199, call displayOddNumbers method
            System.out.println("Odd numbers:");
            displayOddNumbers(sectorValue, 200);
        } else if (sectorValue >= 200 && sectorValue <= 299) {
            // if sector value is between 200 and 299, generate a random value and call calculateModulus method
            int modValue = generateRandomNumber(2, 10);
            System.out.println("Modulus: " + sectorValue + " % " + modValue + " = " + calculateModulus(sectorValue, modValue));
        }
    }

    private int generateRandomNumber(int min, int max) {
        // Create a new instance of the Random class
        Random rand = new Random();
        // Generate a random integer within the range [0, max - min], then add min to shift the range
        // to [min, max]
        return rand.nextInt((max - min) + 1) + min;
    }

    private void printHailstoneSequence(int n) {
        System.out.print(n + " ");

        if (n == 1) {
            // If n is 1, the sequence ends
            return;
        } else if (n % 2 == 0) {
            // If n is even, the next number is n/2
            printHailstoneSequence(n / 2);
        } else {
            // If n is odd, the next number is 3n+1
            printHailstoneSequence(3 * n + 1);
        }
    }

    private void displayOddNumbers(int start, int end) {
        // base case: if value is greater than end, then return
        if (start > end) {
            return;
        }
        // recursive case: if value is odd, then print it
        if (start % 2 != 0) {
            System.out.print(start + " ");
        }
        // recursive step: call displayOddNumbers method with value+1 and end
        displayOddNumbers(start + 1, end);
    }

    private int calculateModulus(int dividend, int divisor) {
        // base case: if value is less than modValue, then return value
        if (dividend < divisor) {
            return dividend;
        // recursive case: subtract modValue from value and call the method recursively with new value
        } else {
            return calculateModulus(dividend - divisor, divisor);
        }
    }
}
