/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author aalex
 */
public class Linea {
    public Punto p1;
    public Punto p2;
    public Linea(Punto p1, Punto p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    @Override
    public String toString() {
        return "Línea(" + p1 + ", " + p2 + ")";
    }
    public void dibujaLinea() {
        JFrame frame = new JFrame("Dibujo de Línea");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new PanelLinea(p1, p2));
        frame.setVisible(true);
    }
    private static class PanelLinea extends JPanel {
        private Punto p1, p2;

        public PanelLinea(Punto p1, Punto p2) {
            this.p1 = p1;
            this.p2 = p2;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawLine((int) p1.getX() * 50, (int) p1.getY() * 50, (int) p2.getX() * 50, (int) p2.getY() * 50);
        }
    }
}
