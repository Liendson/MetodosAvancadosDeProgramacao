package builder;

import model.Arquivo;

public interface ArquivoBuilder {

    void construirArquivo(String nome);
    Arquivo getArquivo();
    Arquivo clonar();
}
