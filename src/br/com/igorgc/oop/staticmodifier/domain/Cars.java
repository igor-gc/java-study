package br.com.igorgc.oop.staticmodifier.domain;

public class Cars {
    private String name;
    private double maxSpeed;
    // static belongs to the class, so all objects share the same value
    private static double speedLimit = 250;

    public Cars(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void print() {
        System.out.println("-------------");
        System.out.println("Name: " + this.name);
        System.out.println("Max speed: " + this.maxSpeed);
        System.out.println("Speed limit: " + Cars.speedLimit);
    }

    public static double getSpeedLimit() {
        return Cars.speedLimit;
    }

    public static void setSpeedLimit(double speedLimit) {
        Cars.speedLimit = speedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}