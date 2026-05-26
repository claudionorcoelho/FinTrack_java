package com.fintrack.util;

/**
 * Utility class for common functions
 */
public class Utils {
    
    public static String formatCurrency(double amount) {
        return String.format("R$ %.2f", amount);
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    public static boolean isValidAmount(String amount) {
        try {
            Double.parseDouble(amount);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
