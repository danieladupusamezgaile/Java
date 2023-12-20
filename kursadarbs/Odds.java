class Odds {
    static String title = "Odds of winning this game";

    long calculateNoOrder(int numOfNumbers, int numberBound) {
        long nr = numberBound - numOfNumbers;
        long a = 1L;
        long b = 1L;
        long c = 1L;

        for (int i = 0; i < numberBound - 1; i++) {
            a *= numberBound - i;
        }
        for (int j = 0; j < numOfNumbers - 1; j++) {
            b *= numOfNumbers - j;
        }
        for (int k = 0; k < nr - 1; k++) {
            c *= (nr - k);
        }
        return a / (b * c);
    }

    long calculateInOrder(int numOfNumbers, int numberBound) {
        long a = 1L;
        for (int i = 0; i < numOfNumbers; i++) {
            a *= numberBound - i;
        }
        return a;
    }
}