# Poker-Hand-Evaluator
Poker Hand Evaluator
Each hand corresponds to an eleven-digit number, the first digit of which represents the strength of the combination. The stronger the combination, the higher the number. 9 - means Royal Flush, 8 - Straight Flush, 7 - Four Of A Kind, 6 - Full House, 5 - Flush, 4 - Straight, 3 - Three Of A Kind, 2 - Two Pairs, 1 - One Pair, 0 or no number – High Card. The next 10 digits correspond to the rank of the 5 cards, which are sorted in descending order. So Ace is 14, King is 13, Queen is 12, Jack is 11, 10 is 10, and so on. For example, Royal Flush will correspond to the number 91413121110, and a Full House of Aces and Kings will correspond to 61414141313. These numbers are obtained using various methods to compare the cards. The hand with the highest number is the winner.

Likewise, each card suit is also matched to a number: Spades - 1, Hearts - 2, Diamonds - 3, Clubs - 4. These numbers are only used in methods that require checking all card suits.
