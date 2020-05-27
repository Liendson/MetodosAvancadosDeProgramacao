package exemplo;

public class Subtrair implements Operador{

    private final Operador esquerda;
    private final Operador direita;

    public Subtrair(Operador esquerda, Operador direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return this.esquerda.interpretar() - this.direita.interpretar();
    }

}
