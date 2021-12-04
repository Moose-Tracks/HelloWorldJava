public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue);
        System.out.println("Float Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue);
        System.out.println("Double Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5F / 3F;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue= " + myDoubleValue);


        //LBS to KG conversion Application (Challenge)

        double lbsValue = 6D;
        double kgConverted = lbsValue * 0.45359237D;
        System.out.println("Converted Kilograms = " + kgConverted);


        //Resume Practice

        double pi = 3.1415927D;
        double anotherNumber = 3_000_000.4_567_890D;
        System.out.println("Pi = " + pi);
        System.out.println("Another Number = " + anotherNumber);

    }
}
