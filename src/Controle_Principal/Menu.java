package Controle_Principal;

import Controle_Pedidos.Pedidos;

public class Menu {


    /**
     * Menu de opções para o programa principal.
     */

    public void menuPrincipal(){

        System.out.println("------------------------------------");
        System.out.println("-----------Menu Principal-----------");
        System.out.println("------------------------------------");
        System.out.println("1. Cadastrar Pedido");
        System.out.println("2. Alterar Pedido");
        System.out.println("3. Consultar Pedidos");
        System.out.println("4. Sair do Sistema");
        System.out.println("------------------------------------");
        System.out.println("---------Selecione Sua Opção--------");
        System.out.println("------------------------------------");
    }


    /**
     * Menu de opções de pagamentos.
     */

    public void menuPagamentos(){

        System.out.println("------------------------------------");
        System.out.println("---------Forma de Pagamento---------");
        System.out.println("------------------------------------");
        System.out.println("1. Dinheiro");
        System.out.println("2. Cartão de Débito");
        System.out.println("3. Cartão de Crédito");
        System.out.println("4. Vale Alimentação");
        System.out.println("5. Vale Refeição");
        System.out.println("------------------------------------");
        System.out.println("---------Selecione Sua Opção--------");
        System.out.println("------------------------------------");

    }


    /**
     * Imprime toda as informações de um pedido.
     * @param pedidos (Instância do pedido a ser imprimido)
     */

    public void infoPedidos(Pedidos pedidos){

        System.out.println("ID: " + pedidos.getID());
        System.out.println("Descrição: " + pedidos.getDescricao_pedido());
        System.out.println("Forma de Pagamento: " + pedidos.getTipoPagamento());
        System.out.println("Total: R$ " + pedidos.getPreco());
        System.out.println("Status: " + pedidos.getEstadoPedido());
    }

    /**
     * Menu de estados dos pedidos.
     */

    public void menuEstadoPedido(){

        System.out.println("------------------------------------");
        System.out.println("----------Estado do Pedido----------");
        System.out.println("------------------------------------");
        System.out.println("1. Realizado");
        System.out.println("2. Em Preparação");
        System.out.println("3. Enviado Para Entrega");
        System.out.println("4. Entregue");
        System.out.println("5. Devolvido");
        System.out.println("------------------------------------");
        System.out.println("---------Selecione Sua Opção--------");
        System.out.println("------------------------------------");

    }

    /**
     * Mensagem de boas vindas do Login
     *
     */
    public void boasVindas(){
        System.out.println("------------------------------------");
        System.out.println("------Bem Vindo ao Rato Que Ri------");
        System.out.println("------------------------------------");
        System.out.println("    ORQR       _..----.._    _");
        System.out.println("            .'  .--.    \"-.(0)_");
        System.out.println("'-.__.-'\"'=:|   ,  _)_ \\__ . c\\'-..");
        System.out.println("             '''------'---''---'-\"");
        System.out.println("------------------------------------");
        System.out.println("------A Melhor Pizza Do Mundo!------");
        System.out.println("------------------------------------");


    }

    /**
     * Mensagem para Logout.
     */

    public void despedida(){
        System.out.println("------------------------------------");
        System.out.println("----------Até a Próxima!!!----------");
        System.out.println("------------------------------------");
    }


}
