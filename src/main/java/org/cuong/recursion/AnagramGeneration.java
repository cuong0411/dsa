package org.cuong.recursion;

import java.util.ArrayList;
import java.util.List;

public class AnagramGeneration {
    public static void main(String[] args) {
        String a = "abc";
        anagramOf(a).forEach(System.out::println);
    }

    static List<String> anagramOf(String s) {
        if (s.length() == 1)
            return List.of(String.valueOf(s.charAt(0)));

        List<String> conllection = new ArrayList<>();
        List<String> substringAnagrams = anagramOf(s.substring(1));
        for (String substringAnagram : substringAnagrams) {
            for (int i = 0; i < substringAnagram.length(); i++) {
                String copy = new String(substringAnagram);
                conllection.add(copy.substring(0, i) + String.valueOf(s.charAt(0)) + copy.substring(i));
            }
        }
        return conllection;
    }
}
