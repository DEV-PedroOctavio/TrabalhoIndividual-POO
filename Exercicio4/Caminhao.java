package Exercicio4;
final class Caminhao extends Veiculo {
    private final Double limiteCargaToneladas;

    Caminhao(String placa, String fabricante, Double diaria, Integer anoDeProducao, Double tabelaFipe, Double limiteCargaToneladas) {
        super(placa, fabricante, diaria, anoDeProducao, tabelaFipe);

        if (limiteCargaToneladas <= 0) {
            throw new IllegalArgumentException("Capacidade de carga deve ser positiva");
        }

        this.limiteCargaToneladas = limiteCargaToneladas;
    }

    public Double calcularIpva() {
        if (getAnoAtual() - anoDeProducao > 20) {
            return 0.0;
        }

        return tabelaFipe * 0.015;
    }

    public Double alugarVeiculo(Double cargaTransportada, Integer diasAluguel) {
        if (diasAluguel <= 0) {
            throw new IllegalArgumentException("Número de dias deve ser positivo");
        }
        if (cargaTransportada <= 0) {
            throw new IllegalArgumentException("Peso da carga deve ser positivo");
        }

        if (cargaTransportada > limiteCargaToneladas) {
            diaria *= 1.10;
        }

        return diaria * diasAluguel;
    }
}
