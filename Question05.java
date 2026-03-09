import java.util.Scanner;

public class Question05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];

        int totalCharacters = 0;
        String longestWord = "";

        System.out.println("Enter 5 words:");

        for (int i = 0; i < 5; i++) {
            words[i] = input.nextLine();

            totalCharacters += words[i].length();

            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Total characters: " + totalCharacters);

        System.out.println("Words with even number of characters:");

        for (int i = 0; i < 5; i++) {
            if (words[i].length() % 2 == 0) {
                System.out.println(words[i]);
            }
        }
    }
}