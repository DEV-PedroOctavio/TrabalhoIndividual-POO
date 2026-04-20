package Exercicio3;

import java.util.ArrayList;

public class Pedido {
    private ArrayList<ItemPedido> listaItens = new ArrayList<>();
    private Double valorTotal = 0.0;

    public void inserirItem(ItemPedido item) {
        listaItens.add(item);
    }

    private void somarTotal() {
        for (int i = 0; i < listaItens.size(); i++) {
            valorTotal += listaItens.get(i).calcularSubtotal();
        }
    }

    private String gerarRecibo(Double frete) {
        StringBuilder recibo = new StringBuilder();

        recibo.append("********************************************\n");
        for (int i = 0; i < listaItens.size(); i++) {
            recibo.append(listaItens.get(i).toString());
        }

        if (frete > 0) {
            recibo.append(String.format("Frete: R$%.2f\n", frete));
            valorTotal += frete;
        }

        recibo.append(String.format("\nTotal: R$%.2f\n", valorTotal));
        recibo.append("********************************************\n\n");
        return recibo.toString();
    }

    public void fecharPedido() {
        somarTotal();
        if (valorTotal > 250) {
            System.out.println("Parabéns! Você ganhou frete grátis!");
            System.out.print(gerarRecibo(0.0));
        } else {
            System.out.println("Frete: R$ 25,00. Recibo detalhado:");
            System.out.printf("%s", gerarRecibo(25.0));
        }
    }
}
