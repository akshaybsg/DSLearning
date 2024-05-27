package com.akshayLocal.SystemDesign.programs.deckOfCards;

public class Card implements Comparable<Card>{

    private Suits suit;
    private Ranks rank;

    public Card(Suits suit, Ranks rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suits getSuit() {
        return suit;
    }

    public Ranks getRank() {
        return rank;
    }

    @Override
    public int compareTo(Card c) {
        return c.rank.ordinal() - this.rank.ordinal();
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", rank=" + rank +
                '}';
    }
}
