package diretorios.model;

import java.util.List;

public class Pasta {

    String nome;
    Pasta subpasta;
    List<Arquivo> arquivos;

    public Pasta () {}

    public Pasta (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pasta getSubpasta() {
        return subpasta;
    }

    public void setSubpasta(Pasta subpasta) {
        this.subpasta = subpasta;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

}
