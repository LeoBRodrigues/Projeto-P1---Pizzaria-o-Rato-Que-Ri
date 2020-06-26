package Controle_Principal;

import Controle_Pedidos.Pedidos;

public class Menu {


    public void menu_principal(){

        System.out.println("------------------------------------");
        System.out.println("-----------Menu Principal-----------");
        System.out.println("------------------------------------");
        System.out.println("1. Cadastrar Pedido");
        System.out.println("2. Alterar Pedido");
        System.out.println("3. Consultar Pedidos");
        System.out.println("4. Sair do Sistema");
        System.out.println("------------------------------------");
        System.out.println("Selecione sua opção: ");
        System.out.println("------------------------------------");
    }

    public void menu_pagamentos(){

        System.out.println("------------------------------------");
        System.out.println("---Selecione a Forma de Pagamento---");
        System.out.println("------------------------------------");
        System.out.println("1. Dinheiro");
        System.out.println("2. Cartão de Débito");
        System.out.println("3. Cartão de Crédito");
        System.out.println("4. Vale Alimentação");
        System.out.println("5. Vale Refeição");
        System.out.println("------------------------------------");
        System.out.println("Selecione sua opção: ");
        System.out.println("------------------------------------");

    }

    public void info_pagamentos(Pedidos pedidos){

        System.out.println("ID: " + pedidos.getID());
        System.out.println("Descrição: " + pedidos.getDescricao_pedido());
        System.out.println("Forma de Pagamento: " + pedidos.getTipoPagamento());
        System.out.println("Total: R$ " + pedidos.getPreco());
        System.out.println("Status: " + pedidos.getStatus());
    }
}
