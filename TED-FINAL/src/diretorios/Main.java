package diretorios;

import diretorios.model.Arquivo;
import diretorios.model.Pasta;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Arquivo> listaArquivos = new ArrayList<>();

        Arquivo exeJava6 = new Arquivo("Java6", "200KB");
        Arquivo exeJava7 = new Arquivo("Java7", "210KB");
        Arquivo exeJava8 = new Arquivo("Java8", "220KB");
        Arquivo exeJava9 = new Arquivo("Java9", "230KB");

        listaArquivos.add(exeJava6);
        listaArquivos.add(exeJava7);
        listaArquivos.add(exeJava8);
        listaArquivos.add(exeJava9);

        Pasta pasta = new Pasta("Arquivos de Programa");

        pasta.setSubpasta(new Pasta("Java"));
        pasta.setArquivos(listaArquivos);
        pasta.getSubpasta().setSubpasta(new Pasta("jdk1.8.0_251"));

        System.out.print(pasta.getArquivos());
        System.out.print(pasta.getSubpasta());

    }
}
