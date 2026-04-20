package Exercicio4;
public class Main {
    public static void main(String[] args) {
        try {
            Caminhao caminhao1 = new Caminhao("MNT7B92", "Scania", 350.00, 1998, 320000.0, 15.0);
            CarroPasseio carro1 = new CarroPasseio("PRO4K81", "Toyota", 120.00, 2018, 75000.0);

            System.out.println("*****Veículo de Pedro Octávio*****");
            System.out.println("IPVA do caminhão: R$" + caminhao1.calcularIpva());
            System.out.println("Custo para alugar o caminhão por 5 dias: R$" + caminhao1.alugarVeiculo(20.0, 5));

            System.out.println(" === Veículo da empresa ===");
            System.out.println("IPVA do carro: R$" + carro1.calcularIpva());
            System.out.println("Custo para alugar o carro por 3 dias: R$" + carro1.alugarVeiculo(0.0, 3));

        } catch (IllegalArgumentException e) {
            System.out.println("Parâmetro inválido: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Erro nos dados do veículo: " + e.getMessage());
        }
    }
}
