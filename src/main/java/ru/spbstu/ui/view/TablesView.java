package ru.spbstu.ui.view;

import ru.spbstu.jpa.model.ExpenseItem;

import javax.swing.*;
import java.awt.*;

public abstract class TablesView {

    private JPanel mainPanel;

    protected TablesView() {
        setupUI();
    }

    private void setupUI() {
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.PINK);
        mainPanel.setLayout(new GridLayout());
        mainPanel.setMinimumSize(new Dimension(420, 420));
        mainPanel.setPreferredSize(new Dimension(420, 420));
        mainPanel.setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createEtchedBorder(),
                        "Tables Pane"
                )
        );
        JLabel label = new JLabel("Tables");
        mainPanel.add(label);
    }

    public JComponent getRootComponent() {
        return mainPanel;
    }
}
