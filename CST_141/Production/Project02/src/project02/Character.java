package project02;

import java.util.ArrayList;

/**
 * Dylan Cruz CST 141-SP17
 */
public class Character implements Comparable<Character> {

    private String letter;
    private int count;

    public Character(String letter, int count) {
        this.letter = letter;
        this.count = count;
    }

    public Character(String letter) {
        this.letter = letter;
    }

    public int searchList(ArrayList<Character> characters, Character charObject) {
        int foundIndex = -1;
        if (characters.size() < 1) {
            return foundIndex;
        }

        for (int count = 0; count < characters.size(); count++) {
            if (characters.get(count).getLetter().equals(charObject.getLetter())) {
                foundIndex = count;
                return foundIndex;
            }
        }
        return foundIndex;
    }

    public int compareTo(Character otherChar) {
        return letter.compareTo(otherChar.getLetter());
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return "Character: " + this.letter + " Count: " + this.count;
    }

}
