public class PrimeNumberChallenge {
    public static void main(String[] args) {
        int counter = 0;
        for (int number = 10; number <= 50; number++){
            if(isPrime(number)){
                System.out.println("Number " + number + " is a prime number");
                counter++;
                if (counter == 3){
                    break;
                }
            }

        }
        System.out.println("There are " + counter + " prime numbers");

        System.out.println("0 is " + (isPrime(0) ? "PRIME" : "NOT PRIME"));
        System.out.println("1 is " + (isPrime(1) ? "PRIME" : "NOT PRIME"));
        System.out.println("2 is " + (isPrime(2) ? "PRIME" : "NOT PRIME"));
        System.out.println("3 is " + (isPrime(3) ? "PRIME" : "NOT PRIME"));
        System.out.println("4 is " + (isPrime(4) ? "PRIME" : "NOT PRIME"));
        System.out.println("7 is " + (isPrime(7) ? "PRIME" : "NOT PRIME"));
        System.out.println("8 is " + (isPrime(8) ? "PRIME" : "NOT PRIME"));
        System.out.println("17 is " + (isPrime(17) ? "PRIME" : "NOT PRIME"));
    }

    public static boolean isPrime(int wholeNumber) {
        if (wholeNumber <= 2){
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor <= wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
