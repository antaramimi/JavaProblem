package miscellaneousproblems;

import java.util.Scanner;

public class PhoneBillCalculator {

    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter base cost of the plan:\n");
        double cost=scanner.nextDouble();
        System.out.println("Enter average minutes:\n");
        double min=scanner.nextDouble();

        calculateAndPrintBill(cost, calculateAverages(min),
                calculateTax(cost+calculateAverages(min)));

    }
    public static void calculateAndPrintBill(double base, double average, double tax ){
        double finalTotal = base + average + tax;
        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + String.format("%.2f", base));
        System.out.println("Overage: $" + String.format("%.2f", average));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", finalTotal));


    }
    public static double calculateAverages(double extraMinutes){
        double rate = 0.25;
        double averagefees=extraMinutes * rate;
      return averagefees;
    }
    public static double calculateTax(double subtotal){
        double rate = 0.15;
        double tax = subtotal * rate;
        return tax;
    }

        
}
