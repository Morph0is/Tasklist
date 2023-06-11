package classes;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;


public class ButtonPanel extends JPanel {
    private JButton addTask;
    private JButton clear;
    Border emptyBorder = BorderFactory.createEmptyBorder();

    //constructor
    ButtonPanel()
    {
         this.setPreferredSize(new Dimension(400, 60));


         addTask = new JButton("Add Task");
         addTask.setBorder(emptyBorder);
         addTask.setFont(new Font("Sans-serif", Font.PLAIN, 20));

         this.add(addTask);

        this.add(Box.createHorizontalStrut(20));
        clear = new JButton("Clear completed Tasks");
        clear.setBorder(emptyBorder);
        clear.setFont(new Font("Sans-serif", Font.PLAIN, 20));

        this.add(clear);
    }

    public JButton getAddTask() {
        return addTask;
    }

    public JButton getClear() {
        return clear;
    }
}
