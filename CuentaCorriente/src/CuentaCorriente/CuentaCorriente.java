package CuentaCorriente;

public class CuentaCorriente {

    private String saldo;

    public CuentaCorriente() {
        saldo = "0";
    }

    public String saldo() {
        return saldo;
    }

    public void imposicion(int x) {

        int saldoNumerico = Integer.parseInt(saldo);
        saldoNumerico += x;
        saldo = Integer.toString(saldoNumerico);

        System.out.println("Imposición de € " + x + " realizada correctamente. Saldo actual: € " + saldo);
    }

    public void reintegro(int x) {
        int saldoNumerico = Integer.parseInt(saldo);

        saldoNumerico -= x;
        saldo = Integer.toString(saldoNumerico);

        System.out.println("Reintegro de € " + x + " realizado correctamente. Saldo actual: € " + saldo);
    }

    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente();

        System.out.println(cuenta.toString());

        cuenta.imposicion(100);

        cuenta.reintegro(150);
    }
}
