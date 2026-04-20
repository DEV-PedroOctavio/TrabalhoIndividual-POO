package Exercicio4;
final class CarroPasseio extends Veiculo {
    CarroPasseio(String placa, String fabricante, Double diaria, Integer anoDeProducao, Double tabelaFipe) {
        super(placa, fabricante, diaria, anoDeProducao, tabelaFipe);
    }

    public Double alugarVeiculo(Double cargaTransportada, Integer diasAluguel) {
        if (diasAluguel <= 0) {
            throw new IllegalArgumentException("Número de dias deve ser positivo");
        }

        return diaria * diasAluguel;
    }

    public Double calcularIpva() {
        if (getAnoAtual() - anoDeProducao > 20) {
            return 0.0;
        }

        return tabelaFipe * 0.04;
    }
}
