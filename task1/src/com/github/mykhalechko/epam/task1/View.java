package com.github.mykhalechko.epam.task1;

import java.util.ResourceBundle;

public class View {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    public static String FIRST_WORD = resourceBundle.getString("first_word");
    public static String SECOND_WORD = resourceBundle.getString("second_word");
    public static String INPUT_FIRST_WORD = resourceBundle.getString("input_first_word");
    public static String INPUT_SECOND_WORD = resourceBundle.getString("input_second_word");
    public static String WRONG_INPUT_DATA = resourceBundle.getString("wrong_input_data");

    public void printMessage(String message) {
        System.out.println(message);
    }

}
