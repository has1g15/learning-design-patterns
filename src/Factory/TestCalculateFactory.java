package Factory;

import java.util.Scanner;

public class TestCalculateFactory {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = input.nextDouble();

        System.out.println("Enter second number");
        double num2 = input.nextDouble();

        System.out.println("Enter Calculation");

        CalculateFactory calculateFactory = new CalculateFactory();
        Calculate calculate = calculateFactory.getCalculation(input.next());
        calculate.calculate(num1, num2);
    }
}
