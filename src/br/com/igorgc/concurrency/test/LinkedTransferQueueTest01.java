package br.com.igorgc.concurrency.test;

import java.util.concurrent.*;

public class LinkedTransferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentLinkedQueue, SynchronousQueue, LinkedBlockingQueue
        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Bob"));
        System.out.println(tq.offer("Bob"));
        System.out.println(tq.offer("Bob", 10, TimeUnit.SECONDS));
        tq.put("Java");
        if (tq.hasWaitingConsumer()) {
            tq.transfer("Spring");
        }
        System.out.println(tq.tryTransfer("Backend"));
        System.out.println(tq.tryTransfer("Backend", 5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}