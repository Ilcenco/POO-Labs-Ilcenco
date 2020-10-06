package com.company.LAB_3;

import java.util.ArrayList;
import java.util.Arrays;

public class TextManipulation {
    Text t = new Text();
    String t_text_Copy = "";
    String longest_word;
    int most_often[] = new int[99999];


    // This function count how many sentences do we have
    public int count_sentence() {
        for (int i = 0; i < t.text.length(); i++) {
            if (t.text.charAt(i) == '.' || t.text.charAt(i) == '!' || t.text.charAt(i) == '?') {
                t.sentence++;
            }
        }
        return t.sentence;
    }


    // This function count how many words do we have
    public int count_words() {
        for (int i = 0; i < t.text.length(); i++) {
            if (t.text.charAt(i) == ' ') {
                t.words++;
            }
        }
        return t.words;
    }


    // Here we count letter
    public int count_letters() {
        for (int i = 0; i < t.text.length(); i++) {
            if (t.text.charAt(i) == ' ' || t.text.charAt(i) == '.' || t.text.charAt(i) == ',' || t.text.charAt(i) == '!' || t.text.charAt(i) == '?') {
                continue;
            } else {
                if (t.text.charAt(i) == 'a' || t.text.charAt(i) == 'A' || t.text.charAt(i) == 'e' || t.text.charAt(i) == 'E' || t.text.charAt(i) == 'I' || t.text.charAt(i) == 'i' || t.text.charAt(i) == 'o' || t.text.charAt(i) == 'O' || t.text.charAt(i) == 'u' || t.text.charAt(i) == 'U') {
                    t.vowels++;
                } else {
                    t.consonants++;
                }
                t.letters++;
            }
        }
        return t.letters;
    }


    // we make our text without signs and lowercase
    public void reduce_signs() {
        for (int i = 0; i < t.text.length(); i++) {
            if (t.text.charAt(i) != '.' && t.text.charAt(i) != '!' && t.text.charAt(i) != '?' && t.text.charAt(i) != ',') {
                t_text_Copy = t_text_Copy + t.text.charAt(i);
            }
        }
        t_text_Copy = t_text_Copy.toLowerCase();
    }


    // we take the words and put them in a list
    public void take_words() {
        int i_array = 0;
        String word = "";
        for (int i = 0; i < t_text_Copy.length(); i++) {
            if (t_text_Copy.charAt(i) != ' ') {
                word = word + t_text_Copy.charAt(i);
            } else {
                t.words_appart.add(i_array, word);
                i_array++;
                word = "";
            }
        }
    }



    // here we iterate through the words and see how many are the same/repeated
    public void reduce_same_words() {
        int index = 0;
        for (int i = 0; i < t.words_appart.size(); i++) {
            most_often[i] = 0;
        }
        for (String s : t.words_appart) {
            for (String s1 : t.words_appart) {
                if (s.contains(s1) && s.length() == s1.length()) {
                    most_often[index] += 1;
                }
            }
            index++;
        }
    }


    // we find the longest word from the words list
    public String get_longest_word() {
        longest_word = t.words_appart.get(0);
        for (String s : t.words_appart) {
            if (s.length() > longest_word.length()) {
                longest_word = s;
            }
        }
        return longest_word;
    }


    // we find the top 5 met words
    public ArrayList<String> get_top_5() {
        ArrayList<String> top5 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int max = Arrays.stream(most_often).max().getAsInt();
            for (int j = 0; j < t.words_appart.size() - 1; j++) {
                if (most_often[j] == max) {
                    top5.add(t.words_appart.get(j));
                    break;
                }
            }
            for (int j = 0; j < t.words_appart.size() - 1; j++) {
                if (top5.get(i).contains(t.words_appart.get(j)) && top5.get(i).length() == t.words_appart.get(j).length()) {
                    t.words_appart.remove(j);

                }
            }

        }
        return top5;
    }
}
