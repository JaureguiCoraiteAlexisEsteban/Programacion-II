package algebravectorial;
import java.util.Arrays;

public class AlgebraVectorial {
    private double[] vectorA;
    private double[] vectorB;

    // Constructor por defecto
    public AlgebraVectorial() {
        this.vectorA = new double[]{0, 0, 0};
        this.vectorB = new double[]{0, 0, 0};
    }

    public AlgebraVectorial(double[] a, double[] b) {
        this.vectorA = a;
        this.vectorB = b;
    }

    private double norma(double[] v) {
        return Math.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
    }

    private double productoPunto(double[] a, double[] b) {
        return a[0] * b[0] + a[1] * b[1] + a[2] * b[2];
    }

    public boolean esPerpendicular() {
        double[] suma = {vectorA[0] + vectorB[0], vectorA[1] + vectorB[1], vectorA[2] + vectorB[2]};
        double[] resta = {vectorA[0] - vectorB[0], vectorA[1] - vectorB[1], vectorA[2] - vectorB[2]};
        return Math.abs(norma(suma) - norma(resta)) < 1e-6;
    }

    public boolean esPerpendicularMutuo() {
        return Math.abs(norma(new double[]{vectorA[0] - vectorB[0], vectorA[1] - vectorB[1], vectorA[2] - vectorB[2]}) -
                norma(new double[]{vectorB[0] - vectorA[0], vectorB[1] - vectorA[1], vectorB[2] - vectorA[2]})) < 1e-6;
    }

    public boolean esPerpendicularDot() {
        return Math.abs(productoPunto(vectorA, vectorB)) < 1e-6;
    }

    public boolean esPerpendicularPitágoras() {
        double[] suma = {vectorA[0] + vectorB[0], vectorA[1] + vectorB[1], vectorA[2] + vectorB[2]};
        return Math.abs(norma(suma) * norma(suma) - (norma(vectorA) * norma(vectorA) + norma(vectorB) * norma(vectorB))) < 1e-6;
    }

    public boolean esParaleloEscalar(double escalar) {  
        double[] vectorBEscalado = new double[vectorB.length];
        for (int i = 0; i < vectorB.length; i++) {
            vectorBEscalado[i] = escalar * vectorB[i];
        }

        return Arrays.equals(vectorA, vectorBEscalado);
    }

    public boolean esParaleloCruz() {
        double[] cruz = {vectorA[1] * vectorB[2] - vectorA[2] * vectorB[1],
                         vectorA[2] * vectorB[0] - vectorA[0] * vectorB[2],
                         vectorA[0] * vectorB[1] - vectorA[1] * vectorB[0]};
        return Math.abs(cruz[0]) < 1e-6 && Math.abs(cruz[1]) < 1e-6 && Math.abs(cruz[2]) < 1e-6;
    }

    public double[] proyeccionSobreB() {
        double factor = productoPunto(vectorA, vectorB) / (norma(vectorB) * norma(vectorB));
        return new double[]{factor * vectorB[0], factor * vectorB[1], factor * vectorB[2]};
    }

    public double componenteEnB() {
        return productoPunto(vectorA, vectorB) / norma(vectorB);
    }

    public static void main(String[] args) {
        
        double[] a = {6, 8, 0};
        double[] b = {3, 4, 0};

        AlgebraVectorial algebra = new AlgebraVectorial(a, b);

        System.out.println("¿Son perpendiculares? " + algebra.esPerpendicular());
        System.out.println("¿Son mutuamente ortogonales? " + algebra.esPerpendicularMutuo());
        System.out.println("¿Son ortogonales (producto punto)? " + algebra.esPerpendicularDot());
        System.out.println("¿Cumplen el teorema de Pitágoras? " + algebra.esPerpendicularPitágoras());
        System.out.println("¿Son paralelos? " + algebra.esParaleloEscalar(2));        
        System.out.println("¿Son paralelos (producto cruz)? " + algebra.esParaleloCruz());

        double[] proy = algebra.proyeccionSobreB();
        System.out.println("Proyección de A sobre B: [" + proy[0] + ", " + proy[1] + ", " + proy[2] + "]");

        System.out.println("Componente de A en dirección de B: " + algebra.componenteEnB());
    }
    
}
