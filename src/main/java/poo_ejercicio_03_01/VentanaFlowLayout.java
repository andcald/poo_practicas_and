/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_ejercicio_03_01;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author kevinandres
 */
public class VentanaFlowLayout extends JFrame {

    private List<JPanel> jPanelList;
    private List<JLabel> jLabelList;
    public List<JButton> jButtonList;

    public VentanaFlowLayout() throws HeadlessException {
        this.setTitle("FlowLayout");
        this.setSize(600, 65);
        this.setLocation(500, 450);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarPaneles();
        this.iniciarJButtons();
        this.setVisible(true);
        this.setContentPane(this.jPanelList.get(0));

    }

    private void iniciarPaneles() {

        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setBackground(Color.orange);

    }

    public void iniciarJButtons() {

        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton());
        this.jButtonList.add(new JButton());
        this.jButtonList.add(new JButton());
        this.jButtonList.add(new JButton());
        this.jButtonList.add(new JButton());

        this.jButtonList.get(0).setText("Button 1");
        this.jButtonList.get(1).setText("2");
        this.jButtonList.get(2).setText("Button 3");
        this.jButtonList.get(3).setText("Long-Named Button 4");
        this.jButtonList.get(4).setText("Button5");

        this.jPanelList.get(0).add(this.jButtonList.get(0));

        this.jPanelList.get(0).add(this.jButtonList.get(1));

        this.jPanelList.get(0).add(this.jButtonList.get(2));

        this.jPanelList.get(0).add(this.jButtonList.get(3));

        this.jPanelList.get(0).add(this.jButtonList.get(4));

    }

}
