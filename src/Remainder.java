//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Remainder {
    public Remainder() {
    }

    public static void main(String[] args) {
        double firstNumber = 20.0;
        double secondNumber = 80.0;
        double sumFirstSecond = (firstNumber + secondNumber) * 100.0;
        System.out.println("sumFirstSecond = " + sumFirstSecond);
        double remainderNumber = sumFirstSecond % 40.0;
        System.out.println("remainderNumber = " + remainderNumber);
        boolean isRemainderZero = remainderNumber == 0.0;
        System.out.println("isRemainderZero = " + isRemainderZero);
        if (!isRemainderZero) {
            System.out.println("Got some remainder");
        } else {
            System.out.println("Got no remainder");
        }

    }
}
