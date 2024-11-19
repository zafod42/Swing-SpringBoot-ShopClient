package ru.spbstu.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.spbstu.jpa.model.ExpenseItem;
import ru.spbstu.jpa.model.Sale;
import ru.spbstu.jpa.repository.ExpenseItemsRepository;
import ru.spbstu.jpa.repository.SalesRepository;
import ru.spbstu.ui.view.JournalView;
import ru.spbstu.ui.view.MainView;
import ru.spbstu.ui.view.ReportView;
import ru.spbstu.ui.view.TablesView;

import javax.swing.*;
import java.text.Format;

@Controller
public class MainController extends JFrame {
    private final TablesView tablesView;
    private final JournalView journalView;
    private final ReportView reportView;
    private final MainView mainView;

    @Autowired
    public MainController(
    ) {
        super("Shop database client GUI application. Course Work.");
        this.tablesView = new TablesView() {
        };
        this.journalView = new JournalView() {
        };
        this.reportView = new ReportView() {
        };
        this.mainView = new MainView(tablesView, journalView, reportView) {
        };

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setContentPane(mainView.getRootComponent());
        this.pack();
    }
}
