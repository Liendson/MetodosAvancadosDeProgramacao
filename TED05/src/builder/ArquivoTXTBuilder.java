package builder;

import model.Arquivo;

public class ArquivoTXTBuilder extends Arquivo {

    public ArquivoTXTBuilder() {
        super();
    }

    protected ArquivoTXTBuilder(Arquivo arquivoPrototype) {
        super(arquivoPrototype);
    }

    @Override
    public void construirArquivo(String nome) {
        this.setNome(nome);
        this.setAutorizacaoCopia(true);
        this.setAutorizacaoImprimir(true);
        this.setPath("txt");
    }

    @Override
    public Arquivo getArquivo() {
        return this;
    }

    @Override
    public Arquivo clonar() {
        return new ArquivoTXTBuilder(this);
    }
}
