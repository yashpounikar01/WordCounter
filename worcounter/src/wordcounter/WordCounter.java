package wordcounter;

import java.util.Scanner;

//Counter.java - Interface
interface Counter {
 int countWords(String text);
}

//WordCounter.java - Class implementing Counter interface
public class WordCounter implements Counter {
 @Override
 public int countWords(String text) {
     if (text == null || text.isEmpty()) {
         return 0;
     }

     String[] words = text.split("\\s+");
     return words.length;
 }

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     WordCounter wordCounter = new WordCounter();

     while (true) {
         System.out.println("Enter a text to count words (type 'exit' to end):");
         String userText = scanner.nextLine();

         // Check for exit condition
         if ("exit".equalsIgnoreCase(userText.trim())) {
             System.out.println("Exiting the program. Goodbye!");
             break;
         }

         // Count words and display the result
         int wordCount = wordCounter.countWords(userText);
         System.out.println("Word Count: " + wordCount);
     }

     // Close the scanner
     scanner.close();
 }
}
