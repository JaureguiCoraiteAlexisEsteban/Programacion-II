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
public class Circulo {
    public Punto centro;
    public double radio;
    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }
    @Override
    public String toString() {
        return "Círculo(Centro: " + centro + ", Radio: " + radio + ")";
    }
    public void dibujaCirculo() {
        JFrame frame = new JFrame("Dibujo de Círculo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new PanelCirculo(centro, radio));
        frame.setVisible(true);
    }
    private static class PanelCirculo extends JPanel {
        private Punto centro;
        private double radio;

        public PanelCirculo(Punto centro, double radio) {
            this.centro = centro;
            this.radio = radio;
        }
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.RED);
            int x = (int) (centro.getX() * 50);
            int y = (int) (centro.getY() * 50);
            int r = (int) (radio * 50);
            g.drawOval(x - r, y - r, 2 * r, 2 * r);
        }
    }
}
