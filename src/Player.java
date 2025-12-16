class Player {
    private int id;
    private Queue<Card> hand;

    public Player(int id) {
        this.id = id;
        this.hand = new Queue<>();
    }

    public int getId() {
        return id;
    }

    public Queue<Card> getHand() {
        return hand;
    }

    public void addCard(Card card) {
        hand.enqueue(card);
    }
    public void sortHandByRank() {
        final int HAND_SIZE = 9;
        Card[] tempHand = new Card[HAND_SIZE];
        int count = 0;

        while (!hand.isEmpty() && count < HAND_SIZE) {
            tempHand[count++] = hand.dequeue();
        }

        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (tempHand[j].getRankValue() > tempHand[j+1].getRankValue()) {
                    Card temp = tempHand[j];
                    tempHand[j] = tempHand[j+1];
                    tempHand[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            hand.enqueue(tempHand[i]);
        }
    }

    public void printCards() {
        System.out.println("Player " + id + "'s Hand (Sorted by Rank):");
        System.out.print("[");
        Card[] cardsToPrint = new Card[9];
        int i = 0;
        while (!hand.isEmpty()) {
            cardsToPrint[i] = hand.dequeue();
            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.print(cardsToPrint[j]);
            if (j < i - 1) {
                System.out.print(", ");
            }
            hand.enqueue(cardsToPrint[j]);
        }
        System.out.println("]");
    }
}