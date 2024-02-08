package practica1;

public class Triangulo {

    private Punto e1, e2, e3;

    public Triangulo(Punto e1, Punto e2, Punto e3) {
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    public Triangulo() {
        this.e1 = new Punto(3, 4);
        this.e2 = new Punto(8, 9);
        this.e3 = new Punto(5, 10);
    }

    public Triangulo(double xe1, double ye1, double xe2, double ye2, double xe3, double ye3) {
        this.e1 = new Punto(xe1, ye1);
        this.e2 = new Punto(xe2, ye2);
        this.e3 = new Punto(xe3, ye3);
    }

    public Punto getE1() {
        return e1;
    }

    public void setE1(Punto e1) {
        this.e1 = e1;
    }

    public Punto getE2() {
        return e2;
    }

    public void setE2(Punto e2) {
        this.e2 = e2;
    }

    public Punto getE3() {
        return e3;
    }

    public void setE3(Punto e3) {
        this.e3 = e3;
    }

    public double calcularDistancia(Punto externo) {
        //version1
        return this.e1.calcularDistancia(externo);
    }

    public double calcularArea() {
        double base = this.e1.calcularDistancia(e2);
        double altura = this.e2.calcularDistancia(e3);
        return base * altura / 2;
    }

    public double calculaPerimetro() {
        double lado1 = this.e1.calcularDistancia(e2);
        double lado2 = this.e1.calcularDistancia(e3);
        double lado3 = this.e3.calcularDistancia(e2);
        return lado1 + lado2 + lado3;
    }
}
