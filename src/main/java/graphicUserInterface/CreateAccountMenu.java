package graphicUserInterface;

import hardwareSettings.WindowActions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountMenu
        extends JFrame
        implements ActionListener,
        WindowActions {

    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JPanel camPanel;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JButton button1;

    public CreateAccountMenu(){

        WindowActions.setUp(this);
        /*WindowActions.setBankLogoFrame(this);
        WindowActions.centreWindow(this);
        WindowActions.setHalfScreenSize(this);*/

        this.setContentPane(camPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        for(int i = 1900; i <= 2021; i++)
            comboBox1.addItem(i);
        for(int i = 1; i <= 12; i++)
            comboBox2.addItem(i);
        for(int i = 1; i <= 31; i++)
            comboBox3.addItem(i);

        button1.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}