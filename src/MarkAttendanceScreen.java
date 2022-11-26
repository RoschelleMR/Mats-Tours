package src;

import javax.swing.*;
import org.jdatepicker.*;

import java.awt.*;
import java.awt.event.*;

public class MarkAttendanceScreen extends JFrame{

    private MarkAttendanceScreen thisScr;
    private Attendance attendanceSheet;
    private JPanel buttonPanel, mainPanel;
    private JComboBox studentBox, periodBox;
    private JButton saveButton;
    private JButton closeButton;

    public MarkAttendanceScreen(Attendance attendance){
        attendanceSheet = attendance;

        setTitle("MARK ATTENDANCE");

        buttonPanel = new JPanel();
        mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(3,1,5,15));

        String [] studnames = attendanceSheet.getStudentNames().toArray(new String[attendanceSheet.getStudentNames().size()]);

        mainPanel.add(new JLabel("Student: "));
        studentBox = new JComboBox<String>(studnames);
        mainPanel.add(studentBox);

        mainPanel.add(new JLabel("Period"));
        String [] periods = {"Morning", "Evening"};
        periodBox = new JComboBox<String>(periods);
        mainPanel.add(periodBox);

        mainPanel.add(new JLabel("Date:"));

        

        saveButton = new JButton("Save");
        // saveButton.addActionListener(new SaveListener());
        buttonPanel.add(saveButton);

        closeButton = new JButton("Close");
        // closeButton.addActionListener(new CloseListener());
        buttonPanel.add(closeButton);

        add(mainPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        pack();
        setVisible(true);
    }
}
