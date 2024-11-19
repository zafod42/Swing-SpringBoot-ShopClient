package ru.spbstu.ui.view;

import ru.spbstu.jpa.model.ExpenseItem;

import javax.swing.*;
import java.awt.*;

public abstract class JournalView {

    private JPanel journalPanel;

    protected JournalView() {
        setupUI();
    }

    private void setupUI() {
        journalPanel = new JPanel();
        journalPanel.setBackground(Color.GREEN);
        journalPanel.setLayout(new GridLayout());
        journalPanel.setMinimumSize(new Dimension(420, 420));
        journalPanel.setPreferredSize(new Dimension(420, 420));
        journalPanel.setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createEtchedBorder(),
                        "Journal Pane"
                )
        );
        JLabel label = new JLabel("Journal");
        journalPanel.add(label);
    }

    public JComponent getRootComponent() {
        return journalPanel;
    }
}
