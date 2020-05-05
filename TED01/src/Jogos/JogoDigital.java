package Jogos;

public class JogoDigital extends Jogo {

    int anoCriacao;
    String produtoraJogo;

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getProdutoraJogo() {
        return produtoraJogo;
    }

    public void setProdutoraJogo(String produtoraJogo) {
        this.produtoraJogo = produtoraJogo;
    }

    @Override
    public float calcularTotal() {
        return 0;
    }
}
