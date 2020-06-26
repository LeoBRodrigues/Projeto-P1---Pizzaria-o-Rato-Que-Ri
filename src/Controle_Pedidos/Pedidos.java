package Controle_Pedidos;

import Enum.*;

import java.util.UUID;

public class Pedidos {

    private EstadoPedido estadoPedido;
    private PagamentoPedido pagamentoPedido;
    private String ID, preco, descricao_pedido;

    public Pedidos(String descricao_pedido, String preco, int op_pagamento)
    {
        this.estadoPedido = EstadoPedido.REALIZADO;
        this.ID = IdPedidos();
        this.pagamentoPedido = PagamentoPedido.values()[op_pagamento - 1];
        this.descricao_pedido = descricao_pedido;
        this.preco = preco;
    }


    @Override
    public String IdPedidos(){

        return UUID.randomUUID().toString().replaceAll("[^0-9]", "");

    }


}
