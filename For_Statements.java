public class Main {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest rate is " + calculateInterest(10000,2.0));
//        System.out.println("10,000 at 3% interest rate is " + calculateInterest(10000,3.0));
//        System.out.println("10,000 at 4% interest rate is " + calculateInterest(10000,4.0));
//        System.out.println("10,000 at 5% interest rate is " + calculateInterest(10000,5.0));
        //Becomes;
        //for(init; termination; increment){}
        //EX: for(i = 0; i<5; i++)
        // init = designated code block
        // termination = values that will result to false when passed - where loop will exit
        //increment = expression invoked by iteration "i++"

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");
        }
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest rate is " + String.format("%.2f", calculateInterest(10000, i)));
            //String.format("%.2f... converts to percentage at 2 decimal places
        }

        //Challenge
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest rate is " + String.format("%.2f", calculateInterest(10000, i)));
        }
        //Challenge;
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        //could use n/2 but sqrt optimizes the amount of loops undertaken in for statement;
        for (int i = 2; i <= (long)Math.sqrt(n); i++) {
            System.out.println("Looping" + i);
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate / 100));
    }
}
