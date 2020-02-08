package Program1lastdayzad2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> words = WordProvider.provide();

        List<String> wordsOnLetterD = words.stream()
                .filter(singleWord -> singleWord.startsWith("d"))
                .collect(Collectors.toList());
        System.out.println(wordsOnLetterD);

        List<String> shortWordsOnLetterA = words.stream()
                .filter(word -> word.startsWith("a") && word.length() <= 4)
                .collect(Collectors.toList());
        System.out.println(shortWordsOnLetterA);
    }
}