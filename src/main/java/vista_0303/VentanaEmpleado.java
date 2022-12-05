/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista_0303;

import controlador_0303.EmpleadoControl;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kevinandres
 */
public class VentanaEmpleado extends JFrame implements ActionListener {

    private EmpleadoControl empleadoControl;
    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldList;
    private List<JLabel> jLabelList;

    public VentanaEmpleado() {
        this.setSize(400, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarComponentes() {
        this.empleadoControl = new EmpleadoControl();
        this.jPanelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();

        this.jPanelList.add(new JPanel());

        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));
        this.jButtonList.add(new JButton("Borrar"));
        

        this.jTextFieldList.add(new JTextField("", 10));
        this.jTextFieldList.add(new JTextField("", 5));
        this.jTextFieldList.add(new JTextField("", 10));
        this.jTextFieldList.add(new JTextField("yyyy", 5));
        this.jTextFieldList.add(new JTextField("mm", 5));
        this.jTextFieldList.add(new JTextField("dd", 5));

        this.jLabelList.add(new JLabel("Ingrese el nombre del empleado: "));
        this.jLabelList.add(new JLabel("Ingrese el codigo del empleado: "));
        this.jLabelList.add(new JLabel("Ingrese el puesto del empleado: "));
        this.jLabelList.add(new JLabel("Ingrese la Fecha N. : "));

        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));
        this.jPanelList.get(0).add(this.jLabelList.get(2));
        this.jPanelList.get(0).add(this.jTextFieldList.get(2));
        this.jPanelList.get(0).add(this.jLabelList.get(3));
        this.jPanelList.get(0).add(this.jTextFieldList.get(3));
        this.jPanelList.get(0).add(this.jTextFieldList.get(4));
        this.jPanelList.get(0).add(this.jTextFieldList.get(5));

        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));
        this.jPanelList.get(0).add(this.jButtonList.get(2));

        this.jButtonList.get(0).addActionListener(this);
        this.jButtonList.get(1).addActionListener(this);
        this.jButtonList.get(2).addActionListener(this);
       

    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource().equals(this.jButtonList.get(0))) {
            String [] datos = new String[6];
            datos[0]=this.jTextFieldList.get(0).getText();
            datos[1] = this.jTextFieldList.get(1).getText();
            datos[2] = this.jTextFieldList.get(2).getText();
            datos[3] = this.jTextFieldList.get(3).getText();
            datos[4] = this.jTextFieldList.get(4).getText();
            datos[5] = this.jTextFieldList.get(5).getText();
            this.empleadoControl.crear(datos);  
        }
        
        if (e.getSource().equals(this.jButtonList.get(1))) {
            for (var viaje : this.empleadoControl.listar()) {
                System.out.println("viaje = " + viaje.toString());
            }
        }
        
        
         if (e.getSource().equals(this.jButtonList.get(2))) {
             
            this.jTextFieldList.get(0).setText("");
            this.jTextFieldList.get(1).setText("");
            this.jTextFieldList.get(2).setText("");
            this.jTextFieldList.get(3).setText("yyyy"); 
            this.jTextFieldList.get(4).setText("mm");
            this.jTextFieldList.get(5).setText("dd");
                
            }
      
    }
    
}
