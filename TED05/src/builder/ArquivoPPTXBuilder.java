package builder;

import model.Arquivo;

public class ArquivoPPTXBuilder extends Arquivo {

    public ArquivoPPTXBuilder() {
        super();
    }

    protected ArquivoPPTXBuilder(Arquivo arquivoPrototype) {
        super(arquivoPrototype);
    }

    @Override
    public void construirArquivo(String nome) {
        this.setNome(nome);
        this.setAutorizacaoCopia(true);
        this.setAutorizacaoImprimir(false);
        this.setPath("pptx");
    }

    @Override
    public Arquivo getArquivo() {
        return this;
    }

    @Override
    public Arquivo clonar() {
        return new ArquivoPPTXBuilder(this);
    }
}
