//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Keywords {
    public Keywords() {
    }

    public static void main(String[] args) {
        double kilometers = 160.9344;
        int highScore = 50;
        if (highScore > 25) {
            highScore += 1000;
        }

        int health = 100;
        if (health < 25 && highScore > 1000) {
            highScore -= 1000;
        }

        int myVariable = 50;
        ++myVariable;
        --myVariable;
        System.out.println("This is a test");
        System.out.println("This is another still more.");
        boolean anotherVariable = true;
        --myVariable;
        System.out.println("myVariable = " + myVariable);
        if (myVariable == 0) {
            System.out.println("It's now zero");
        }

    }
}
