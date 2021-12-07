public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Timmy", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeteres(6,0);
        calcFeetAndInchesToCentimeteres(158);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed Player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name and no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeteres(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            System.out.println("Invalid feet or inches");
            return -1;
        }

        double centimeters = ((feet * 12) + inches) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;


    }

    public static double calcFeetAndInchesToCentimeteres(double inches) {
        if (inches < 0){
            return -1;
        }
        double feet = (int)inches / 12;
        double remaininginches = (int)inches % 12;
        System.out.println(inches + " is equal to " + feet + " ft, " + remaininginches + " inches");
        return calcFeetAndInchesToCentimeteres(feet, remaininginches);
    }
}