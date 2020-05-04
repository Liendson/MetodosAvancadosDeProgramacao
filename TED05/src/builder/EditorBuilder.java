package builder;

import model.Arquivo;

public interface EditorBuilder {

    void construirEditor(Arquivo arquivo);
    void editarArquivo(String conteudo);
    Arquivo abrirArquivo(Arquivo arquivo);
    void fecharArquivo();
    void copiarArquivo();
    void imprimirArquivo();

}
