/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_0303_vista;

/**
 *
 * @author karly
 */
import poo_0303_controlador.EmpresaControl;
import java.awt.ScrollPane;
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
import poo_0303_modelo.Empresa;
import poo_0303_servicio.EmpresaServiceImpl;

public class VentanaEmpresa extends JFrame implements ActionListener {

    private EmpresaControl empresaControl;

    private List<JPanel> jPanelList;
    private List<JButton> jButtonList;
    private List<JTextField> jTextFieldList;
    private List<JLabel> jLabelList;
    private List<JTable> jTableList;
    private List<JScrollPane> JScrollList;
    private List<EmpresaServiceImpl> empresaList;

    public VentanaEmpresa() {
        this.setSize(600, 400);
        this.setLocation(600, 0);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanelList.get(0));
        this.setVisible(true);
    }

    public void iniciarComponentes() {

        this.empresaControl = new EmpresaControl();
        this.jPanelList = new ArrayList<>();
        this.jTextFieldList = new ArrayList<>();
        this.jButtonList = new ArrayList<>();
        this.jLabelList = new ArrayList<>();
        this.jTableList = new ArrayList<>();
        this.JScrollList = new ArrayList<>();
        this.empresaList = new ArrayList<>();

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

        this.jLabelList.add(new JLabel("Ingrese el nombre de la "
                + "empresa: ", SwingConstants.LEFT));
        this.jLabelList.get(0).setBounds(20, 10, 250, 20);
        this.jLabelList.add(new JLabel("Ingrese el codigo de la "
                + "empresa: ", SwingConstants.LEFT));
        this.jLabelList.get(1).setBounds(20, 40, 250, 20);
        this.jLabelList.add(new JLabel("Ingrese el nombre del dueño de la "
                + "empresa: ", SwingConstants.LEFT));
        this.jLabelList.get(2).setBounds(20, 80, 250, 20);
        this.jLabelList.add(new JLabel("Ingrese la Fecha de creacion "
                + "yyyy/mm/dd : ", SwingConstants.LEFT));
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

    }

    public void agregarEmpresa(EmpresaServiceImpl empresaList1) {
        empresaList.add(empresaList1);

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

            this.empresaControl.crear(datos);

        }

        if (e.getSource().equals(this.jButtonList.get(1))) {
            for (var empresa : this.empresaControl.listar()) {
                System.out.println("Empresa = " + empresa.toString());

            }
        }

        if (e.getSource().equals(this.jButtonList.get(2))) {

            this.jTextFieldList.get(0).setText("");
            this.jTextFieldList.get(1).setText("");
            this.jTextFieldList.get(2).setText("");

        }

    }

}
