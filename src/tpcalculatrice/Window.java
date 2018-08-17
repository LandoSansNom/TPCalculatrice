/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcalculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/**
 *
 * @author LandoSansNom
 */
public class Window extends JFrame {
    
        public Window(){
            this.setTitle("Calculette");
            this.setSize(240, 260);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            
            JPanel container = new JPanel();
            JPanel panEcran = new JPanel();
            Border border = BorderFactory.createLineBorder(Color.black);
            // Create JLabel with border for display screen
            JLabel label = new JLabel("0");
            label.setPreferredSize(new Dimension(220,20));
            label.setBorder(border);
            label.setHorizontalAlignment(JLabel.RIGHT);
            panEcran.setPreferredSize(new Dimension(220,30));
            panEcran.add(label);
               
            container.add(panEcran, BorderLayout.NORTH);
            this.setContentPane(container);
            this.setVisible(true);
        }
}
