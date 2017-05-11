package com.github.mykhalechko.epam.task2;

public class Main {

    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        int min = 0;
        int max = 0;
        if (args.length > 0) {
            try {
                min = Integer.parseInt(args[0]);
                max = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Argument" + args[0] + " must be an integer.");
                System.err.println("Argument" + args[1] + " must be an integer.");
                System.exit(1);
            }
        }
        controller.processUser(min,max);
    }
}
