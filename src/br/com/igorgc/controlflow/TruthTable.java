package br.com.igorgc.controlflow;

public class TruthTable {
    public static void main(String[] args) {

        double annualSalary = 70000;

        double firstTaxRate = 9.70 / 100;
        double secondTaxRate = 37.35 / 100;
        double thirdTaxRate = 49.50 / 100;

        double taxAmount;

        if (annualSalary <= 34712) {
            taxAmount = annualSalary * firstTaxRate;
        } else if (annualSalary >= 34713 && annualSalary <= 68507) {
            taxAmount = annualSalary * secondTaxRate;
        } else {
            taxAmount = annualSalary * thirdTaxRate;
        }

        System.out.println(taxAmount);
    }
}