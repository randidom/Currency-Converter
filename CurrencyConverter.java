package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);

        while (true) {
            try {
                System.out.print("How much money in $USD would you like to convert?: ");

                    String currency = scanner.nextLine();
                    double currencyConversion = Double.parseDouble(currency);
                    System.out.print("What currency would you like to convert to?(EURO/POUND/AUD/CAD/): ");
                    String type = scanner.nextLine();
                    if (type.toUpperCase().equals("EURO")) {
                        currencyConversion = currencyConversion * 0.904808;
                        System.out.println("USD $" + currency + " to " + type + " is " + "€ " + df.format(currencyConversion));
                    } else if (type.toUpperCase().equals("POUND")) {
                        currencyConversion = currencyConversion * 0.775452;
                        System.out.println("USD $" + currency + " to " + type + " is " + "£ " + df.format(currencyConversion));
                    } else if (type.toUpperCase().equals("AUD")) {
                        currencyConversion = currencyConversion * 1.473099;
                        System.out.println("USD $" + currency + " to " + type + " is " + "AUD " + df.format(currencyConversion));
                    } else if (type.toUpperCase().equals("CAD")) {
                        currencyConversion = currencyConversion * 1.318688;
                        System.out.println("USD $" + currency + " to " + type + " is " + "CAD " + df.format(currencyConversion));
                    } else {
                        System.out.println("Input error. Currency must be one of: EURO, POUND, AUD, CAD.");

                    }
                System.out.print("Do you want to convert more currencies? (yes/no): ");
                String continueChoice = scanner.nextLine();
                if (continueChoice.equalsIgnoreCase("no")) {
                    break; // Stop the loop if the user wants to exit
                }
                } catch (NumberFormatException e) {
                    System.out.println("Input error. Money must be numerical values and currency must be spelled correctly.");
                }
            }

        }
    }


