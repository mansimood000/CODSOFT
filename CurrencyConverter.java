import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        System.out.print("Enter exchange rate (EUR/USD): ");
        double exchangeRate = sc.nextDouble();

        System.out.print("Enter target currency (EUR/USD): ");
        String targetCurrency = sc.next();

        double convertedAmount = usd * exchangeRate;

        System.out.printf("%.2f USD = %.2f %s", usd, convertedAmount, targetCurrency);
    }
}
