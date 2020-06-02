package lanchonete.tamanhos;

import lanchonete.tipos.ImplementacaoRefrigerante;

public abstract class AbstracaoTamanho {

    protected ImplementacaoRefrigerante refrigerante;

    public AbstracaoTamanho(ImplementacaoRefrigerante refrigerante){
        this.refrigerante = refrigerante;
    }

    public abstract void beber();

}
