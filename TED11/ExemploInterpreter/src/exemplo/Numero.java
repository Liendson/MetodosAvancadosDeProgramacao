package exemplo;

public class Numero implements Operador {

    private final int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int interpretar() {
        return this.numero;
    }

}
