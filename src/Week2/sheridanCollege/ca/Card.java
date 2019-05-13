/*changes 1
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2.sheridanCollege.ca;

/**
 * This is a simple card class.
 *
 * @author Ali Hassan, May 13th 2019
 */
public class Card {

    private String suit; //Hearts, Clubs, Spades, Diamonds
    private int value; //1-13

    /**
     * Constructor to create card instances.
     *
     * @param suit
     * @param value
     */
    public Card(String suit, int value) {

        if (suit.equals("Hearts") || suit.equals("Spades")
                || suit.equals("Diamonds") || suit.equals("Clubs")) {
            this.suit = suit;
        }
        else
        System.out.println("Invalid Suit");
        if (value < 1 || value > 13) {
            System.out.println("Invalid Card value");
        } else {
            this.value = value;
        }
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

}
