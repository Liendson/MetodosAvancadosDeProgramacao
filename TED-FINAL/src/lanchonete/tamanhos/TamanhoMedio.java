package lanchonete.tamanhos;

import lanchonete.tipos.ImplementacaoRefrigerante;

public class TamanhoMedio extends AbstracaoTamanho {

    public TamanhoMedio(ImplementacaoRefrigerante refrigerante) {
        super(refrigerante);
    }
    public void beber() {
        System.out.println("Toma um gole de " + refrigerante.mostrarTipo());
        System.out.println("Toma um gole de " + refrigerante.mostrarTipo());
        System.out.println("Acabou o(a) " + refrigerante.mostrarTipo());
    }

}
