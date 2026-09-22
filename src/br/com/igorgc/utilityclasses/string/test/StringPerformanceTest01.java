package br.com.igorgc.utilityclasses.string.test;

public class StringPerformanceTest01 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        concatenateString(30_000);
        long end = System.currentTimeMillis();
        System.out.println("Time spent with String: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatenateStringBuilder(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time spent with StringBuilder: " + (end - start) + "ms");

        start = System.currentTimeMillis();
        concatenateStringBuffer(1_000_000);
        end = System.currentTimeMillis();
        System.out.println("Time spent with StringBuffer: " + (end - start) + "ms");
    }

    private static void concatenateString(int size) {
        String text = "Hello, my name is Gabriel";

        for (int i = 0; i < size; i++) {
            text += i;
        }
    }

    private static void concatenateStringBuilder(int size) {
        StringBuilder stringBuilder = new StringBuilder(size);

        for (int i = 0; i < size; i++) {
            stringBuilder.append(i);
        }
    }

    private static void concatenateStringBuffer(int size) {
        StringBuffer stringBuffer = new StringBuffer(size);

        for (int i = 0; i < size; i++) {
            stringBuffer.append(i);
        }
    }
}