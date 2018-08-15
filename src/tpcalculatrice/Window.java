/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpcalculatrice;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author LandoSansNom
 */
public class Window extends JFrame {
    
        public Window(){
            this.setTitle("Calculette");
            this.setSize(300, 300);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            // We define the layout
            this.setLayout(new BorderLayout());
            JPanel container = new JPanel();
            GridLayout gl = new GridLayout(5,4);
            gl.setHgap(8);
            gl.setVgap(8);
            container.setLayout(gl);
            
            JPanel p = new JPanel();
            p.setLayout(gl);
            p.setPreferredSize(new Dimension(40,40));
            
            // Create JLabel with border for display screen
            JLabel label = new JLabel();
            Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
            
            label.setBorder(border);
            
            p.add(label);
            
            container.add(new JButton("1"));
            container.add(new JButton("2"));
            container.add(new JButton("3"));
            container.add(new JButton("C"));
            container.add(new JButton("4"));
            container.add(new JButton("5"));
            container.add(new JButton("6"));
            container.add(new JButton("+"));
            container.add(new JButton("7"));
            container.add(new JButton("8"));
            container.add(new JButton("9"));
            container.add(new JButton("-"));
            container.add(new JButton("0"));
            container.add(new JButton("."));
            container.add(new JButton("="));
            container.add(new JButton("*"));
            container.add(new JButton("/"));
            
            this.getContentPane().add(p, BorderLayout.NORTH);
            this.getContentPane().add(container);
            this.setVisible(true);
        }
}
