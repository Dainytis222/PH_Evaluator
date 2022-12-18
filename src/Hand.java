public class Hand {

  private Card[] hand;

  public Hand(Card[] hand) {
    this.hand = hand;
  }

  public long isRoyalFlash() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();
    int card11 = hand[0].getSuit();
    int card22 = hand[1].getSuit();
    int card33 = hand[2].getSuit();
    int card44 = hand[3].getSuit();
    int card55 = hand[4].getSuit();

    long royalFlash = 90000000000L;
    long result = 0;
    if (card11 == card22 && card22 == card33 && card33 == card44 && card44 == card55 &&
        card1 == 14 && card5 == 10) {
      result =
          royalFlash + (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100)
              + card5;
    }
    return result;
  }

  public long isStraightFlash() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();
    int card11 = hand[0].getSuit();
    int card22 = hand[1].getSuit();
    int card33 = hand[2].getSuit();
    int card44 = hand[3].getSuit();
    int card55 = hand[4].getSuit();

    long straightFlash = 80000000000L;
    long result = 0;

    if ((card11 == card22 && card22 == card33 && card33 == card44 && card44 == card55) && (
        card1 <= 13 && card5 == card1 - 4)) {
      result =
          straightFlash + (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100)
              + card5;
    } else if ((card11 == card22 && card22 == card33 && card33 == card44 && card44 == card55)
        && (card1 == 14 && card2 == 5 && card5 == 2)) {
      result =
          straightFlash + 100000000 + (card2 * 1000000) + (card3 * 10000) + (card4 * 100) + card5;
    }
    return result;
  }

  public long isFourOfKind() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();

    long fourOfKind = 70000000000L;
    long result = 0;

    if (card1 == card4) {
      result =
          fourOfKind + (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100)
              + card5;
    } else if (card2 == card5) {
      result =
          fourOfKind + (card2 * 100000000) + (card3 * 1000000) + (card4 * 10000) + (card5 * 100)
              + card1;
    }
    return result;
  }

  public long isFullHouse() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();

    long fullHouse = 60000000000L;
    long result = 0;

    if (card1 == card3 && card4 == card5) {
      result = fullHouse + (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100)
          + card5;
    } else if (card1 == card2 && card3 == card5) {
      result = fullHouse + (card3 * 100000000) + (card4 * 1000000) + (card5 * 10000) + (card1 * 100)
          + card2;
    }
    return result;
  }

  public long isFlash() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();
    int card11 = hand[0].getSuit();
    int card22 = hand[1].getSuit();
    int card33 = hand[2].getSuit();
    int card44 = hand[3].getSuit();
    int card55 = hand[4].getSuit();

    long flash = 50000000000L;
    long result = 0;

    if (card11 == card22 && card22 == card33 && card33 == card44 && card44 == card55) {
      result =
          flash + (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100) + card5;
    }
    return result;
  }

  public long isStraight() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();

    long straight = 40000000000L;
    long result = 0;

    if (card1 <= 14 && card2 == card1 - 1 && card3 == card1 - 2 && card4 == card1 - 3 && card5 == card1 - 4) {
      result = straight + (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100)
          + card5;
    } else if ((card1 == 14 && card2 == 5 && card3 == 4 && card4 == 3 && card5 == 2)) {
      result = straight + 100000000 + (card2 * 1000000) + (card3 * 10000) + (card4 * 100) + card5;
    }
    return result;
  }


  public long isThreeOfKind() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();

    long threeOfKind = 30000000000L;
    long result = 0;

    if (card1 == card3) {
      result =
          threeOfKind + (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100)
              + card5;
    } else if (card2 == card4) {
      result =
          threeOfKind + (card2 * 100000000) + (card3 * 1000000) + (card4 * 10000) + (card1 * 100)
              + card5;
    } else if (card3 == card5) {
      result =
          threeOfKind + (card3 * 100000000) + (card4 * 1000000) + (card5 * 10000) + (card1 * 100)
              + card2;
    }
    return result;
  }

  public long isTwoPair() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();

    long twoPair = 20000000000L;
    long result = 0;

    if (card1 == card2 && card3 == card4) {
      result = twoPair + (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100)
          + card5;
    } else if (card1 == card2 && card4 == card5) {
      result = twoPair + (card1 * 100000000) + (card2 * 1000000) + (card4 * 10000) + (card5 * 100)
          + card3;
    } else if (card2 == card3 && card4 == card5) {
      result = twoPair + (card2 * 100000000) + (card3 * 1000000) + (card4 * 10000) + (card5 * 100)
          + card1;
    }
    return result;
  }

  public long isOnePair() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();

    long onePair = 10000000000L;
    long result = 0;

    if (card1 == card2) {
      result = onePair + (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100)
          + card5;
    }  else if (card2 == card3) {
      result = onePair + (card2 * 100000000) + (card3 * 1000000) + (card1 * 10000) + (card4 * 100)
          + card5;
    } else if (card3 == card4) {
      result = onePair + (card3 * 100000000) + (card4 * 1000000) + (card1 * 10000) + (card2 * 100)
          + card5;
    } else if (card4 == card5) {
      result = onePair + (card4 * 100000000) + (card5 * 1000000) + (card1 * 10000) + (card2 * 100)
          + card3;
    }
    return result;
  }

  public long isHighCard() {
    int card1 = hand[0].getRank();
    int card2 = hand[1].getRank();
    int card3 = hand[2].getRank();
    int card4 = hand[3].getRank();
    int card5 = hand[4].getRank();

    long result = 0;
    result = (card1 * 100000000) + (card2 * 1000000) + (card3 * 10000) + (card4 * 100) + card5;
    return result;
  }

  public long highestCombination() {
    long result = 0;

    result = this.isRoyalFlash();
    if (result != 0) {
      return result;
    }

    result = this.isStraightFlash();
    if (result != 0) {
      return result;
    }

    result = this.isFourOfKind();
    if (result != 0) {
      return result;
    }

    result = this.isFullHouse();
    if (result != 0) {
      return result;
    }

    result = this.isFlash();
    if (result != 0) {
      return result;
    }

    result = this.isStraight();
    if (result != 0) {
      return result;
    }

    result = this.isThreeOfKind();
    if (result != 0) {
      return result;
    }

    result = this.isTwoPair();
    if (result != 0) {
      return result;
    }

    result = this.isOnePair();
    if (result != 0) {
      return result;
    }

    return this.isHighCard();
  }

  public Card[] getHand() {
    return hand;
  }
}
