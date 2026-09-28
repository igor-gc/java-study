package br.com.igorgc.concurrency.domain;

public class Discount {
    public enum Code {
        NONE(0), BASIC(5), STANDARD(10), PREMIUM(15);
        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
