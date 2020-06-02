package diretorios.model;

public class Arquivo {

    String nome;
    String tamanho;

    public Arquivo(String nome, String tamanho) {

        this.nome = nome;
        this.tamanho = tamanho;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
