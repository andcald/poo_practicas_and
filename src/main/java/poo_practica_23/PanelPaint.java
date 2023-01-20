/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_practica_23;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author kevinandres
 */
public class PanelPaint extends JPanel implements MouseListener {

    private int[] puntosx = new int[3];
    private int[] puntosy = new int[3];
    private int clicks = 0;

    public PanelPaint() {
        this.addMouseListener(this);

        puntosx[0] = 0;
        puntosy[0] = 0;

        puntosx[1] = 0;
        puntosy[1] = 0;

        puntosx[2] = 0;
        puntosy[2] = 0;
    }

    @Override
    public void paint(Graphics g) {

        super.paint(g);
        g.setColor(Color.BLACK);

        g.fillPolygon(puntosx, puntosy, 3);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        if (clicks == 0) {
            puntosx[0] = e.getX();
            puntosy[0] = e.getY();
        }

        if (clicks == 1) {
            puntosx[1] = e.getX();
            puntosy[1] = e.getY();

        }

        if (clicks == 2) {
            puntosx[2] = e.getX();
            puntosy[2] = e.getY();
            clicks = -1;
        }
        clicks++;
        super.repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
