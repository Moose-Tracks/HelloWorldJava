import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String jose = "1";
        String annie = "2";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the value you are searching for: ");
        String inquiry = scanner.next();

        if (Objects.equals(inquiry, "jose")){
            System.out.println(jose);
        } else if(Objects.equals(inquiry, "annie")){
            System.out.println(annie);
        } else {
            System.out.println("broken");
        }
        //Best practice is to close the scanner once input is provided, so that memory can save the imput and allocate
        //properly
        scanner.close();
    }
}
