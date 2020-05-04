package builder;

import model.Arquivo;

public class ArquivoCSVBuilder extends Arquivo {

    public ArquivoCSVBuilder() {
        super();
    }

    protected ArquivoCSVBuilder(Arquivo arquivoPrototype) {
        super(arquivoPrototype);
    }

    @Override
    public void construirArquivo(String nome) {
        this.setNome(nome);
        this.setAutorizacaoCopia(false);
        this.setAutorizacaoImprimir(false);
        this.setPath("csv");
    }

    @Override
    public Arquivo getArquivo() {
        return this;
    }

    @Override
    public Arquivo clonar() {
        return new ArquivoCSVBuilder(this);
    }
}
