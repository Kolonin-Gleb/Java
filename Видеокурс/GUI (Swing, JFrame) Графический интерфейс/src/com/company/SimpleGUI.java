package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleGUI extends JFrame
{
    // Поля
    private JTextField input1 = new JTextField("", 5);
    private JLabel label1 = new JLabel(" Input:");
    private JRadioButton radio1 = new JRadioButton("Select this");
    private JRadioButton radio2 = new JRadioButton("Select that");
    private JCheckBox check1 = new JCheckBox("Check", false);
    private JButton button1 = new JButton("Press");

    // Окно
    SimpleGUI ()
    {
        super("My window");
        this.setBounds(100, 100, 500, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2, 2, 2));
        // Помещение полей на окно
        container.add(label1);
        container.add(input1);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        container.add(radio1);
        radio1.setSelected(true); // по умолчанию выбрана эта кнопка
        container.add(radio2);
        container.add(check1);

        // настройка кнопки
        button1.addActionListener(new ButtonEventListener ());
        container.add(button1);

    }

    class ButtonEventListener implements ActionListener
    {
        public void actionPerformed (ActionEvent event)
        {
            String msg = "";
            msg += "Button clicked\n";
            msg += "Your text is: " + input1.getText() + "\n"; // Берем текст из поля
            msg += (radio1.isSelected() ? "Radio1" : "Radio2") + " was chosen\n";

            msg += "check1" + ((check1.isSelected()) ? " was" : " wasn't") + " checked";

            JOptionPane.showMessageDialog(null, msg, "Output", JOptionPane.PLAIN_MESSAGE);

        }
    }

}
