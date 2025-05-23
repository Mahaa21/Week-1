import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
		int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        scanner.close();
    }
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        if (divisor == 0) { 
            System.out.println("Number of children cannot be zero!");
            return new int[]{0, number}; 
        }
        int quotient = number / divisor;  
        int remainder = number % divisor; 
        return new int[]{quotient, remainder}; 
		}
}
