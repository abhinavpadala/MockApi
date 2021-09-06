package com.example.mockapi.HelperClass;

public class HelperClass {
    public static boolean isValidInput(String input) {
        return input != null && input.matches("^[A-Za-z0-9\" \"]+$");
    }
}
