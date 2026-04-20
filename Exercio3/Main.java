package Exercio3;

public class Main {
    public static void main(String[] args) {

        ItemPedido produto1 = new ItemPedido("Macarrão", 3, 12.50);
        ItemPedido produto2 = new ItemPedido("Whey Protein", 5, 45.00);
        ItemPedido produto3 = new ItemPedido("Sorvete de amendoim", 4, 18.90);
        ItemPedido produto4 = new ItemPedido("Bolacha Recheada", 3, 5.50);
        ItemPedido produto5 = new ItemPedido("Refrigerante de Guarana", 2, 8.99);

        Pedido pedido1 = new Pedido();
        pedido1.inserirItem(produto1);
        pedido1.inserirItem(produto2);
        pedido1.inserirItem(produto3);
        pedido1.inserirItem(produto4);

        Cliente cliente1 = new Cliente("Pedro", pedido1);
        System.out.println("Cliente: " + cliente1.getNomeCliente());
        cliente1.getPedidoAtual().fecharPedido();

        Pedido pedido2 = new Pedido();
        pedido2.inserirItem(produto4);
        pedido2.inserirItem(produto5);

        Cliente cliente2 = new Cliente("Quesia", pedido2);
        System.out.println("Cliente: " + cliente2.getNomeCliente());
        cliente2.getPedidoAtual().fecharPedido();
    }
}