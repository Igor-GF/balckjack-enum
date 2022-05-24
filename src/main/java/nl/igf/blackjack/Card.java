package nl.igf.blackjack;

import javax.swing.*;

public class Card {

    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String suit, String rank) {
        this.suit = Suit.valueOf(suit.toUpperCase());
        this.rank = Rank.valueOf(rank.toUpperCase());
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public static void main(String[] args) {
        Card cardOne = new Card(Suit.DIAMONDS, Rank.TEN);
        Card cardTwo = new Card(Suit.HEART, Rank.JACK);
        Card cardThree = new Card("spades", "queen");

        System.out.println(cardOne);
        System.out.println(cardTwo);
        System.out.println(cardThree);
    }

    public int getValue() {
        return this.rank.getValue();
    }

    @Override
    public String toString() {
        // JACK {Club symbol}
        return this.rank.toString().concat(" ").concat(this.suit.toString());
    }
}
