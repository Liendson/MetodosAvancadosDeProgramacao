import Entidades.Cliente;
import Jogos.Jogo;
import Jogos.JogoTabuleiro;
import Modelo.Compra;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Compra compra = new Compra();
        Cliente cliente = new Cliente();
        ArrayList<Jogo> jogos = new ArrayList<Jogo>();

        JogoTabuleiro jogoTabuleiro = new JogoTabuleiro();
        jogoTabuleiro.setPrecoAluguelJogo(20);

        jogos.add(jogoTabuleiro);

        compra.setClienteCompra(cliente);
        compra.setJogosCompra(jogos);
        compra.setTempoCompra(2);

        compra.calcularCompra();

    }

}
