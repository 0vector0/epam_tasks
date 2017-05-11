package com.github.mykhalechko.epam.task2;

import java.util.ResourceBundle;

public class View {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
    public static String WRONG_INPUT_DATA = resourceBundle.getString("wrong_input_data");
    public static String INPUT_NUMBER = resourceBundle.getString("input_number");
    public static int RAND_MAX = Integer.parseInt(String.valueOf(resourceBundle.getString("rand_max")));
    public static String SECRET_NUMBER = resourceBundle.getString("secret_number");
    public static String RANGE_MESSAGE_PART1 = resourceBundle.getString("range_message_part1");
    public static String RANGE_MESSAGE_PART2 = resourceBundle.getString("range_message_part2");
    public static String NUMBER_NOT_RANGE = resourceBundle.getString("number_not_range");
    public static String WIN_MESSAGE = resourceBundle.getString("win_message");
    public static String LESS_NUMBER = resourceBundle.getString("less_number");
    public static String GREATER_NUMBER = resourceBundle.getString("greater_number");

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value) {
        System.out.println(message + " " + value);
    }

    public void printRange(int min, int max) {
        System.out.println(RANGE_MESSAGE_PART1 + " " + min + " " + RANGE_MESSAGE_PART2 + " " + max);
    }

}
