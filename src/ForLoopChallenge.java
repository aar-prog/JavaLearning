public class ForLoopChallenge {
    public static void main(String[] args) {

        for(double interest = 7.5; interest <= 10.0; interest += 0.25){
            double interestAmount = calculateInterest(100000, interest);
            if(interestAmount > 8500){
                break;
            }
            System.out.println("10000 at " + interest + "% interest = $" + interestAmount);
        }

    }
    public static double calculateInterest(double dollar, double interestRate){
        return (dollar * (interestRate / 100));
    }
}
