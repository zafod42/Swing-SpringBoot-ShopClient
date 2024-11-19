package ru.spbstu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import ru.spbstu.ui.controller.MainController;

import java.awt.*;

@Component
public class  ApplicationCommandLineRunner implements CommandLineRunner {
    private final MainController controller;


    @Autowired
    public ApplicationCommandLineRunner(MainController controller) {
        this.controller = controller;
    }

    @Override
    public void run(String... args) {
        EventQueue.invokeLater(() -> controller.setVisible(true));
    }
}
