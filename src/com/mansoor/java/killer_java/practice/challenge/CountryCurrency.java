package challenge;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class CountryCurrency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String usFormatted = usFormat.format(payment);

        // Indian Locale
        Locale indiaLocale = new Locale("en", "IN");
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        String indiaFormatted = indiaFormat.format(payment).replace("INR", "Rs.");

        // Chinese Locale
        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaFormatted = chinaFormat.format(payment);

        // French Locale
        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String franceFormatted = franceFormat.format(payment);

        // Print formatted values
        System.out.println("US: " + usFormatted);
        System.out.println("India: " + indiaFormatted);
        System.out.println("China: " + chinaFormatted);
        System.out.println("France: " + franceFormatted);
    }
}
