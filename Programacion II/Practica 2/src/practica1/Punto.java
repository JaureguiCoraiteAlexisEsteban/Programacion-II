/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;
import java.text.DecimalFormat;
/**
 *
 * @author aalex
 */
public class Punto {
    public float x;
    public float y;
    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public double[] coordCartesianas() {
        return new double[]{x, y};
    }
    public double[] coordPolares() {
        double r = Math.sqrt(x * x + y * y);
        double theta = Math.atan2(y, x);  // Ángulo en radianes
        return new double[]{r, theta};
    }
    public double getX() { return x; }
    public double getY() { return y; }
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        return "Punto(" + df.format(x) + ", " + df.format(y) + ")";
    }
}
