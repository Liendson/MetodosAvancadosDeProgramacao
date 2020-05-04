package model;

import builder.ArquivoBuilder;

public abstract class Arquivo implements ArquivoBuilder {

    String nome;
    String path;
    String conteudo;
    Boolean autorizacaoCopia;
    Boolean autorizacaoImprimir;

    public Arquivo() {}

    protected Arquivo(Arquivo arquivoPrototype) {
        this.nome = arquivoPrototype.getNome();
        this.path = arquivoPrototype.getPath();
        this.conteudo = arquivoPrototype.lerConteudo();
        this.autorizacaoCopia = arquivoPrototype.getAutorizacaoCopia();
        this.autorizacaoImprimir = arquivoPrototype.getAutorizacaoImprimir();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getAutorizacaoCopia() {
        return autorizacaoCopia;
    }

    public void setAutorizacaoCopia(Boolean autorizacaoCopia) {
        this.autorizacaoCopia = autorizacaoCopia;
    }

    public Boolean getAutorizacaoImprimir() {
        return autorizacaoImprimir;
    }

    public void setAutorizacaoImprimir(Boolean autorizacaoImprimir) {
        this.autorizacaoImprimir = autorizacaoImprimir;
    }

    public void escreverConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String lerConteudo() {
        return this.conteudo;
    }

    @Override
    public String toString() {
        return "Arquivo{" +
                "nome='" + nome + '\'' +
                ", path='" + path + '\'' +
                ", conteudo='" + conteudo + '\'' +
                ", autorizacaoCopia=" + autorizacaoCopia +
                ", autorizacaoImprimir=" + autorizacaoImprimir +
                '}';
    }
}
