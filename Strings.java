package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //
        //Byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean
        String myString = "This is a string!";
        System.out.println("My string = " + myString);
        myString = myString+ ", and this is more.";
        System.out.println("My string = " + myString);

        myString = myString + " \u00A9 2021";
        System.out.println("My string = " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString =   lastString + myInt;
        System.out.println("Last String = " + lastString);
        double doubleNumber= 120.47D;
        lastString = lastString + doubleNumber;
        System.out.println("Last String = " + lastString);
    }
}
