package ru.spbstu;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import ru.spbstu.ui.controller.MainController;

import javax.swing.*;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        ConfigurableApplicationContext ctx =  new SpringApplicationBuilder(Application.class)
                .headless(false)
                .web(WebApplicationType.NONE)
                .run(args);
    }
}
