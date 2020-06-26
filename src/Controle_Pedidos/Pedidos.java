package Controle_Pedidos;

import Enum.*;

import java.util.UUID;

public class Pedidos implements IdPedidos{

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


    // Getters

    public String getID() {
        return ID;
    }

    public String getDescricao_pedido() {
        return descricao_pedido;
    }

    public PagamentoPedido getTipoPagamento() {
        return pagamentoPedido;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public String getPreco() {
        return preco;
    }

    //Setter

    public void setEstadoPedido(int opcao_status){ this.estadoPedido = estadoPedido.values()[opcao_status - 1]; }
}