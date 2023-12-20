class Lottery {
    int numOfNumbers;
    int numberBound;
    int gameId;
    String rules;

    void set(int gameId, String rules) {
        this.gameId = gameId;
        this.rules = rules;
    }

    void print() {
        System.out.println("GAME " + this.gameId);
        System.out.println(this.rules);
        System.out.println("Numbers cannot duplicate, otherwise they are not included");
    }
}
