public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        //Switches are good for testing variaties of input through a single variable
        int value = 1;
        if (value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("Value was 2");
        } else{
            System.out.println("Value was not 1 or 2");
        }
        int switchValue = 4;

        switch(switchValue) {
            case 1:
                //begins Execution here
                System.out.println("Value was 1");
                break;
                //breaks loop and begins processes below
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:case 4:case 5:
                System.out.println("Was a 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1 or 2");
                break; //Not necessarily needed as default-end closes loop automatically
        }

        char switchNew = 'B';

        switch(switchNew) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
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

    }
}
