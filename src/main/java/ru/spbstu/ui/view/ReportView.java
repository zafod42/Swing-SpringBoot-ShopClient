package ru.spbstu.ui.view;

import javax.swing.*;
import java.awt.*;

public abstract class ReportView {
    private final JPanel reportPanel;

    protected ReportView() {
        reportPanel = new JPanel();
        reportPanel.setLayout(new GridLayout());
        reportPanel.setBackground(Color.CYAN);
        reportPanel.setBorder(
                BorderFactory.createTitledBorder(
                        BorderFactory.createEtchedBorder(),
                        "Report Pane"
                )
        );
        JLabel label = new JLabel("Reports");
        reportPanel.add(label);
    }

    public JComponent getRootComponent() {
        return reportPanel;
    }
}
