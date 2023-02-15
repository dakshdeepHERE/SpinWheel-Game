import java.util.ArrayList;
import java.util.Random;

public class RecursiveWheelGame_3Parts {
    private ArrayList<Integer> spinningWheel = new ArrayList<Integer>();

    public static void main(String[] args) {
        WheelGame_Brute game = new WheelGame_Brute();

        // Generate the spinning wheel
        game.generateSpinningWheel();

        // Spin the wheel
        int sectorValue = game.spinTheWheel();

        // Play the game
        game.playTheGame(sectorValue);
    }

    // This method generates a spinning wheel with 5 unique random values from 1 to 299
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
    public static void printHailstoneSequence(int n) {
        System.out.print(n + " ");

        if (n == 1) {
            // If n is 1, the sequence ends
            return;
        } else if (n % 2 == 0) {
            // If n is even, the next number is n/2
            printHailstoneSequence(n/2);
        } else {
            // If n is odd, the next number is 3n+1
            printHailstoneSequence(3*n + 1);
        }
    }

    public static void displayOddNumbers(int value, int end) {
        // base case: if value is greater than end, then return
        if (value > end) {
            return;
        }

        // recursive case: if value is odd, then print it
        if (value % 2 != 0) {
            System.out.print(value + " ");
        }

        // recursive step: call displayOddNumbers method with value+1 and end
        displayOddNumbers(value+1, end);
    }

    public static int calculateModulus(int value, int modValue) {
        // base case: if value is less than modValue, then return value
        if (value < modValue) {
            return value;
        }

        // recursive case: subtract modValue from value and call the method recursively with new value
        return calculateModulus(value - modValue, modValue);
    }
    private int generateRandomNumber(int min, int max) {
        // Create a new instance of the Random class
        Random rand = new Random();
        // Generate a random integer within the range [0, max - min], then add min to shift the range
        // to [min, max]
        return rand.nextInt((max - min) + 1) + min;
    }
}
