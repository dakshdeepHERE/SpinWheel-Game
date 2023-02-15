import java.util.ArrayList;
import java.util.Random;

public class WheelGame_Brute {
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

    void generateSpinningWheel() {
        if (spinningWheel.size() < 5) {
            int randomNumber = generateRandomNumber(0, 299);
            if (!spinningWheel.contains(randomNumber)) {
                spinningWheel.add(randomNumber);
            }
            generateSpinningWheel();
        }
    }

    int spinTheWheel() {
        int sectorNumber = generateRandomNumber(1, 5);
        return spinningWheel.get(sectorNumber - 1);
    }

    void playTheGame(int sectorValue) {
        if (sectorValue >= 1 && sectorValue <= 99) {
            System.out.println("Hailstone sequence:");
            printHailstoneSequence(sectorValue);
        } else if (sectorValue >= 100 && sectorValue <= 199) {
            System.out.println("Odd numbers:");
            displayOddNumbers(sectorValue, 200);
        } else if (sectorValue >= 200 && sectorValue <= 299) {
            int modValue = generateRandomNumber(2, 10);
            System.out.println("Modulus: " + sectorValue + " % " + modValue + " = " + calculateModulus(sectorValue, modValue));
        }
    }

    private void printHailstoneSequence(int n) {
        System.out.print(n + " ");
        if (n == 1) {
            return;
        } else if (n % 2 == 0) {
            printHailstoneSequence(n / 2);
        } else {
            printHailstoneSequence(3 * n + 1);
        }
    }

    private void displayOddNumbers(int start, int end) {
        if (start > end) {
            return;
        } else {
            if (start % 2 != 0) {
                System.out.print(start + " ");
            }
            displayOddNumbers(start + 1, end);
        }
    }

    private int calculateModulus(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return calculateModulus(a - b, b);
        }
    }

    private int generateRandomNumber(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
}
