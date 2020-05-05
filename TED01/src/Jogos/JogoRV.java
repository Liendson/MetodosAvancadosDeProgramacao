package Jogos;

public class JogoRV extends JogoDigital {

    String tipoCapacete;
    String marcadorJogo;

    public String getTipoCapacete() {
        return tipoCapacete;
    }

    public void setTipoCapacete(String tipoCapacete) {
        this.tipoCapacete = tipoCapacete;
    }

    public String getMarcadorJogo() {
        return marcadorJogo;
    }

    public void setMarcadorJogo(String marcadorJogo) {
        this.marcadorJogo = marcadorJogo;
    }

    public float calcularTotal() {
        return 0;
    }
}
