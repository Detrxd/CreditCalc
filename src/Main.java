public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double MonthPaymentOneYear = service.calculate(1000000, 12, 0.008325);43869
        System.out.println("Ваш ежемесячный платёж составляет: " + MonthPaymentOneYear + "р");

        double MonthPaymentTwoYears = service.calculate(1000000, 24, 0.0041625);
        System.out.println("Ваш ежемесячный платёж составляет: " + MonthPaymentTwoYears + "р");

        double MonthPaymentThreeYears = service.calculate(1000000, 36, 0.002775);
        System.out.println("Ваш ежемесячный платёж составляет: " + MonthPaymentThreeYears + "р");
    }
}
