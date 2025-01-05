public class SumLoopChallenge {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        for (int number = 1; number <= 1000; number++){
            if(number % 3 == 0 && number % 5 == 0){
                System.out.println("Number " + number + " is divisible by 3 and 5");
                counter++;
                sum += number;
            }
            if (counter == 5){
                System.out.println("The sum of the 5 numbers is " + sum);
                break;
            }

        }
    }
}
