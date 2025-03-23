import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = sc.nextDouble();

        double bmi = weight / (height * height);
        System.out.println("BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}