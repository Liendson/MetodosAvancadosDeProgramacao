package builder;

import model.Arquivo;

public class EditorDeTXTBuilder implements EditorBuilder {

    Arquivo arquivoAberto = null;

    @Override
    public void construirEditor(Arquivo arquivo) {
        this.abrirArquivo(arquivo);
    }

    @Override
    public void editarArquivo(String conteudo) {
        this.arquivoAberto.escreverConteudo(conteudo);
    }

    @Override
    public Arquivo abrirArquivo(Arquivo arquivo) {
        if (this.arquivoAberto == null && arquivo.getPath().equals("txt")) {
            Arquivo arquivoParaAbrir = new ArquivoTXTBuilder();
            arquivoParaAbrir.setNome(arquivo.getNome());
            arquivoParaAbrir.setPath(arquivo.getPath());
            arquivoParaAbrir.setAutorizacaoCopia(arquivo.getAutorizacaoCopia());
            arquivoParaAbrir.setAutorizacaoImprimir(arquivo.getAutorizacaoImprimir());
            arquivoParaAbrir.escreverConteudo(arquivo.lerConteudo());
            return this.arquivoAberto = arquivoParaAbrir;
        }
        System.out.println("Arquivo ".concat(this.arquivoAberto.getNome()).concat(" Aberto com sucesso!"));
        System.out.println("Conteudo: ".concat(this.arquivoAberto.lerConteudo()));
        return this.arquivoAberto;
    }

    @Override
    public void fecharArquivo() {
        System.out.println("Arquivo ".concat(this.arquivoAberto.getNome()).concat(" fechado com sucesso!"));
        this.arquivoAberto = null;
    }

    @Override
    public void copiarArquivo() {
        if (this.arquivoAberto.getAutorizacaoCopia()) {
            Arquivo arquivoClone = this.arquivoAberto.clonar();
        } else {
            System.out.println("Este Arquivo não possui autorização para cópia!");
        }
    }

    @Override
    public void imprimirArquivo() {
        if (this.arquivoAberto.getAutorizacaoImprimir()) {
            System.out.println(this.arquivoAberto.toString());
        } else {
            System.out.println("Este Arquivo não possui autorização para Impressão!");
        }
    }
}
