//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class MethodOverloadingChallenge {
    public MethodOverloadingChallenge() {
    }

    public static void main(String[] args) {
        System.out.println("5ft, 8in = " + convertToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convertToCentimeters(69) + "cm");
    }

    public static double convertToCentimeters(int inches) {
        return (double)inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters(feet * 12 + inches);
    }
}
