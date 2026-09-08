package br.com.igorgc.controlflow;

public class SwitchStatement {
    public static void main(String[] args) {

        // Print the day of the week, considering 1 as Sunday
        byte day = 5;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        // Using values from 1 to 7, print whether it is a weekday or weekend.
        // Considering 1 as Sunday
        byte weekDay = 7;

        switch (weekDay) {
            case 1:
            case 7:
                System.out.println("Weekend");
                break;

            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Weekday");
                break;

            default:
                System.out.println("Invalid option");
                break;
        }
    }
}