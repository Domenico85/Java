package Ejercicios3ex7i8;

public class Corredor {

    private int energia;

    public Corredor(int energia) {
        this.energia = energia;
    }

    public void recargarEnergia(int energia) {
        //conviene comprobar positivo
        this.energia += energia;
    }

    public void correr() throws AgotadoException {
        System.out.println("a correr... Tengo:  " + this.energia);
        if (this.energia >= 10) {
            this.energia -= 10;

        } else {
            AgotadoException cansado = new AgotadoException("-> Agotado");
            System.out.println(cansado.getMessage());
            throw cansado;
        }
    }
}
