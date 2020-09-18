/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g54892.cards;

/**
 * This class contains a main methode that which creates a deck of cards,
 * shuffles it, anddraws and displays the first n cards.
 *
 * @author Talhaoui Yassin -G54892.
 */
public class Main {

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        int n = Integer.parseInt(args[0]);
        if (n > 52 || n < 0) {
            throw new IllegalArgumentException("Illegal argument !!");
        }
        for (int i = 1; i <= n; i++) {
            System.out.println("Drawn card " + i + " : " + deck.hit());
        }
    }
}
