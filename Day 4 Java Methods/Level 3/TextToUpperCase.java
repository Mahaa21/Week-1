import java.util.Scanner;

public class TextToUpperCase{
    public static String manualToUpperCase(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32); 
            }
            
            result.append(ch);
        }
        
        return result.toString();
    }
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false; 
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; 
            }
        }
        
        return true; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        String builtInUpperCase = userInput.toUpperCase();
		String manualUpperCase = manualToUpperCase(userInput);

        boolean areEqual = compareStrings(builtInUpperCase, manualUpperCase);

        System.out.println("\nOriginal Text: " + userInput);
        System.out.println("Built-in toUpperCase(): " + builtInUpperCase);
        System.out.println("Manual Conversion: " + manualUpperCase);
        System.out.println("Are both methods producing the same result? " + areEqual);

        scanner.close();
    }
}
