public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        int newScore = calculateScore("Timmy", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeteres(6, 0);
        calcFeetAndInchesToCentimeteres(158);
        System.out.println(getDurationString(65, 30));
        System.out.println(getDurationString(30000L));

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name and no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeteres(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        }

        double centimeters = ((feet * 12) + inches) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;


    }

    public static double calcFeetAndInchesToCentimeteres(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remaininginches = (int) inches % 12;
        System.out.println(inches + " is equal to " + feet + " ft, " + remaininginches + " inches");
        return calcFeetAndInchesToCentimeteres(feet, remaininginches);
    }

    //Challenge

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long newMinutes = minutes % 60;
        String hoursString = hours + "h ";
        if (hours < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = newMinutes + "m ";
        if (newMinutes < 10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s ";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }
        return hoursString + minutesString + secondsString;


    }

    public static String getDurationString(long seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDurationString(minutes, remainingSeconds);
    }
}
