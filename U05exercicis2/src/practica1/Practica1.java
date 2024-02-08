package practica1;

public class Practica1 {

    public static void main(String[] args) {
        Punto p1 = new Punto(4, 7);
        Punto p2 = new Punto();
        p1.calcularDistancia(p2);
        System.out.println("la distancia entre p1 y p2 es " + p1.calcularDistancia(p2));

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(4, new Punto(3, 4));
        Circulo c3 = new Circulo(4, 3, 4);
        System.out.println("distancia entre c3 y p2 es" + c3.calcularDistancia(p2));
        System.out.println("Area de c3 es " + c3.calcularArea());
        System.out.println("Perimetro de c3 es " + c3.calularPerimetro());
        
        Triangulo t1=new Triangulo(new Punto(1,2), new Punto (4,5), new Punto (7,9));
        System.out.println("El area del triangulo es "+t1.calcularArea());
        System.out.println("El perimetro del triangulo t1 es"+t1.calculaPerimetro());
        System.out.println("La distancia del triangulo t1 al punto p1 es"+t1.calcularDistancia(p1));

    }
}
