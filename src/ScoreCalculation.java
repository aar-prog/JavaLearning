//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ScoreCalculation {
    public ScoreCalculation() {
    }

    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Aarush", 999));
        System.out.println("New score is " + calculateScore(2));
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("Main character scored no points");
        return 0;
    }
}
