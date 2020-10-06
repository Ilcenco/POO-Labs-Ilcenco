package com.company.LAB_3;

public class Lab3main {
    public static void main(String[] args) {
        TextManipulation textManipulation = new TextManipulation();

        System.out.println("There are " + textManipulation.count_words() + " words in our text");
        System.out.println("There are " + textManipulation.count_sentence() + " sentences in our text");
        System.out.println("there are " + textManipulation.count_letters() + " letters in our text");
        System.out.println("There are " + textManipulation.t.vowels + " vowels in our text");
        System.out.println("there are " + textManipulation.t.consonants + " consonants in pur text");

        textManipulation.reduce_signs();
        textManipulation.take_words();
        textManipulation.reduce_same_words();

        System.out.println("Longest word is: " + textManipulation.get_longest_word());
        System.out.println("Top 5 often words are: " + textManipulation.get_top_5());


    }
}
