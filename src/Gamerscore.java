//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;

public class Gamerscore {
    public Gamerscore() {
    }

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        PrintStream var10000 = System.out;
        int var10001 = calculateScore(gameOver, score, levelCompleted, bonus);
        var10000.println("The next highScore is " + var10001);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;
        if (gameOver) {
            finalScore += levelCompleted * bonus;
            finalScore += 1000;
        }

        return finalScore;
    }
}
