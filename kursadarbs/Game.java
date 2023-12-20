class Game extends Lottery {
    Game(int numOfNumbers, int numberBound) {
        this.numOfNumbers = numOfNumbers;
        this.numberBound = numberBound;
    }

    void noOrder(Integer[] rNum, Integer[] pNum) {
        int guesses = 0;
        int[] guessedNumbers = new int[numOfNumbers];
        for (int i = 0; i < numOfNumbers; i++) {
            boolean thisi = false;
            for (int j = 0; j < pNum.length; j++) {
                if (rNum[i] == pNum[j]) {
                    thisi = true;
                    guesses++;
                    guessedNumbers[i] = rNum[i];
                    break;
                }
            }
            if (thisi == false)
                guessedNumbers[i] = -1;
        }

        if (guesses > 0) {
            System.out.println("Number of correct guesses: " + guesses);
            for (int i = 0; i < numOfNumbers; i++) {
                if (guessedNumbers[i] >= 0) {
                    System.out.println("Correctly guessed number " + guessedNumbers[i]);
                }
            }
        } else {
            System.out.println("0 correct guesses");
        }
    }

    void inOrder(Integer[] rNum, Integer[] pNum) {
        int guesses = 0;
        int[] guessedNumbers = new int[numOfNumbers];

        for (int i = 0; i < numOfNumbers; i++) {
            if (rNum[i] == pNum[i]) {
                guesses++;
                guessedNumbers[i] = rNum[i];
            } else {
                guessedNumbers[i] = -1;
            }

        }

        if (guesses > 0) {
            System.out.println("Number of correct guesses: " + guesses);
            for (int i = 0; i < guessedNumbers.length; i++) {
                if (guessedNumbers[i] >= 0) {
                    System.out.println("Correctly guessed number " + guessedNumbers[i]);
                }
            }
        } else {
            System.out.println("0 correct guesses");
        }
    }
}