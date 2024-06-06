
import java.util.*;
import java.text.DecimalFormat;

public class CurrencyConverter {

    public static void main(String[] args) {
        double peso = 0.00, dollar = 0.00, euro = 0.00, currency, convert, sar = 0.00, bhd = 0.00;
        DecimalFormat f = new DecimalFormat("##.###");
        Scanner sc = new Scanner(System.in);

        System.out.println("*****CURRENCY CONVERTER*****");
        System.out.println("Enter 1: Philippine Peso (PHP)");
        System.out.println("Enter 2: United State Dollar (USD)");
        System.out.println("Enter 3: Euro (EU)");
        System.out.println("Enter 4: Saudi Arabia Riyal (SAR)");
        System.out.println("Enter 5: Bahrain Dinar (BHD)");
        System.out.println("\n");
        System.out.println("Enter the Currency :");
        currency = sc.nextInt();

        //PESO CONVERTED TO ANOTHER CURRENCY
        if (currency == 1) {
            System.out.println("Enter amount in Peso:");
            peso = sc.nextFloat();

            System.out.println("\n");

            System.out.println("To be Converted to :");
            System.out.println("Enter 1: United State Dollar (USD)");
            System.out.println("Enter 2: Euro (EU)");
            System.out.println("Enter 3: Saudi Arabia Riyal (SAR)");
            System.out.println("Enter 4: Bahrain Dinar (BHD)");
            System.out.println("\n");
            System.out.println("Enter the Converter :");
            convert = sc.nextInt();

            System.out.println("\n");

            if (convert == 1) {
                dollar = peso * 0.020;
                System.out.println("US Dollar : " + f.format(dollar));
            } else if (convert == 2) {
                euro = peso * 0.017;
                System.out.println("Euro : " + f.format(euro));
            } else if (convert == 3) {
                sar = peso * 0.073;
                System.out.println("SAR : " + f.format(sar));
            } else if (convert == 4) {
                bhd = peso * 0.0074;
                System.out.println("/nBHD : " + f.format(bhd));
            } else {
                System.out.println("Invalid Converter!!");
            }
        } //DOLLAR CONVERTED TO ANOTHER CURRENCY
        else if (currency == 2) {
            System.out.println("Enter amount in US Dollar:");
            dollar = sc.nextFloat();

            System.out.println("\n");

            System.out.println("To be Converted to :");
            System.out.println("Enter 1: Philippine Peso (PHP)");
            System.out.println("Enter 2: Euro (EU)");
            System.out.println("Enter 3: Saudi Arabia Riyal (SAR)");
            System.out.println("Enter 4: Bahrain Dinar (BHD)");
            System.out.println("\n");
            System.out.println("Enter the Converter :");
            convert = sc.nextInt();

            System.out.println("\n");

            if (convert == 1) {
                peso = dollar * 51.23;
                System.out.println("US Dollar : " + f.format(dollar));
            } else if (convert == 2) {
                euro = dollar * 0.87;
                System.out.println("Euro : " + f.format(euro));
            } else if (convert == 3) {
                sar = dollar * 3.75;
                System.out.println("SAR : " + f.format(sar));
            } else if (convert == 4) {
                bhd = dollar * 0.38;
                System.out.println("BHD : " + f.format(bhd));
            } else {
                System.out.println("Invalid Converter!!");
            }
        } //EURO CONVERTED TO ANOTHER CURRENCY
        else if (currency == 3) {
            System.out.println("Enter amount in Euro:");
            euro = sc.nextFloat();

            System.out.println("\n");

            System.out.println("To be Converted to :");
            System.out.println("Enter 1: Philippine Peso (PHP)");
            System.out.println("Enter 2: United State Dollar (USD)");
            System.out.println("Enter 3: Saudi Arabia Riyal (SAR)");
            System.out.println("Enter 4: Bahrain Dinar (BHD)");
            System.out.println("\n");
            System.out.println("Enter the Converter :");
            convert = sc.nextInt();

            System.out.println("\n");

            if (convert == 1) {
                peso = euro * 58.75;
                System.out.println("Peso : " + f.format(dollar));
            } else if (convert == 2) {
                dollar = euro * 1.15;
                System.out.println("US Dollar : " + f.format(euro));
            } else if (convert == 3) {
                sar = euro * 4.30;
                System.out.println("SAR : " + f.format(sar));
            } else if (convert == 4) {
                bhd = euro * 0.43;
                System.out.println("BHD : " + f.format(bhd));
            } else {
                System.out.println("Invalid Converter!!");
            }
        } //SAR CONVERTED TO ANOTHER CURRENCY
        else if (currency == 4) {
            System.out.println("Enter amount in SAR:");
            sar = sc.nextFloat();

            System.out.println("\n");

            System.out.println("To be Converted to :");
            System.out.println("Enter 1: Philippine Peso (PHP)");
            System.out.println("Enter 2: United State Dollar (USD)");
            System.out.println("Enter 3: Euro (EU)");
            System.out.println("Enter 4: Bahrain Dinar (BHD)");
            System.out.println("\n");
            System.out.println("Enter the Converter :");
            convert = sc.nextInt();

            System.out.println("\n");

            if (convert == 1) {
                peso = sar * 13.66;
                System.out.println("Peso : " + f.format(dollar));
            } else if (convert == 2) {
                dollar = sar * 0.27;
                System.out.println("Dollar : " + f.format(sar));
            } else if (convert == 3) {
                euro = sar * 0.23;
                System.out.println("Euro : " + f.format(euro));
            } else if (convert == 4) {
                bhd = sar * 0.10;
                System.out.println("BHD : " + f.format(bhd));
            } else {
                System.out.println("Invalid Converter!!");
            }
        } else if (currency == 5) {
            System.out.println("Enter amount in BHD:");
            bhd = sc.nextFloat();

            System.out.println("\n");

            System.out.println("To be Converted to :");
            System.out.println("Enter 1: Philippine Peso (PHP)");
            System.out.println("Enter 2: United State Dollar (USD)");
            System.out.println("Enter 3: Euro (EU)");
            System.out.println("Enter 4: Saudi Arabia Riyal (SAR)");
            System.out.println("\n");
            System.out.println("Enter the Converter :");
            convert = sc.nextInt();

            System.out.println("\n");

            if (convert == 1) {
                peso = bhd * 135.84;
                System.out.println("Peso : " + f.format(peso));
            } else if (convert == 2) {
                dollar = bhd * 2.65;
                System.out.println("US Dollar : " + f.format(dollar));
            } else if (convert == 3) {
                euro = bhd * 2.31;
                System.out.println("Euro : " + f.format(euro));
            } else if (convert == 4) {
                sar = bhd * 9.95;
                System.out.println("SAR : " + f.format(sar));
            } else {
                System.out.println("Invalid Converter!!");
            }
        } else {
            System.out.println("Invalid Currency!!");
        }
    }
}
