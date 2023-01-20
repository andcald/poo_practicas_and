/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0302_vista;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Kevinandres
 */
public class Ventana01 extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JButton> jButtonList;
    public List<JTextField> jTextFieldsList;
    public List<JComboBox> jComboBoxList;

    public Ventana01(String title) throws HeadlessException {
        super(title);
        this.setSize(400, 400);
        this.setLocation(500, 50);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarJPanel();
        this.iniciarJLabel();
        this.iniciarJComboBox();
        this.iniciarJTexTField();
        this.iniciarJButton();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarJPanel() {

        this.jPanelList = new ArrayList<>();
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.CYAN);
        this.jPanelList.get(0).setLayout(new GridLayout(10, 1));
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));

        this.jPanelList.get(0).setLayout(new GridLayout(5, 1));
        this.jPanelList.get(0).setBackground(Color.WHITE);
        this.jPanelList.get(1).setBackground(Color.CYAN);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));

    }

    public void iniciarJLabel() {
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("INSCRIBETE"));
        this.jLabelList.add(new JLabel("Seleccione una sede:  *"));
        this.jLabelList.add(new JLabel("Tipo de Documento"));
        this.jLabelList.add(new JLabel("Ingrese su Identificación:  *"));

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(3).add(this.jLabelList.get(2));
        this.jPanelList.get(4).add(this.jLabelList.get(3));

    }

    public void iniciarJComboBox() {
        this.jComboBoxList = new ArrayList<>();
        this.jComboBoxList.add(new JComboBox());
        this.jComboBoxList.add(new JComboBox());

        this.jComboBoxList.get(0).addItem(" CUENCA");
        this.jComboBoxList.get(0).addItem(" QUITO");
        this.jComboBoxList.get(0).addItem(" GUAYAQUIL");

        this.jComboBoxList.get(1).addItem("CÉDULA");
        this.jComboBoxList.get(1).addItem("PASAPORTE");

        this.jPanelList.get(2).add(this.jComboBoxList.get(0));
        this.jPanelList.get(3).add(this.jComboBoxList.get(1));

    }

    public void iniciarJTexTField() {
        this.jTextFieldsList = new ArrayList<>();
        this.jTextFieldsList.add(new JTextField(12));
        this.jPanelList.get(4).add(this.jTextFieldsList.get(0));
    }

    public void iniciarJButton() {
        this.jButtonList = new ArrayList<>();
        this.jButtonList.add(new JButton("Ingresar"));
        this.jPanelList.get(5).add(this.jButtonList.get(0));

    }

}
