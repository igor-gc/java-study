package br.com.igorgc.threads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (this.emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " added email to the list");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");

        synchronized (this.emails) {
            while (this.emails.size() == 0) {
                if (!open) return null;

                System.out.println(Thread.currentThread().getName() + " no email available in the list, entering wait mode");
                this.emails.wait();
            }

            return this.emails.poll();
        }
    }

    public void close() {
        open = false;

        synchronized (this.emails) {
            System.out.println(Thread.currentThread().getName() + " notifying everyone that we are no longer accepting emails");
        }
    }
}