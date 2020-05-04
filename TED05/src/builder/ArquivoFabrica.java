package builder;

import model.Arquivo;

public class ArquivoFabrica {

    private final ArquivoBuilder arquivoBuilder;

    public ArquivoFabrica(ArquivoBuilder arquivoBuilder) {
        this.arquivoBuilder = arquivoBuilder;
    }

    public void criarArquivo(String nome) {
        this.arquivoBuilder.construirArquivo(nome);
    }

    public Arquivo getArquivo() {
        return this.arquivoBuilder.getArquivo();
    }

}
