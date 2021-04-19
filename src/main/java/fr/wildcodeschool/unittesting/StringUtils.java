package fr.wildcodeschool.unittesting;

import java.util.*;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";
        if (candidate != null) {
            char[] letters = candidate.toCharArray();
            for (int i = 0; i < candidate.length(); i++) {
                if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                    vowels += letters[i];
                }
            }
        }
        return vowels;
    }

    public static String uniqueVowels(String candidate) {
        String uniqueVowels = "";
        char[] letters = vowels(candidate).toCharArray();
        ArrayList<Character> uniqueLetters = new ArrayList();
        boolean present = false;
        for (int i = 0; i < letters.length; i++) {
            present = false;
            for (int z = 0; z < uniqueLetters.size(); z++) {
                Character letter = letters[i];
                Character uniqueLetter = uniqueLetters.get(z);
                if (letter.toString().toUpperCase().equals(uniqueLetter.toString().toUpperCase())) {
                    present = true;
                }
            }
            if (!present) {
                uniqueLetters.add(letters[i]);
                uniqueVowels += letters[i];
            }
        }

        return uniqueVowels;
    }

}
