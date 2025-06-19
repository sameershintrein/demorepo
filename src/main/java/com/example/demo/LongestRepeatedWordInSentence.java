package com.example.demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestRepeatedWordInSentence {

    public static String findLongestRepeatedWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Create a map to store word frequencies
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Populate the map with word frequencies
        for (String word : words) {
            // Remove any non-alphabetic characters and convert to lowercase
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            // Update the word frequency
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        // Create a set to store repeated words
        Set<String> repeatedWords = new HashSet<>();

        // Populate the set with repeated words
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() > 1) {
                repeatedWords.add(entry.getKey());
            }
        }

        // Initialize variables to store the longest repeated word and its length
        String longestRepeatedWord = "";
        int maxLength = 0;

        // Iterate through the set of repeated words to find the longest one
        for (String word : repeatedWords) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longestRepeatedWord = word;
            }
        }

        return longestRepeatedWord;
    }

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumpsaa over the lazy dog and the brown fox jumpsaa over the dog.";
        String longestRepeatedWord = findLongestRepeatedWord(sentence);
        if (!longestRepeatedWord.isEmpty()) {
            System.out.println("Longest repeated word in the sentence: " + longestRepeatedWord);
        } else {
            System.out.println("No repeated words found in the sentence.");
        }
    }
}