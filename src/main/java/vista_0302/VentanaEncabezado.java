/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista_0302;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author kevinandres
 */
public class VentanaEncabezado extends JFrame implements ActionListener {

    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldList;
    private List<JLabel> jLabelList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public VentanaEncabezado() {

        this.setSize(800, 140);
        this.setLocation(200, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarComponentes() {

        this.jPanelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jComboBoxList = new ArrayList<>();
        this.jCheckBoxList = new ArrayList<>();

        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.white);

        this.jLabelList.add(new JLabel("Sede:")); //00
        var listaSedes = new String[4];
        listaSedes[0] = "Seleccionar Sede";
        listaSedes[1] = "Cuenca";
        listaSedes[2] = "Guayaquil";
        listaSedes[3] = "Quito";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaSedes)));
        this.jComboBoxList.add(new JComboBox());

        this.jLabelList.add(new JLabel("Campus :")); //00
        var listaCampus = new String[4];
        listaCampus[0] = "Seleccionar Campus";
        listaCampus[1] = "Vecino";
        listaCampus[2] = "Via la Costa";
        listaCampus[3] = "Quito Norte";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCampus)));
        this.jComboBoxList.add(new JComboBox());

        this.jLabelList.add(new JLabel("Carreras :")); //00
        var listaCarreras = new String[6];
        listaCarreras[0] = "Seleccionar Carrera";
        listaCarreras[1] = "Electronica";
        listaCarreras[2] = "Arquitectura";
        listaCarreras[3] = "Odontologia";
        listaCarreras[4] = "Mecatronica";
        listaCarreras[5] = "Sistemas";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCarreras)));
        this.jComboBoxList.add(new JComboBox());

        this.jLabelList.add(new JLabel("Codigo Proyecto:")); //00
        var listaCodigo = new String[4];
        listaCodigo[0] = " Codigo";
        listaCodigo[1] = "Redisenio";
        listaCodigo[2] = "Malla 2019";
        listaCodigo[3] = "Malla 2013";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaCodigo)));
        this.jComboBoxList.add(new JComboBox());

        this.jLabelList.add(new JLabel("Modalidad:")); //00
        var listaModalidad = new String[3];
        listaModalidad[0] = "Modalidad";
        listaModalidad[1] = "Presencial";
        listaModalidad[2] = "Virtual";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaModalidad)));
        this.jComboBoxList.add(new JComboBox());

        this.jLabelList.add(new JLabel("Periodo Academico:")); //00
        var listaPeriodo = new String[3];

        listaPeriodo[0] = "2022 - 2023";
        listaPeriodo[1] = "2022 - 2022";
        listaPeriodo[2] = "2021 - 2022";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaPeriodo)));
        this.jComboBoxList.add(new JComboBox());

        this.jLabelList.add(new JLabel("Inicio Clases:20/09/2022; Fin de clases 30/01/2023")); //00

        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jComboBoxList.get(0));

        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jComboBoxList.get(2));

        this.jPanelList.get(0).add(this.jLabelList.get(2));
        this.jPanelList.get(0).add(this.jComboBoxList.get(4));

        this.jPanelList.get(0).add(this.jLabelList.get(3));
        this.jPanelList.get(0).add(this.jComboBoxList.get(6));

        this.jPanelList.get(0).add(this.jLabelList.get(4));
        this.jPanelList.get(0).add(this.jComboBoxList.get(8));

        this.jPanelList.get(0).add(this.jLabelList.get(5));
        this.jPanelList.get(0).add(this.jComboBoxList.get(10));

        this.jPanelList.get(0).add(this.jLabelList.get(6));

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
