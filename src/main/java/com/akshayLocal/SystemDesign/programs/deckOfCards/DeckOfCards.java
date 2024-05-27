package com.akshayLocal.SystemDesign.programs.deckOfCards;

import java.util.*;
import java.util.stream.Collectors;

public class DeckOfCards {
    private Card[] cards;

    public DeckOfCards() {
        this.cards = new Card[52];
        initializeDeckOfCards();
    }

    void initializeDeckOfCards() {
        int i = 0;
        while(i<this.cards.length) {
            /* Creating all possible cards... */
            for (Suits s : Suits.values()) {
                for (Ranks r : Ranks.values()) {
                    Card c = new Card(s, r);
                    this.cards[i++] = c;
                }
            }
        }
    }

    public Card[] getCards() {
        return cards;
    }

    public static void main(String args[]) {
        DeckOfCards deckOfCards = new DeckOfCards();
        //printDeck(deckOfCards);
        List<Card> rankSortedCardsList = sorteDeckBasedOnRank(deckOfCards);
        //printCardsDeckList(rankSortedCardsList);
        List<Card> suitsSortedCardsList = sorteDeckBasedOnSuits(deckOfCards);
        //printCardsDeckList(suitsSortedCardsList);
        Card deal = playerDealCard(rankSortedCardsList);
        System.out.println(deal);
    }

    static void shuffleDeck(DeckOfCards deckOfCards) {
        //Collections.shuffle(Arrays.asList(deckOfCards.getCards()));
    }

    static void printDeck(DeckOfCards deckOfCards) {
        System.out.println(deckOfCards.getCards().length);
        for(Card c: deckOfCards.getCards()) {
            System.out.println(c.getSuit() + " of " + c.getRank() );
        }
    }
    static void printCardsDeckList(List<Card> deckOfCards) {

        for(Card c: deckOfCards) {
            System.out.println(c.getSuit() + " of " + c.getRank() );
        }
    }

    static List<Card> sorteDeckBasedOnRank(DeckOfCards deckOfCards) {
        Comparator<Card> rankComparator = (s , r) -> s.getRank().compareTo(r.getRank());
        return Arrays.asList(deckOfCards.getCards()).stream()
                .sorted(rankComparator).collect(Collectors.toList());
    }

    static List<Card> sorteDeckBasedOnSuits(DeckOfCards deckOfCards) {
        Comparator<Card> suitsComparator = (s , r) -> s.getSuit().compareTo(r.getSuit());
        return Arrays.asList(deckOfCards.getCards()).stream()
                .sorted(suitsComparator).collect(Collectors.toList());
    }

    static Card playerDealCard(List<Card> deckOfCards) {

        int randomIndex = (int) (Math.random() * deckOfCards.size());
        return deckOfCards.get(randomIndex);
    }
}


