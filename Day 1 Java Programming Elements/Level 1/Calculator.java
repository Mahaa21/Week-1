import java.util.Scanner;
public class Calculator{
public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a number:");
float num1 = scanner.nextFloat();
System.out.println("Enter another number:");
float num2 = scanner.nextFloat();
float add = num1 + num2;
float sub = num1 - num2;
float mul = num1 * num2;
float div = num1 / num2;
System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is " + add + ", " + sub + ", " + mul + " and " + div );}}

