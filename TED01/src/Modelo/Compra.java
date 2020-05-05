package Modelo;

import Entidades.Cliente;
import Jogos.Jogo;

import java.util.ArrayList;

public class Compra {

    int tempoCompra;
    Cliente clienteCompra;
    ArrayList<Jogo> jogosCompra;

    public int getTempoCompra() {
        return tempoCompra;
    }

    public void setTempoCompra(int tempoCompra) {
        this.tempoCompra = tempoCompra;
    }

    public Cliente getClienteCompra() {
        return clienteCompra;
    }

    public void setClienteCompra(Cliente clienteCompra) {
        this.clienteCompra = clienteCompra;
    }

    public ArrayList<Jogo> getJogosCompra() {
        return jogosCompra;
    }

    public void setJogosCompra(ArrayList<Jogo> jogosCompra) {
        this.jogosCompra = jogosCompra;
    }

    public float calcularCompra() {
        return 0;
    }

}
