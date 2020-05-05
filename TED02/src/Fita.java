import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fita {
	
    private String titulo;
    private Tipo codigoDePreco;
    private Collection<Aluguel> fitasAlugadas = new ArrayList<Aluguel>();

    public Fita(String titulo, Tipo codigoDePreco) {
        this.titulo = titulo;
        this.codigoDePreco = codigoDePreco;
    }

    public String getTitulo() {
        return titulo;
    }

    public Tipo getCodigoDePreco() {
        return codigoDePreco;
    }

    public void setCodigoDePreco(Tipo codigoDePreco) {
        this.codigoDePreco = codigoDePreco;
    }

    public StringBuilder extrato() {

        final String fimDeLinha = System.getProperty("line.separator");
        AtomicReference<Double> valorTotal = new AtomicReference<>(0.0);
        AtomicInteger pontosDeAlugadorFrequente = new AtomicInteger();
        StringBuilder resultado = new StringBuilder("Registro de Alugueis :").append(fimDeLinha);

        fitasAlugadas.forEach(fita -> {

            double valorCorrente = 0.0;

            switch (fita.getFita().getCodigoDePreco()) {
                case normal:
                    valorCorrente += 2;
                    if (fita.getDiasAlugada() > 2) {
                        valorCorrente += (fita.getDiasAlugada() - 2) * 1.5;
                    }
                    break;
                case lancamento:
                    valorCorrente += fita.getDiasAlugada() * 3;
                    break;
                case infantil:
                    valorCorrente += 1.5;
                    if (fita.getDiasAlugada() > 3) {
                        valorCorrente += (fita.getDiasAlugada() - 3) * 1.5;
                    }
                    break;
            }
            pontosDeAlugadorFrequente.getAndIncrement();
            if (fita.getFita().getCodigoDePreco().equals(Tipo.lancamento) && fita.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente.getAndIncrement();
            }

            resultado
                    .append("\t")
                    .append(fita.getFita().getTitulo())
                    .append("\t")
                    .append(valorCorrente)
                    .append(fimDeLinha);
            double finalValorCorrente = valorCorrente;
            valorTotal.updateAndGet(valor -> valor + finalValorCorrente);

        });

        return resultado
                .append("Valor total devido: ")
                .append(valorTotal.get())
                .append(fimDeLinha)
                .append("Voce acumulou ")
                .append(pontosDeAlugadorFrequente.get())
                .append(" pontos de alugador frequente");
    }
}