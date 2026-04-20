package Exercio3;

public class Cliente {
    private String nomeCliente;
    private Pedido pedidoAtual;

    Cliente(String nomeCliente, Pedido pedidoAtual) {
        this.nomeCliente = nomeCliente;
        this.pedidoAtual = pedidoAtual;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public Pedido getPedidoAtual() {
        return pedidoAtual;
    }
}
