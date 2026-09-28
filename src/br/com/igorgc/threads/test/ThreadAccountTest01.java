package br.com.igorgc.threads.test;

import br.com.igorgc.threads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 threadAccountTest01 = new ThreadAccountTest01();
        Thread t1 = new Thread(threadAccountTest01, "Alice");
        Thread t2 = new Thread(threadAccountTest01, "Bob");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withdraw(10);
            if (account.getBalance() < 0) {
                System.out.println("INSUFFICIENT BALANCE");
            }
        }
    }

    private void withdraw(int amount) {
        System.out.println(getThreadName() + " #### outside synchronized");
        synchronized (account) {
            System.out.println(getThreadName() + " **** inside synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " is withdrawing money");
                account.withdraw(amount);
                System.out.println(getThreadName() + " completed the withdrawal, current account balance " + account.getBalance());
            } else {
                System.out.println("Insufficient balance for " + getThreadName() + " to withdraw " + account.getBalance());
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }
}