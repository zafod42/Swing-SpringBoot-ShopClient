package ru.spbstu.ui.view;

import lombok.Getter;
import ru.spbstu.jpa.model.ExpenseItem;
import ru.spbstu.ui.controller.MainController;

import javax.swing.*;
import java.awt.*;


public abstract class MainView {
    private JTabbedPane mainPane;
    private final TablesView tablesView;
    private final JournalView journalView;
    private final ReportView reportView;
    protected MainView(TablesView tablesView, JournalView journalView, ReportView reportView) {
        this.tablesView = tablesView;
        this.journalView = journalView;
        this.reportView = reportView;
        setupUI();
    }
    private void setupUI() {
        mainPane = new JTabbedPane(SwingConstants.TOP);
        mainPane.addTab("TABLES", tablesView.getRootComponent());
        mainPane.addTab("JOURNALS", journalView.getRootComponent());
        mainPane.addTab("REPORTS", reportView.getRootComponent());
    }

    public JComponent getRootComponent() {
        return mainPane;
    }
}
