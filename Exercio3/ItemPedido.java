package Exercio3;

public class ItemPedido {
    private String descricao;
    private Double valorUnitario;
    private Integer qtd;

    ItemPedido(String descricao, Integer qtd, Double valorUnitario) {
        this.descricao = descricao;
        this.qtd = qtd;
        this.valorUnitario = valorUnitario;
    }
    public Double calcularSubtotal() {
        return valorUnitario * qtd;
    }

    @Override
    public String toString() {
        return this.qtd + "x " + this.descricao +
                String.format(" R$%.2f = R$%.2f\n", this.valorUnitario, calcularSubtotal());
    }
}
