package Controle_Pedidos;

import Enum.*;

import java.util.UUID;

public class Pedidos implements IdPedidos{

    private EstadoPedido estadoPedido;
    private PagamentoPedido pagamentoPedido;
    private String ID, preco, descricao_pedido;

    /**
     * Construtor da classe pedidos.
     * @param descricao_pedido (Descrição do pedido realizado pelo cliente)
     * @param preco (Custo do pedido)
     * @param op_pagamento (Recebe opção númerica do menu de compra para o tipo de pagamento)
     */

    public Pedidos(String descricao_pedido, String preco, int op_pagamento)
    {
        this.estadoPedido = EstadoPedido.REALIZADO;
        this.ID = IdPedidos();
        this.pagamentoPedido = PagamentoPedido.values()[op_pagamento - 1];
        this.descricao_pedido = descricao_pedido;
        this.preco = preco;
    }


    /**
     * Função para gerar um ID único para cada pedido. A partir de um UUID, utiliza apenas
     * seus valores númericos, diminuindo a chance de colisões entre IDs quando
     * utiza-se apenas o Random().
     * @return (String com os números gerados)
     */

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