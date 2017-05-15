package com.github.mykhalechko.epam.task3.view;

import java.util.ResourceBundle;

final class ViewConstants {

    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");

    ;
    static String INPUT = resourceBundle.getString("input");
    //    static String NAME = resourceBundle.getString("name");
//    static String SURNAME = resourceBundle.getString("surname");
    static String WRONG_INPUT = resourceBundle.getString("wrong_input");
    static String DATE_CREATION = resourceBundle.getString("date_creation");
    static String DATE_MODIFICATION = resourceBundle.getString("date_modification");
    private ViewConstants() {
    }

}
