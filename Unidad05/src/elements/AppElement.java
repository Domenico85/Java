package elements;

public class AppElement {

    public static void main(String[] args) {
        System.out.println("total Elementos: " + Elements.monstrarTotalElementos());
        Elements e1 = new Elements();
        e1.monstrarElemento();
        System.out.println("total Elementos: " + Elements.monstrarTotalElementos());
        Elements e2 = new Elements("cafeteria");
        e2.monstrarElemento();
        System.out.println("total Elementos: " + Elements.monstrarTotalElementos());
    }

}
