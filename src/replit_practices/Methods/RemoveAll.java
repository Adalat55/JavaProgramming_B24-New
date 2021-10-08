package replit_practices.Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveAll {
    public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord) {

        ArrayList<String> removed = new ArrayList<>();
        ArrayList<String> targetWords = new ArrayList<>(Arrays.asList(targetWord));

        for (String each : wordList) {

            wordList.removeIf(n -> n.equals(targetWord));

        }
        return wordList;


    }

    public static void main(String[] args) {

    }
}