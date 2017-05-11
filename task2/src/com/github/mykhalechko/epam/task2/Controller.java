package com.github.mykhalechko.epam.task2;

import java.util.Random;
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
    public void processUser(int min, int max) {
        if (min == 0 || max == 0) {
            min = 1;
            max = View.RAND_MAX;
        }
        model.setNumber(rand(min, max));

        view.printMessageAndInt(View.SECRET_NUMBER, model.getNumber());
        int userNumber;
        int secretNumber = model.getNumber();
        while (true) {
            userNumber = inputValueInRange(min, max);
            if (userNumber == secretNumber) {
                view.printMessageAndInt(View.WIN_MESSAGE, model.getNumber());
                view.printMessage(model.getUserNumbers().toString());
                return;
            }
            if (userNumber < secretNumber) {
                view.printMessage(View.LESS_NUMBER);
                min = userNumber;
            }
            if (userNumber > secretNumber) {
                view.printMessage(View.GREATER_NUMBER);
                max = userNumber;
            }
        }
    }

    // The Utility methods
    public int rand(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }

    public int inputValueInRange(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        while (true) {
            view.printRange(min, max);
            userNumber = inputIntValueWithScanner(scanner);
            model.getUserNumbers().add(userNumber);
            if (userNumber > max || userNumber < min) {
                view.printMessage(View.NUMBER_NOT_RANGE);
            } else {
                return userNumber;
            }
        }
    }

    public int inputIntValueWithScanner(Scanner scanner) {
        view.printMessage(View.INPUT_NUMBER);
        while (!scanner.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.INPUT_NUMBER);
            scanner.next();
        }
        return scanner.nextInt();
    }
}
