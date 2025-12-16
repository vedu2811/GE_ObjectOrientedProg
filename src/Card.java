class Card {
    private String rank;
    private String suit;
    private int rankValue;

    public Card(String rank, String suit, int rankValue) {
        this.rank = rank;
        this.suit = suit;
        this.rankValue = rankValue;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public int getRankValue() {
        return rankValue;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}