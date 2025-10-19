package java_awt_homework;

import java.awt.*;
import java.awt.event.*;

public class EmployeeForm extends Frame implements ActionListener {
   
	TextField nameField, idField, deptField;
    Label resultLabel;

    public EmployeeForm() {
        // Set layout and title
        setLayout(new FlowLayout());
        setTitle("Employee Information Form");

        // Create and add components
        add(new Label("Name:"));
        nameField = new TextField(20);
        add(nameField);

        add(new Label("Employee ID:"));
        idField = new TextField(20);
        add(idField);

        add(new Label("Department:"));
        deptField = new TextField(20);
        add(deptField);

        Button submitButton = new Button("Submit");
        submitButton.addActionListener(this);
        add(submitButton);

        resultLabel = new Label("");
        add(resultLabel);

        
        setSize(500, 550);
        setVisible(true);

        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
              System.exit(ABORT);  
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        String name = nameField.getText();
        String id = idField.getText();
        String dept = deptField.getText();

        resultLabel.setText("Name: " + name + ", ID: " + id + ", Dept: " + dept);
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }
}