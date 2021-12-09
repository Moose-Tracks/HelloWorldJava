package academy.learnprogramming;

import java.util.Locale;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        //Switches are good for testing variaties of input through a single variable
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }
        int switchValue = 4;

        switch (switchValue) {
            case 1:
                //begins Execution here
                System.out.println("Value was 1");
                break;
            //breaks loop and begins processes below
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break; //Not necessarily needed as default-end closes loop automatically
        }

        char switchNew = 'B';

        switch (switchNew) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("You Found " + switchNew + "!");
                break;
            default:
                System.out.println(INVALID_VALUE_MESSAGE);
        }

        String month = "JANuary";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;
            case "february":
                System.out.println("Feb");
                break;
            default:
                System.out.println("Not Sure");

        }
        printDayOfTheWeek(3);
        printDayOfTheWeekIF(4);

    }
    //Challenge
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    //Bonus Challenge with IF statement
    public static void printDayOfTheWeekIF(int day){
        if (day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 3) {
            System.out.println("Thursday");
        } else if (day == 4) {
            System.out.println("Friday");
        } else if (day == 5) {
            System.out.println("Saturday");
        } else if (day == 6) {
            System.out.println("Sunday");
        } else{
            System.out.println("Invalid Day");
        }
    }

}
