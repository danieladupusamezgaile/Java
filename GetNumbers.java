import java.util.Random;
import java.util.Set;
import java.util.LinkedHashSet;

class GetNumbers extends Lottery {
    GetNumbers(int numOfNumbers, int numberBound) {
        this.numOfNumbers = numOfNumbers;
        this.numberBound = numberBound;
    }

    Integer[] randomNumbers() {
        Random rand = new Random();
        Set<Integer> randomNumbersSet = new LinkedHashSet<Integer>();

        while (randomNumbersSet.size() < numOfNumbers) {
            randomNumbersSet.add(rand.nextInt(numberBound));
        }

        Integer[] randomNumbers = new Integer[numOfNumbers];
        randomNumbers = randomNumbersSet.toArray(randomNumbers);

        return randomNumbers;
    }
}