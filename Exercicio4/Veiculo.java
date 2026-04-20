package Exercicio4;
import java.time.LocalDate;

public sealed abstract class Veiculo implements Tributavel, Fretavel permits CarroPasseio, Caminhao {
    protected Double tabelaFipe;
    protected final Integer anoDeProducao;
    protected Double diaria;
    protected final String fabricante;
    protected final String placa;

    Veiculo(String placa, String fabricante, Double diaria, Integer anoDeProducao, Double tabelaFipe) {
        if (fabricante.length() <= 0) {
            throw new NullPointerException("Fabricante não pode estar vazio");
        }
        if (tabelaFipe <= 0) {
            throw new IllegalArgumentException("Preço FIPE deve ser positivo");
        }
        if (placa.length() <= 0) {
            throw new NullPointerException("Placa não pode estar vazia");
        }
        if (anoDeProducao > getAnoAtual()) {
            throw new IllegalArgumentException("Ano de fabricação não pode ser superior ao ano atual");
        }
        if (diaria <= 0) {
            throw new IllegalArgumentException("Valor da diária deve ser positivo");
        }

        this.tabelaFipe = tabelaFipe;
        this.anoDeProducao = anoDeProducao;
        this.diaria = diaria;
        this.fabricante = fabricante;
        this.placa = placa;
    }

    public Integer getAnoAtual() {
        return LocalDate.now().getYear();
    }
}
