import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //creates scanner instance which acts as "user input"
        //This opens the input
	    Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth:");

        //Checks to see if the input qualifies as an int.  If it does not qualify, variable returns false
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();

            scanner.nextLine(); //Handle next line enter key (This is required in order to not overstep following User Inputs)

            System.out.println("Enter your name: ");

            //This moves the curser to the next line
            String name = scanner.nextLine();

            int age = 2021 - yearOfBirth;

            if(age>=0 && age <=100){
                System.out.println("Your Name is: " + name + ", and you are " + age + " years old");
            } else{
                System.out.println("Invalid year of birth");
            }
        } else{
            System.out.println("Unable to parse year of birth");
        }

        //Best practice is to close the scanner once input is provided, so that memory can save the imput and allocate
        //properly
        scanner.close();
    }
}
