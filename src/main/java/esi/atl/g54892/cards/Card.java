/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g54892.cards;

/**
 * This class represents each card of the deck.
 *
 * @author Talhaoui Yassin - G54892.
 */
public class Card {

    Color color;
    Value value;

    /**
     * Constructor of Card.
     *
     * @param color the color of the card (enumeration).
     * @param value the value of the card (enumeration).
     */
    public Card(Color color, Value value) {
        if (color == null || value == null) {
            throw new IllegalArgumentException("Illegal Argument !!!");
        }
        this.color = color;
        this.value = value;
    }

    /**
     * Simple getter of color.
     *
     * @return the color of the card.
     */
    public Color getColor() {
        return color;
    }

    /**
     * Simple getter of getValue.
     *
     * @return the value of the card.
     */
    public Value getValue() {
        return value;
    }

    /**
     * This object (which is already a string!) is itself returned.
     *
     * @return the string itself.
     */
    @Override
    public String toString() {
        return "Card{" + value + " of " + color + '}' + "\n";
    }
}
