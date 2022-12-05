/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista_0302;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author kevinandres
 */
public class Ventana02_02 extends JFrame {

    public List<JPanel> jPanelList;
    public List<JLabel> jLabelList;
    public List<JTextField> jTextFieldList;

    public Ventana02_02(String title) throws HeadlessException {
        super(title);
        this.setSize(500, 500);
        this.setLocation(850, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarJPanel();
        this.iniciarJLabel();
        this.iniciarJTexTField();
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
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());
        this.jPanelList.add(new JPanel());

        this.jPanelList.get(0).setBackground(Color.CYAN);
        this.jPanelList.get(0).setLayout(new GridLayout(10, 1));
        this.jPanelList.get(0).setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Personal"));

        this.jPanelList.get(1).setBackground(Color.CYAN);
        this.jPanelList.get(2).setBackground(Color.WHITE);
        this.jPanelList.get(3).setBackground(Color.WHITE);
        this.jPanelList.get(4).setBackground(Color.WHITE);
        this.jPanelList.get(5).setBackground(Color.WHITE);
        this.jPanelList.get(6).setBackground(Color.WHITE);
        this.jPanelList.get(7).setBackground(Color.WHITE);
        this.jPanelList.get(8).setBackground(Color.WHITE);
        this.jPanelList.get(9).setBackground(Color.WHITE);
        this.jPanelList.get(10).setBackground(Color.WHITE);

        this.jPanelList.get(0).add(this.jPanelList.get(1));
        this.jPanelList.get(0).add(this.jPanelList.get(2));
        this.jPanelList.get(0).add(this.jPanelList.get(3));
        this.jPanelList.get(0).add(this.jPanelList.get(4));
        this.jPanelList.get(0).add(this.jPanelList.get(5));
        this.jPanelList.get(0).add(this.jPanelList.get(6));
        this.jPanelList.get(0).add(this.jPanelList.get(7));
        this.jPanelList.get(0).add(this.jPanelList.get(8));
        this.jPanelList.get(0).add(this.jPanelList.get(9));
        this.jPanelList.get(0).add(this.jPanelList.get(10));
    }

    public void iniciarJLabel() {
        this.jLabelList = new ArrayList<>();
        this.jLabelList.add(new JLabel("DATOS PERSONALES"));
        this.jLabelList.add(new JLabel("Apellidos:"));
        this.jLabelList.add(new JLabel("ALVAREZ NAULA"));
        this.jLabelList.add(new JLabel("Nombres:"));
        this.jLabelList.add(new JLabel("PEDRO ANDRES"));
        this.jLabelList.add(new JLabel("Nacionalidad:"));
        this.jLabelList.add(new JLabel("ECUATORIANA"));
        this.jLabelList.add(new JLabel("Género:"));
        this.jLabelList.add(new JLabel("Masculino"));
        this.jLabelList.add(new JLabel("Correo electrónico personal:"));
        this.jLabelList.add(new JLabel("palvarezn1@est.ups.edu.ec"));
        this.jLabelList.add(new JLabel("Fecha Nacimiento:"));
        this.jLabelList.add(new JLabel("12-05-1999"));
        this.jLabelList.add(new JLabel("Télefono Domicilio:"));
        this.jLabelList.add(new JLabel("072801156"));
        this.jLabelList.add(new JLabel("Télefono Celular:"));
        this.jLabelList.add(new JLabel("0984017027"));
        this.jLabelList.add(new JLabel("Whatsapp:"));

        this.jPanelList.get(1).add(this.jLabelList.get(0));
        this.jPanelList.get(2).add(this.jLabelList.get(1));
        this.jPanelList.get(2).add(this.jLabelList.get(2));
        this.jPanelList.get(3).add(this.jLabelList.get(3));
        this.jPanelList.get(3).add(this.jLabelList.get(4));
        this.jPanelList.get(4).add(this.jLabelList.get(5));
        this.jPanelList.get(4).add(this.jLabelList.get(6));
        this.jPanelList.get(5).add(this.jLabelList.get(7));
        this.jPanelList.get(5).add(this.jLabelList.get(8));
        this.jPanelList.get(6).add(this.jLabelList.get(9));
        this.jPanelList.get(6).add(this.jLabelList.get(10));
        this.jPanelList.get(7).add(this.jLabelList.get(11));
        this.jPanelList.get(7).add(this.jLabelList.get(12));
        this.jPanelList.get(8).add(this.jLabelList.get(13));
        this.jPanelList.get(8).add(this.jLabelList.get(14));
        this.jPanelList.get(9).add(this.jLabelList.get(15));
        this.jPanelList.get(9).add(this.jLabelList.get(16));
        this.jPanelList.get(10).add(this.jLabelList.get(17));
    }

    public void iniciarJTexTField() {
        this.jTextFieldList = new ArrayList<>();
        this.jTextFieldList.add(new JTextField(10));
        this.jPanelList.get(10).add(this.jTextFieldList.get(0));
    }
}
