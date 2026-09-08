package br.com.igorgc.controlflow;

public class ContinueStatement {
    public static void main(String[] args) {
        // Given the total price of a car, find out how many installments are possible
        // Condition: installment amount >= 1000

        double totalPrice = 30000;

        for (int installment = (int) totalPrice; installment >= 1; installment--) {
            double installmentAmount = totalPrice / installment;

            if (installmentAmount < 1000) {
                continue;
            }

            System.out.println("Installment " + installment + " R$ " + installmentAmount);
        }
    }
}