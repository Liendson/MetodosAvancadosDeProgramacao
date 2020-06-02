package lanchonete;

import lanchonete.tamanhos.*;
import lanchonete.tipos.*;
public class Main {

    public static void main(String[] args) {

        TamanhoGrande cocaColaGrande = new TamanhoGrande(new CocaCola());
        cocaColaGrande.beber();
        TamanhoMedio cocaColaMedia = new TamanhoMedio(new CocaCola());
        cocaColaMedia.beber();
        TamanhoPequeno cocaColaPequena = new TamanhoPequeno(new CocaCola());
        cocaColaPequena.beber();

        TamanhoGrande fantaGrande = new TamanhoGrande(new Fanta());
        fantaGrande.beber();
        TamanhoMedio fantaMedia = new TamanhoMedio(new Fanta());
        fantaMedia.beber();
        TamanhoPequeno fantaPequena = new TamanhoPequeno(new Fanta());
        fantaPequena.beber();

        TamanhoGrande guaranaGrande = new TamanhoGrande(new Guarana());
        guaranaGrande.beber();
        TamanhoMedio guaranaMedia = new TamanhoMedio(new Guarana());
        guaranaMedia.beber();
        TamanhoPequeno guaranaPequena = new TamanhoPequeno(new Guarana());
        guaranaPequena.beber();

    }

}
