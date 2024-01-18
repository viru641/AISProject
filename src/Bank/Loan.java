package Bank;

import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter debt value (in euros): ");
        double debt = scanner.nextDouble();

        System.out.print("Enter interest rate (percentage): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter payback duration (months): ");
        int duration = scanner.nextInt();

        double monthlyRate = calculateMonthlyRate(debt, interestRate, duration);
        int numberOfRates = calculateNumberOfRates(debt, monthlyRate);
        double overallDebt = calculateOverallDebt(debt, numberOfRates, monthlyRate);

        System.out.println("Monthly Rate: " + monthlyRate);
        System.out.println("Number of Rates: " + numberOfRates);
        System.out.println("Overall Debt: " + overallDebt);
    }

    public static double calculateMonthlyRate(double debt, double interestRate, int duration) {
        double monthlyInterestRate = interestRate / 100 / 12;
        return (debt * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -duration));
    }

    public static int calculateNumberOfRates(double debt, double monthlyRate) {
        return (int) Math.ceil(debt / monthlyRate);
    }

    public static double calculateOverallDebt(double debt, int numberOfRates, double monthlyRate) {
        return (debt + (numberOfRates * monthlyRate));
    }
}
