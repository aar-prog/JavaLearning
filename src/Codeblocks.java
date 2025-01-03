//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Codeblocks {
    public Codeblocks() {
    }

    public static void main(String[] args) {
        displayHighScorePosition("Aarush", calculateHighScorePosition(1500));
        displayHighScorePosition("Krishna", calculateHighScorePosition(999));
        displayHighScorePosition("Anjali", calculateHighScorePosition(499));
        displayHighScorePosition("Sreelatha", calculateHighScorePosition(99));
        displayHighScorePosition("Anju", calculateHighScorePosition(-10000000));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }
}