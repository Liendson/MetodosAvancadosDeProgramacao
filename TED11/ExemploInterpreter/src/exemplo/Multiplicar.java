package exemplo;

public class Multiplicar implements Operador{

    private final Operador esquerda;
    private final Operador direita;

    public Multiplicar(Operador esquerda, Operador direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return this.esquerda.interpretar() * this.direita.interpretar();
    }

}
