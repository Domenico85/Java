package practica1;

public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this.x = 5;
        this.y = 7;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calcularDistancia(Punto otro) {
        double distX = this.x - otro.x;
        double distY = this.y - otro.y;
        return Math.sqrt(Math.pow(distX, 2) + Math.pow(distY, 2));
    }

}
