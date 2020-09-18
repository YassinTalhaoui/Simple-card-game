/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g54892.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This classe represents the decks, and contains differents methods, that
 * allows to manipulate the cards.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class Deck {

    List<Card> deck;

    /**
     * Constrctor of Deck, that creates the deck.
     */
    public Deck() {
        deck = new ArrayList<>();
        for (Color d : Color.values()) {
            for (Value e : Value.values()) {
                Card c = new Card(d, e);
                deck.add(c);
            }
        }
    }

    /**
     * Shuffles all the cards of the deck.
     */
    public void shuffle() {
        Collections.shuffle(deck);
    }

    /**
     * Cheks that the deck is empty.
     *
     * @return true if the deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return deck.isEmpty();
    }

    /**
     * Returns the card taken from the top of the deck and removes it from the
     * deck
     *
     * @return the card at the top.
     */
    public Card hit() {
        Card drawn = deck.get(0);
        deck.remove(0);
        return drawn;
    }

    /**
     * Gives the current size of the deck of cards.
     *
     * @return the size of the deck.
     */
    public int size() {
        return deck.size();
    }

    /**
     * This object (which is already a string!) is itself returned.
     *
     * @return the string itself.
     */
    @Override
    public String toString() {
        return "Deck{" + "deck=" + deck + '}';
    }
}
