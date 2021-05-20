public class CreditPaymentService {
    public double calculate(int amount, int time, double percent) {
        int monthlyPayment = (int) (amount * (percent + (percent / ((Math.pow(1 + percent, time) - 1)))));
        return monthlyPayment;
    }
}


