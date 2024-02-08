package cuentacorriente1;

public class CuentaCorriente {

    private int saldo;

    public CuentaCorriente() {
        saldo = 0;
    }

    public int saldo() {
        return saldo;
    }

    public void imposicion(int x) {
        saldo += x;
        System.out.println("Imposición de " + x + " realizada. Saldo actual: " + saldo);
    }

    public void reintegro(int x) {
        saldo -= x;
        System.out.println("Reintegro de " + x + " realizado. Saldo actual: " + saldo);
    }

    public static void main(String[] args) {

        CuentaCorriente cc = new CuentaCorriente();
        cc.imposicion(200);
        cc.reintegro(300);
        System.out.println("Saldo final: " + cc.saldo());
    }
}
