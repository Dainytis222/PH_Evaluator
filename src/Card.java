public class Card implements Comparable<Card> {

  private int rank;
  private int suit;

  public Card(int rank, int suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Card(String card) {
    String rank = card.substring(0, 1);
    String suit = card.substring(1, 2);

    // Vary from 2 to 14. 10 = Ten, 11 = Jack, 12 = Queen, 13 = King, 14 =  Ace.
    rank = rank.replace("T", "10")
        .replace("J", "11")
        .replace("Q", "12")
        .replace("K", "13")
        .replace("A", "14");

    // Vary from 1 to 4. 1 = Spades, 2 = Hearts, 3 = Diamonds, 4 = Clubs.
    suit = suit.replace("S", "1")
        .replace("H", "2")
        .replace("D", "3")
        .replace("C", "4");

    this.rank = Integer.parseInt(rank);
    this.suit = Integer.parseInt(suit);
    ;
  }

  @Override
  public String toString() {
    return "Card: rank='" + rank + "', suit='" + suit + "'";
  }

  public int getRank() {
    return rank;
  }

  public int getSuit() {
    return suit;
  }

  @Override
  public int compareTo(Card o) {
    return this.rank - o.rank;
  }
}
