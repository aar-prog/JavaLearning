//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Addition {
    public Addition() {
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int a = num.nextInt();
        System.out.println("Enter the second integer: ");
        int b = num.nextInt();
        int sum = a + b;
        System.out.println("The sum of these two integers are: " + sum);
    }
}
