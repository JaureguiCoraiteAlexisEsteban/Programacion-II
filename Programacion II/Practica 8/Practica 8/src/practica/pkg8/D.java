package practica.pkg8;
public class D {
    public A a;
    public B b;
    public D(int x, int y, int z) {
        a = new A(x, z);
        b = new B(y, z);
    }
    public void incrementaXYZ() {
        a.x++;
        b.y++;
        a.z++;
        b.z++;
    }
    public void mostrarValores() {
        System.out.println("x_A: " + a.x + ", z_A: " + a.z);
        System.out.println("y_B: " + b.y + ", z_B: " + b.z);
        System.out.println("x_D: " + a.x + " y_D: " + b.y + " z_D: " + b.z);
    }
}
