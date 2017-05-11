package com.github.mykhalechko.epam.task1;

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

        model.setFirstWord(inputStringWithScanner(scanner, View.INPUT_FIRST_WORD, View.FIRST_WORD));
        model.setSecondWord(inputStringWithScanner(scanner, View.INPUT_SECOND_WORD, View.SECOND_WORD));
        view.printMessage(model.makePhrase());
    }

    // The Utility methods
    public String inputStringWithScanner(Scanner scanner, String inputWord, String word) {
        view.printMessage(inputWord);
        while (!word.equals(scanner.nextLine())) {
            view.printMessage(View.WRONG_INPUT_DATA + "\n" + inputWord);
        }
        return word;
    }
}
