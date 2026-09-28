package br.com.igorgc.concurrency.test;

import br.com.igorgc.concurrency.domain.Members;
import br.com.igorgc.concurrency.service.EmailDeliveryService;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread alice = new Thread(new EmailDeliveryService(members), "Alice");
        Thread bob = new Thread(new EmailDeliveryService(members), "Bob");

        alice.start();
        bob.start();

        while (true) {
            String email = JOptionPane.showInputDialog("Enter your email");

            if (email == null || email.isEmpty()) {
                members.close();
                break;
            }

            members.addMemberEmail(email);
        }
    }
}