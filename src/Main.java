public class Main {
    public static void main(String[] args) {
        for(int counter=1;counter<=5;counter++){
            System.out.println(counter);
        }
        double result =calculateInterest(10.2,21.4);
        System.out.println("the result of interest is: " + result);
        System.out.println("the result is: " + calculateInterest(12.4,87.8));

        for(double rate=2.0;rate<=5.0;rate++){
            double interestAmount = calculateInterest(10000,rate);
            System.out.println("10,100 at " + rate + " % interest = " + interestAmount);
        }

        for(double i =7.5;i<=10;i+=0.25){
            double interestAmout = calculateInterest(100.00,i);
            if(interestAmout>8.5){
                break;
            }
            System.out.println("$100.00 " + i + " % interest = $" + interestAmout);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount*(interestRate/100));
    }


}
