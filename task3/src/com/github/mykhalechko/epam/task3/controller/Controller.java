package com.github.mykhalechko.epam.task3.controller;

import com.github.mykhalechko.epam.task3.model.Model;
import com.github.mykhalechko.epam.task3.view.View;

import java.util.Scanner;

public class Controller {

    // Constructor
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner scanner = new Scanner(System.in);
        ControllerUtility controllerUtility = new ControllerUtility(view, scanner);
        model.addContact(controllerUtility.inputContact());
        view.printAllContacts(model.allContacts());

    }
}
