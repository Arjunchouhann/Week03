package com.linearsearch;

public class SearchForSpecificWordInListOfSentences {

    public static String findSentenceWithWord(String[] sentences, String word) {
        // Perform linear search over each sentence
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence;  // Return the first sentence that contains the word
            }
        }
        return "Not Found";  // If no sentence contains the word
    }

    public static void main(String[] args) {
        // Creating a string array and assign values
        String[] sentences = {"My name is Arjun", "I love programming", "I am from Mechanical"};

        //Word that to be found
        String wordToFind = "Arjun";
        //Calling method
        System.out.println(findSentenceWithWord(sentences, wordToFind));

        //Calling Method and word to be found
        String wordNotFound = "Computer";
        System.out.println(findSentenceWithWord(sentences, wordNotFound));
    }
}
