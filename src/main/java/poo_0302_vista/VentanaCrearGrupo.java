/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0302_vista;

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
public class VentanaCrearGrupo extends JFrame implements ActionListener {

    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldList;
    private List<JLabel> jLabelList;
    public List<JCheckBox> jCheckBoxList;
    public List<JRadioButton> jRadioButtonList;
    public List<JComboBox> jComboBoxList;

    public VentanaCrearGrupo() {

        this.setTitle("CREAR GRUPO");
        this.setSize(800, 600);
        this.setLocation(200, 100);
        this.setSize(500, 500);
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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        // this.jPanelList.get(0).setLayout(new GridLayout(2, 1));
        this.jPanelList.get(0).setLayout(new GridLayout(14, 2));

        this.jPanelList.get(0).setBackground(Color.white);

        this.jLabelList.add(new JLabel("Periodo Academico:")); //00
        this.jLabelList.add(new JLabel("2022 - 2022 "));  //1

        this.jLabelList.add(new JLabel("Sede:")); //2
        this.jLabelList.add(new JLabel("Matriz Cuenca"));//3

        this.jLabelList.add(new JLabel("Campus:"));//4
        this.jLabelList.add(new JLabel("El Vecino"));//5

        this.jLabelList.add(new JLabel("Modalidad:"));//6
        this.jLabelList.add(new JLabel("Precencial"));//7

        this.jLabelList.add(new JLabel("Carrera:"));//8
        this.jLabelList.add(new JLabel("Agropecuaria"));//9

        this.jLabelList.add(new JLabel("Codigo de Proyecto:"));//10
        this.jLabelList.add(new JLabel("Agropecuaria[Redisenio]"));//11

        this.jLabelList.add(new JLabel("Asignatura:"));//12
        this.jLabelList.add(new JLabel("E-VC-IAG-003 BOTANICA"));//13

        this.jLabelList.add(new JLabel("Nombre del Grupo:"));//14
        this.jTextFieldList.add(new JTextField("Grupo-1", 20));
        this.jLabelList.add(new JLabel("91 caracteres restantes"));//15

        this.jLabelList.add(new JLabel("Cupos por Grupo:"));//16
        this.jTextFieldList.add(new JTextField("", 20));

        this.jLabelList.add(new JLabel("Autorizacion calificacion sobre 100:"));//17
        var listaSN = new String[2];
        listaSN[0] = "SI";
        listaSN[1] = "NO";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaSN)));
        this.jComboBoxList.add(new JComboBox());

        this.jLabelList.add(new JLabel("Seleccionar Jornada del Grupo:"));//18
        var listaJornada = new String[4];
        listaJornada[0] = "Seleccionar Jornada";
        listaJornada[1] = "Diurna";
        listaJornada[2] = "Vespertina";
        listaJornada[3] = "Nocturna";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaJornada)));
        this.jComboBoxList.add(new JComboBox());

        this.jLabelList.add(new JLabel("Oferta para estudiantes:"));//19
        this.jCheckBoxList.add(new JCheckBox("Nuevos", true));

        this.jLabelList.add(new JLabel("Aplica cambio de grupo:"));//20
        var listaC = new String[2];
        listaC[0] = "NO";
        listaC[1] = "SI";
        this.jComboBoxList.add(new JComboBox(new DefaultComboBoxModel(listaC)));
        this.jComboBoxList.add(new JComboBox());

        this.jPanelList.get(0).add(this.jLabelList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(1));
        this.jPanelList.get(0).add(this.jLabelList.get(2));
        this.jPanelList.get(0).add(this.jLabelList.get(3));
        this.jPanelList.get(0).add(this.jLabelList.get(4));
        this.jPanelList.get(0).add(this.jLabelList.get(5));
        this.jPanelList.get(0).add(this.jLabelList.get(6));
        this.jPanelList.get(0).add(this.jLabelList.get(7));
        this.jPanelList.get(0).add(this.jLabelList.get(8));
        this.jPanelList.get(0).add(this.jLabelList.get(9));
        this.jPanelList.get(0).add(this.jLabelList.get(10));
        this.jPanelList.get(0).add(this.jLabelList.get(11));
        this.jPanelList.get(0).add(this.jLabelList.get(12));
        this.jPanelList.get(0).add(this.jLabelList.get(13));
        this.jPanelList.get(0).add(this.jLabelList.get(14));
        this.jPanelList.get(0).add(this.jTextFieldList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(16));
        this.jPanelList.get(0).add(this.jTextFieldList.get(1));
        this.jPanelList.get(0).add(this.jLabelList.get(17));
        this.jPanelList.get(0).add(this.jComboBoxList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(18));
        this.jPanelList.get(0).add(this.jComboBoxList.get(2));
        this.jPanelList.get(0).add(this.jLabelList.get(19));
        this.jPanelList.get(0).add(this.jCheckBoxList.get(0));
        this.jPanelList.get(0).add(this.jLabelList.get(20));
        this.jPanelList.get(0).add(this.jComboBoxList.get(4));

        this.jButtonList.add(new JButton("Guardar"));
        this.jButtonList.add(new JButton("Cancelar"));
        this.jPanelList.get(0).add(this.jButtonList.get(0));
        this.jPanelList.get(0).add(this.jButtonList.get(1));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
