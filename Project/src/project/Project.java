package project;

import java.awt.Color;
import javax.swing.*;

public class Project {

    public static void main(String[] args) {
        Login jf = new Login();
        ChooseType r = new ChooseType();
        jf.setBounds(100, 100, 330, 305);
        JLabel backImage = new JLabel(new ImageIcon("images (2).jpg"));
        jf.add(backImage);
        backImage.setLayout(null);
        jf.setVisible(true);
        jf.setLocationRelativeTo(null);
    }

}
