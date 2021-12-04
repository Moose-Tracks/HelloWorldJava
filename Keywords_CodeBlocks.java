public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800,5,100);

        calculateScore(true,10000,8,200);

        // Relationship of global and non-global variable access is considered "Scope"

    }
    //All code highlighted in orange are considered java Keywords

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score + (levelCompleted * bonus);
        finalScore += 1000;
        System.out.println("Your final score was: " + finalScore);
    }
}
