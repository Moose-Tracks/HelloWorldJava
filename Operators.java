public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;  // 1 + 2 = 3
        System.out.println("Result = " + result);
        int previousResult = result;
        System.out.println("Previous Result = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);

        result = result * 10;  //2 * 10 = 20
        System.out.println("2 * 10 = "+ result);

        result = result / 5; //  20 / 5 = 4;
        System.out.println("20 / 5 = " + result);

        result = result % 3;  //remainder of (4 % 3) = 1
        System.out.println("Remainder = " + result);

        //result = result + 1;
        result ++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result --; //2-1 = 1
        System.out.println("2 - 1 = " + result);

        result += 2;  //result = result + 2
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; //30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -=2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien!");
            System.out.println("And I am scared of Aliens");
        }


        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }


        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score, less than 100 ");
        }


        if ((topScore > 90)||(secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }


        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }


        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }


        isCar = true;

        //Ternary operator allows programers to set boolean variables to trigger other values to be set to variables...;
        //Intuitively, behaves as a trigger using boolean logic.;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }


        //Challenge
        double myDouble = 20.00D;
        double mySecondDouble = 80.00D;
        double myCombinedDouble = (myDouble + mySecondDouble) * 100D;
        double resultSubOne = myCombinedDouble % 40.00D;
        boolean resultbool = (resultSubOne == 0);
        System.out.println("My result = " + resultbool);
        if (!resultbool) {
            System.out.println("Got some Remainder");
        }
    }
}
