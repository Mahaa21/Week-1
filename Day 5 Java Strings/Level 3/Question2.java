import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int length = input.length();

        System.out.println("Length of the string: " + length);

        System.out.println("Characters and their positions:");
        for (int i = 0; i < length; i++) {
            System.out.println("Position " + i + ": " + input.charAt(i));
        }

        System.out.print("Characters at even positions: ");
        for (int i = 0; i < length; i += 2) {
            System.out.print(input.charAt(i));
        }
        System.out.println();

        System.out.print("Characters at odd positions: ");
        for (int i = 1; i < length; i += 2) {
            System.out.print(input.charAt(i));
        }
        System.out.println();

        int vowels = 0, consonants = 0;
        for (int i = 0; i < length; i++) {
            char ch = Character.toLowerCase(input.charAt(i));
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}