package com.github.mykhalechko.epam.task3;

import com.github.mykhalechko.epam.task3.controller.Controller;
import com.github.mykhalechko.epam.task3.model.Model;
import com.github.mykhalechko.epam.task3.view.View;

public class Main {

    /*    1. Написать программу, которая получает из командной строки сначала слово “Hello”, потом
        слово “world!”. Другие вводы игнорировать с соответствующим комментарием в
        командной строке.
        2. Из этих слов собирается предложение и выводится на экран.
        3. Должен быть применен паттерн MVC.
    */
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
    }
}
