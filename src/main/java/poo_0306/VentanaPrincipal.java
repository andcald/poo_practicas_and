/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0306;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author kevinandres
 */
public class VentanaPrincipal extends JFrame {
    
    private PanelPaint panelPaint;
    
    
    public VentanaPrincipal() {
        
        this.setSize(1000, 700);
        this.setLocation(100, 100);
        this.setTitle("Simulacion Prueba");
        this.panelPaint = new PanelPaint();
        this.panelPaint.setBackground(Color.red);
        setContentPane(panelPaint);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    
    
    public static void main(String[] args) {
        new VentanaPrincipal();
    }

    

   
    
}
