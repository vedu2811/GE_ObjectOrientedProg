public class DeckOfCards {

    private static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"};
    private static final int NUM_PLAYERS = 4;
    private static final int CARDS_PER_PLAYER = 9;

    public static void main(String[] args) {

        int n = SUITS.length * RANKS.length;
        Card[] deck = new Card[n];

        for (int i = 0; i < RANKS.length; i++) {
            for (int j = 0; j < SUITS.length; j++) {
                int index = SUITS.length * i + j;
                deck[index] = new Card(RANKS[i], SUITS[j], i);
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            Card temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        Queue<Player> playerQueue = new Queue<>();

        for (int i = 0; i < NUM_PLAYERS; i++) {
            Player p = new Player(i + 1);
            playerQueue.enqueue(p);
        }

        int deckIndex = 0;

        for (int i = 0; i < CARDS_PER_PLAYER; i++) {
            for (int j = 0; j < NUM_PLAYERS; j++) {
                Player currentPlayer = playerQueue.dequeue();
                currentPlayer.addCard(deck[deckIndex]);
                deckIndex++;
                playerQueue.enqueue(currentPlayer);
            }
        }
        for (int i = 0; i < NUM_PLAYERS; i++) {
            Player currentPlayer = playerQueue.dequeue();
            currentPlayer.sortHandByRank();
            currentPlayer.printCards();
            playerQueue.enqueue(currentPlayer);
        }
    }
}