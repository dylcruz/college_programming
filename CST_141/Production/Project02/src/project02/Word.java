package project02;

import java.util.ArrayList;

/**
 * Dylan Cruz CST 141-SP17
 */
public class Word implements Comparable<Word> {

    private String word;
    private int count;

    public Word(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public Word(String word) {
        this.word = word;
    }

    public int searchList(ArrayList<Word> words, Word wordObject) {
        int foundIndex = -1;
        if (words.size() < 1) {
            return foundIndex;
        }

        for (int count = 0; count < words.size(); count++) {
            if (words.get(count).getWord().equals(wordObject.getWord())) {
                foundIndex = count;
                return foundIndex;
            }
        }
        return foundIndex;
    }

    public int compareTo(Word otherWord) {
        return word.compareTo(otherWord.getWord());
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String toString() {
        return "Word: " + this.word + " Count: " + this.count;
    }

}
