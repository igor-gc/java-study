package br.com.igorgc.controlflow;

public class BreakStatementExercise {
    public static void main(String[] args) {
        // Given the total price of a car, find out how many installments are possible
        // Condition: installment amount >= 1000

        double totalPrice = 30000;

        for (int installment = 1; installment <= totalPrice; installment++) {
            double installmentAmount = totalPrice / installment;

            if (installmentAmount < 1000) {
                break;
            }

            System.out.println("Installment " + installment + " R$ " + installmentAmount);
        }
    }
}