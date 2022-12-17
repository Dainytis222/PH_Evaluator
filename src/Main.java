import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    int player1Wins = 0;
    int player2Wins = 0;
    int draw = 0;

    URL allHands = new URL("https://projecteuler.net/project/resources/p054_poker.txt");
    Scanner sc = new Scanner(allHands.openStream());

    while (sc.hasNextLine()) {

      String bothHands = sc.nextLine();
      // "8C TS KC 9H 4S 7D 2S 5D 3S AC"

      String[] arrBothHands = bothHands.split(" ");
      // ["8C", "TS", "KC", "9H", "4S", "7D", "2S", "5D", "3S", "AC"]

      Card[] cardsBothHands = new Card[10];
      // [ , , , , , , , , , ]

      for (int i = 0; i < 10; i++) {
        String s = arrBothHands[i]; // "8C"
        Card card = new Card(s); // Card("8C")
        cardsBothHands[i] = card; // [Card("8C"), Card(), , , , , , , , ]
      }

      Card[] arrFirstPlayerHand = Arrays.copyOfRange(cardsBothHands, 0, 5);
      Card[] arrSecondPlayerHand = Arrays.copyOfRange(cardsBothHands, 5, 10);

      Arrays.sort(arrFirstPlayerHand, Comparator.reverseOrder());
      Arrays.sort(arrSecondPlayerHand, Comparator.reverseOrder());

//    System.out.println(Arrays.toString(cardsBothHands));
//    System.out.println(Arrays.toString(arrFirstPlayerHand));
//    System.out.println(Arrays.toString(arrSecondPlayerHand));

      Hand hand1 = new Hand(arrFirstPlayerHand);
      Hand hand2 = new Hand(arrSecondPlayerHand);

      if (hand1.highestCombination() > hand2.highestCombination()) {
        player1Wins++;
      } else if (hand1.highestCombination() < hand2.highestCombination()) {
        player2Wins++;
      } else {
        draw++;
      }
      ;
    }
    sc.close();

    System.out.println("Player-1 wins " + player1Wins + " hands");
    System.out.println("Player-2 wins " + player2Wins + " hands");
    System.out.println(draw + " draw");
  }

}
