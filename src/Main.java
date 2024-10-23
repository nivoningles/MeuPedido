import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pedido novoPedido = new Pedido();
        novoPedido.numeroPedido = 1;
        novoPedido.codigoCliente = 1;
        novoPedido.valor = 0;
        novoPedido.itensPedido = new ArrayList<>();

        ItemPedido item = new ItemPedido();
        item.codigoItem = 1;
        item.sequenciaItem = 1;
        item.quantidade = 10;
        item.valor = 50;

        ItemPedido novoItem = new ItemPedido();
        novoItem.sequenciaItem = 2;
        novoItem.codigoItem = 2;
        novoItem.quantidade = 50;
        novoItem.valor = 5;

        //Vincula o item criado com o item pedido
        novoPedido.itensPedido.add(item);
        novoPedido.itensPedido.add(novoItem);

    }
}