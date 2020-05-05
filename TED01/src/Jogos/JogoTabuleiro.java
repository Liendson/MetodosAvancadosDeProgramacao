package Jogos;

import java.util.ArrayList;

public class JogoTabuleiro extends Jogo {

    String estiloJogo;
    ArrayList<String> aderecoJogo;

    public String getEstiloJogo() {
        return estiloJogo;
    }

    public void setEstiloJogo(String estiloJogo) {
        this.estiloJogo = estiloJogo;
    }

    public ArrayList<String> getAderecoJogo() {
        return aderecoJogo;
    }

    public void setAderecoJogo(ArrayList<String> aderecoJogo) {
        this.aderecoJogo = aderecoJogo;
    }

    @Override
    public float calcularTotal() {
        return 0;
    }
}
