package practica1;

public class Circulo {

    private double radio;
    private Punto centro;

    public Circulo(double radio, Punto centro) {
        this.radio = radio;
        this.centro = centro;
    }

    public Circulo() {
        this.radio = 5;
        this.centro = new Punto(8, 12);
    }

    public Circulo(double radio, double x, double y) {
        this.radio = radio;
        this.centro = new Punto(x, y);
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double calcularDistancia (Punto externo){
        return this.centro.calcularDistancia(externo)-this.radio;
    }
    public double calcularArea(){
        return Math.PI*Math.pow(this.radio,2);
    }
    public double calularPerimetro(){
        return 2*Math.PI*this.radio;
    }

}
