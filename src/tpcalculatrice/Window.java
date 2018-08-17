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
import javax.swing.JButton;
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
            this.setSize(240, 280);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            
            JPanel container = new JPanel();
            JPanel panEcran = new JPanel();
            JPanel panBtnCenter = new JPanel();
            JPanel panBtnLeft = new JPanel();
            Border border = BorderFactory.createLineBorder(Color.black);
            String[] libelle_btn = {"1","2","3","4","5","6","7","8","9","0",".","=","C","+","-","*","/"};
            JButton[] buttons = new JButton[libelle_btn.length];
            Dimension dimension1 = new Dimension(50,40);
            Dimension dimension2 = new Dimension(50,31);
            // Create JLabel with border for display screen
            JLabel label = new JLabel("0");
            label.setPreferredSize(new Dimension(220,35));
            label.setBorder(border);
            label.setHorizontalAlignment(JLabel.RIGHT);
            panEcran.setPreferredSize(new Dimension(220,40));
            panEcran.add(label);
            
            panBtnCenter.setPreferredSize(new Dimension(165,225));
            panBtnLeft.setPreferredSize(new Dimension(55,225));
            
            for(int i=0; i<libelle_btn.length; i++){
                buttons[i] = new JButton(libelle_btn[i]);
                buttons[i].setPreferredSize(dimension1);
                
                switch(i){
                    case 12:
                        buttons[i].setForeground(Color.red);
                        panBtnLeft.add(buttons[i]);
                        break;
                    case 13:
                        buttons[i].setPreferredSize(dimension2);
                        panBtnLeft.add(buttons[i]);
                        break;
                    case 14:
                        buttons[i].setPreferredSize(dimension2);
                        panBtnLeft.add(buttons[i]);
                        break;
                    case 15:
                        buttons[i].setPreferredSize(dimension2);
                        panBtnLeft.add(buttons[i]);
                        break;
                    case 16:
                        buttons[i].setPreferredSize(dimension2);
                        panBtnLeft.add(buttons[i]);
                        break;
                    default:
                        panBtnCenter.add(buttons[i]);
                        break;
                }
            }
            
            container.add(panEcran, BorderLayout.NORTH);
            container.add(panBtnCenter, BorderLayout.CENTER);
            container.add(panBtnLeft, BorderLayout.EAST);
            this.setContentPane(container);
            this.setVisible(true);
        }
}
