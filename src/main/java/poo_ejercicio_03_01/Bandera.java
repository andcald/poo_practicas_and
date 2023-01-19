/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_03_01;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kevinandres
 */
public class Bandera extends JFrame {

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;

    public Bandera()throws HeadlessException {
        this.setTitle("BorderLayout");
        this.setSize(300, 100);
        this.setLocation(500, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.jPanelList.get(0).setLayout(new GridLayout(2, 1));
        this.jPanelList.get(1).setLayout(new GridLayout(1, 8));
        
       // this.jPanelList.get(0).setLayout(new BorderLayout());
        //this.jPanelList.get(1).setBorder(BorderFactory.createTitledBorder(
        //BorderFactory.createEtchedBorder(),""));
        this.setVisible(true);
        this.setContentPane(this.jPanelList.get(0));
    
    
    }
    
    
    
    
    private void iniciarPaneles() {

        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.red);
        this.jPanelList.get(1).setBackground(Color.red);
        this.jPanelList.get(2).setBackground(Color.red);
        this.jPanelList.get(3).setBackground(Color.red);
        this.jPanelList.get(4).setBackground(Color.red);
        this.jPanelList.get(5).setBackground(Color.white);
        this.jPanelList.get(6).setBackground(Color.blue);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(1).add(this.jPanelList.get(3));
        this.jPanelList.get(1).add(this.jPanelList.get(4));
        this.jPanelList.get(1).add(this.jPanelList.get(5));
        this.jPanelList.get(1).add(this.jPanelList.get(6));
        
    }

    

    
   
}
    

