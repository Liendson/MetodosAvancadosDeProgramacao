package Jogos;

public abstract class Jogo {

    int idJogo;
    String nomeJogo;
    int quantidadeJogos;
    float precoAluguelJogo;
    int quantidadePessoas;

    public int getIdJogo() {
        return idJogo;
    }

    public void setIdJogo(int idJogo) {
        this.idJogo = idJogo;
    }

    public String getNomeJogo() {
        return nomeJogo;
    }

    public void setNomeJogo(String nomeJogo) {
        this.nomeJogo = nomeJogo;
    }

    public int getQuantidadeJogos() {
        return quantidadeJogos;
    }

    public void setQuantidadeJogos(int quantidadeJogos) {
        this.quantidadeJogos = quantidadeJogos;
    }

    public float getPrecoAluguelJogo() {
        return precoAluguelJogo;
    }

    public void setPrecoAluguelJogo(float precoAluguelJogo) {
        this.precoAluguelJogo = precoAluguelJogo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public void setQuantidadePessoas(int quantidadePessoas) {
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public String toString() {
        return "Jogos.Jogo{" +
                "idJogo=" + idJogo +
                ", nomeJogo='" + nomeJogo + '\'' +
                ", quantidadeJogos=" + quantidadeJogos +
                ", precoAluguelJogo=" + precoAluguelJogo +
                ", quantidadePessoas=" + quantidadePessoas +
                '}';
    }

    public abstract float calcularTotal();
}
