/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista_0303;

import controlador_0303.DepartamentoControl;
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
import javax.swing.SwingConstants;
import servicio_0303.DepartamentoServiceImpl;

/**
 *
 * @author kevinandres
 */
public class VentanaDepartamento extends JFrame implements ActionListener{
   
  

    private DepartamentoControl departamentoControl;

    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldList;
    private List<JLabel> jLabelList;
    private List<JTable> jTableList;
    private List<JScrollPane> JScrollList;
    private List<DepartamentoServiceImpl> departamentoList;

    public VentanaDepartamento() {
        this.setSize(600, 400);
        this.setLocation(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarComponentes() {

        this.departamentoControl = new DepartamentoControl();
        this.jPanelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jTableList = new ArrayList<>();
        this.JScrollList = new ArrayList<>();
        this.departamentoList = new ArrayList<>();

        this.jPanelList.add(new JPanel());
        this.jPanelList.get(0).setLayout(null);

        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Listar"));
        this.jButtonList.add(new JButton("Borrar"));

        this.jTextFieldList.add(new JTextField("", 10));
        this.jTextFieldList.add(new JTextField("", 5));
        this.jTextFieldList.add(new JTextField("", 10));
        this.jTextFieldList.add(new JTextField("", 5));
        this.jTextFieldList.add(new JTextField("", 5));
        this.jTextFieldList.add(new JTextField("", 5));

        this.jLabelList.add(new JLabel("Ingrese el nombre del "
                + "Departamento: ", SwingConstants.CENTER));
        this.jLabelList.get(0).setBounds(20, 10, 250, 20);
        this.jLabelList.add(new JLabel("Ingrese el codigo del "
                + "Departamento: ", SwingConstants.CENTER));
        this.jLabelList.get(1).setBounds(20, 40, 250, 20);
  
      

        this.jTextFieldList.get(0).setBounds(300, 10, 250, 20);
        this.jTextFieldList.get(1).setBounds(300, 40, 250, 20);
   


        this.jButtonList.get(0).setBounds(50, 150, 80, 28);
        this.jButtonList.get(1).setBounds(130, 150, 80, 28);
        this.jButtonList.get(2).setBounds(210, 150, 80, 28);

        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));
     
  
        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));
        this.jPanelList.get(0).add(this.jButtonList.get(2));

        this.jButtonList.get(0).addActionListener(this);
        this.jButtonList.get(1).addActionListener(this);
        this.jButtonList.get(2).addActionListener(this);
      

    }

    public void agregarDepartamento(DepartamentoServiceImpl departamentoList1) {
        departamentoList.add(departamentoList1);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(this.jButtonList.get(0))) {
            String[] datos = new String[6];
            datos[0] = this.jTextFieldList.get(0).getText();
            datos[1] = this.jTextFieldList.get(1).getText();
            this.departamentoControl.crear(datos);

        }

        
        
        if (e.getSource().equals(this.jButtonList.get(1))) {
            for (var departamento : this.departamentoControl.listar()) {
                System.out.println("departamento = " + departamento.toString());

            }
        }

        if (e.getSource().equals(this.jButtonList.get(2))) {

            this.jTextFieldList.get(0).setText("");
            this.jTextFieldList.get(1).setText("");
          

        }

    }

}