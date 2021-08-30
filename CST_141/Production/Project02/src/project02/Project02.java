package project02;

import java.util.Scanner;
import java.io.File;
import java.net.URL;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Dylan Cruz CST 141-SP17
 */
public class Project02 {

    int totalChars = 0;
    int totalWords = 0;
    ArrayList<Word> words = new ArrayList<>();
    ArrayList<Character> characters = new ArrayList<>();

    public Project02() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a URL: ");
        String url = keyboard.nextLine();
        processUrl(url);
    }

    public void processUrl(String urlString) {
        
        
        try {
            URL url = new URL(urlString);
            File output = new File("CruzCST141Project02Output.txt");
            PrintWriter printFile;
            Scanner inputFile;
            String inputLine;

            inputFile = new Scanner(url.openStream());
            while (inputFile.hasNextLine()) {
                inputLine = inputFile.nextLine();
                inputLine = inputLine.toUpperCase();
                processCharacters(inputLine);
                processWords(inputLine);
            }

            if (output.exists()) {
                System.out.println("CruzCST141Project02Output.txt already exists. Overwriting...");
            }

            printFile = new PrintWriter(output);
            printFile.println("Dylan Cruz - CST141 SP17");
            printFile.println("");
            printFile.println("Total Words: " + totalWords);
            printFile.println("Total Characters: " + totalChars);
            printFile.println("");
            printFile.println("* Sorted Words & Counts *");
            Collections.sort(words);
            for (Word word : words) {
                printFile.println(word.toString());
            }
            printFile.println();
            printFile.println("* Sorted Characters & Counts * ");
            Collections.sort(characters);
            for (Character character : characters) {
                printFile.println(character.toString());
            }
            printFile.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
    }

    public void processWords(String inputLine) {
        int placeInArray;
        String[] wordSubstrings;
        String regex = "(\\.)|(\\/)|(, *)|(: *)|( *\\= *)|(; *)|(! *)|( *\\( *)|(\\) *)|\\s";
        wordSubstrings = inputLine.split(regex);
        totalWords += wordSubstrings.length;
        Word wordObject;
        int lineLength = wordSubstrings.length;

        for (placeInArray = 0; placeInArray < lineLength; placeInArray++) {
            wordObject = new Word(wordSubstrings[placeInArray]);
            if (wordObject.searchList(words, wordObject) == -1) {
                words.add(wordObject);
                int index = wordObject.searchList(words, wordObject);
                words.get(index).setCount(1);
            } else {
                int index = wordObject.searchList(words, wordObject);
                incrementWordCount(index);
            }
        }
    }

    public void processCharacters(String inputLine) {
        int placeInArray;
        totalChars += inputLine.length();
        int lineLength = inputLine.length();
        String oneChar = "";
        Character charObject;

        for (placeInArray = 0; placeInArray < lineLength; placeInArray++) {
            oneChar = inputLine.substring(placeInArray, placeInArray + 1);
            charObject = new Character(oneChar);
            if (charObject.searchList(characters, charObject) == -1) {
                characters.add(charObject);
                int index = charObject.searchList(characters, charObject);
                characters.get(index).setCount(1);
            } else {
                int index = charObject.searchList(characters, charObject);
                incrementCharacterCount(index);
            }
        }
    }

    public void incrementWordCount(int index) {
        words.get(index).setCount(words.get(index).getCount() + 1);
    }

    public void incrementCharacterCount(int index) {
        characters.get(index).setCount(characters.get(index).getCount() + 1);
    }

    public static void main(String[] args) {
        new Project02();
    }
}
