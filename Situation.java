import java.util.Arrays;

public class Situation {
    public static void main(String[] args) {
        int numOfNumbers = 4;
        int numberBound = 15;

        Integer[] participantNumbers = { 8, 14, 4, 0, 5 };

        // Generate random numbers
        GetNumbers getRandomNumbers = new GetNumbers(numOfNumbers, numberBound);
        Integer[] randomNumbers = getRandomNumbers.randomNumbers();

        // GAME 1
        Game game1 = new Game(numOfNumbers, numberBound);
        game1.set(1, "Guess " + numOfNumbers + " numbers in no particular order.");
        game1.print();

        // calculate odds of winning in game1
        Odds odd = new Odds();
        System.out.println(Odds.title);
        try {
            for (int i = 1; i <= numOfNumbers; i++) {
                System.out.println("Odds of guessing " + i + " out of " + numOfNumbers + " numbers: 1 in "
                        + odd.calculateNoOrder(i, numberBound));
            }
        } catch (ArithmeticException e) {
            System.out.println("Cannot " + e.getMessage());
        }

        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Your numbers: " + Arrays.toString(participantNumbers));

        // check how many guessed in first game
        game1.noOrder(randomNumbers, participantNumbers);

        // GAME 2
        Game game2 = new Game(numOfNumbers, numberBound);
        game2.set(2, "Guess numbers in correct order.");
        game2.print();

        // calculate odds of winning in game2
        System.out.println(Odds.title);
        for (int i = 1; i <= numOfNumbers; i++) {
            System.out.println("Odds of guessing the first " + i + " numbers out of " +
                    numberBound + " is 1 in "
                    + odd.calculateInOrder(i, numberBound));
        }

        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));
        System.out.println("Your numbers: " + Arrays.toString(participantNumbers));

        // check how many guessed in second game
        game2.inOrder(randomNumbers, participantNumbers);
    }
}
