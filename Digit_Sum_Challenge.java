public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(3020));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        //this process operates off of summarizing stored significant digits, moving from the right, inward, through n/10
        int sum = 0;
        //once the second to the greatest digit is assessed,
        while (number > 0) {
            //whatever number is in the one's place, will become the result to modulo 10
            int digit = number % 10;
            sum += digit;

            //Drop least significant digit
            number /= 10;
        }
        return sum;

//            int hundreds = number / 100;
//            //remove place integer;
//            number -=(hundreds*100);
//            int tens = number / 10;
//            //remove place integer;
//            number-=(tens * 10);
//            int ones = (number % 10);
//            //return summarized total;
//            return hundreds + tens + ones;
    }
}
