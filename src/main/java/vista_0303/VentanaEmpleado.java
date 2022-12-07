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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import modelo_0303.Empleado;
import servicio_0303.EmpleadoServiceImpl;

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
    private List<JTable> jTableList;
    private List<JScrollPane> JScrollList;
    private List<EmpleadoServiceImpl> empleadosList;

    public VentanaEmpleado() {
        this.setSize(600, 600);
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
        this.jTableList = new ArrayList<>();
        this.JScrollList = new ArrayList<>();
        this.empleadosList = new ArrayList<>();
        
        
        
        
            

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(null);

        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));
        this.jButtonList.add(new JButton("Borrar"));

        this.jTextFieldList.add(new JTextField("", 10));
        this.jTextFieldList.add(new JTextField("", 5));
        this.jTextFieldList.add(new JTextField("", 10));
        this.jTextFieldList.add(new JTextField("yyyy", 5));
        this.jTextFieldList.add(new JTextField("mm", 5));
        this.jTextFieldList.add(new JTextField("dd", 5));
        

        this.jLabelList.add(new JLabel("Ingrese el nombre del empleado: ", SwingConstants.LEFT));
        this.jLabelList.get(0).setBounds(20, 10, 250, 20);
        this.jLabelList.add(new JLabel("Ingrese el codigo del empleado: ", SwingConstants.LEFT));
        this.jLabelList.get(1).setBounds(20, 40, 250, 20);
        this.jLabelList.add(new JLabel("Ingrese el puesto del empleado: ", SwingConstants.LEFT));
        this.jLabelList.get(2).setBounds(20, 80, 250, 20);
        this.jLabelList.add(new JLabel("Ingrese la Fecha Nacimiento : ", SwingConstants.LEFT));
        this.jLabelList.get(3).setBounds(20, 110, 250, 20);

        this.jTextFieldList.get(0).setBounds(300, 10, 250, 20);
        this.jTextFieldList.get(1).setBounds(300, 40, 250, 20);
        this.jTextFieldList.get(2).setBounds(300, 80, 250, 20);

        this.jTextFieldList.get(3).setBounds(300, 110, 40, 20);
        this.jTextFieldList.get(4).setBounds(345, 110, 40, 20);
        this.jTextFieldList.get(5).setBounds(390, 110, 40, 20);

        this.jButtonList.get(0).setBounds(50, 150, 80, 28);
        this.jButtonList.get(1).setBounds(130, 150, 80, 28);
        this.jButtonList.get(2).setBounds(210, 150, 80, 28);

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

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Codigo");
        modelo.addColumn("Puesto");
        modelo.addColumn("FechaNacimiento");
       /*
        var data = new String[6];

        data[0] = "Andres Calderon";
        data[1] = "4041";
        data[2] = "Gerente";
        data[3] = "19/04/1999";
        
        
*/

        this.jTableList.add(new JTable(modelo));
        this.jTableList.get(0).setBounds(20, 220, 500, 300);
        this.jPanelList.get(0).add(this.jTableList.get(0));

        this.JScrollList.add(new JScrollPane(this.jTableList.get(0), ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED));
        this.JScrollList.get(0).setBounds(20, 220, 500, 300);
        this.jPanelList.get(0).add(this.JScrollList.get(0));

        
        this.jLabelList.add(new JLabel("Guardado", SwingConstants.LEFT)); 
        this.jLabelList.get(4).setBounds(20, 190, 250, 20);
        
       // this.jTextFieldList.add(new JTextField("dd", 5));
         
        
    }
    
    
    
    
    public void agregarEmpleado(EmpleadoServiceImpl empleadosList1){
        empleadosList.add(empleadosList1);
        
    
    }

    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if (e.getSource().equals(this.jButtonList.get(0))) {
            String[] datos = new String[6];
            datos[0] = this.jTextFieldList.get(0).getText();
            datos[1] = this.jTextFieldList.get(1).getText();
            datos[2] = this.jTextFieldList.get(2).getText();
            datos[3] = this.jTextFieldList.get(3).getText();
            datos[4] = this.jTextFieldList.get(4).getText();
            datos[5] = this.jTextFieldList.get(5).getText();
            
            this.jPanelList.get(0).add(this.jLabelList.get(4));
            
            
            
            
            this.empleadoControl.crear(datos);
           
            
            
             
        }

        
        
        if (e.getSource().equals(this.jButtonList.get(1))) {
            for (var empleado : this.empleadoControl.listar()) {
                System.out.println("Empleado = " + empleado.toString());
                
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
