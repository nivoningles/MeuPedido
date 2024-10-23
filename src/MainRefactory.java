public class MainRefactory {

    public static void main(String[] args) {

        Pedido novoPedido = new Pedido();
        novoPedido.criarPedidos();

        System.out.println(novoPedido.valor);

        novoPedido.adicionarItem(1, 10, 2);
        novoPedido.adicionarItem(2, 5, 2);
        novoPedido.adicionarItem(3, 20, 2);
        System.out.println("Total pedido: " + novoPedido.valor);
    }

}
