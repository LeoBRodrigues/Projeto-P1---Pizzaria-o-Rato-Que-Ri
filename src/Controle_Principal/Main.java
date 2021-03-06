package Controle_Principal;

import Controle_Funcionarios.Funcionario;
import Controle_Pedidos.Pedidos;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        // Variáveis e estruturas do Programa


        String nome, email, senha, descricao_pedido, preco_pedido;
        int opcao_menu, opcao_pagamento;

        Scanner scanner = new Scanner(System.in); // Armazena entrada do usuario
        ArrayList<Pedidos> listaPedidos = new ArrayList<>(); // Armazena os Pedidos
        // Armazena Funcionarios. Não implementado no momento, porém permite multiplos usuarios em versões futuras.
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        Menu menu = new Menu(); // Menus a serem utilizados no programa


        //Funcionario para Teste, adicionado à lista de funcionarios.

        senha = "123456";
        nome = "Murilo Zanini";
        email = "zanini@ORQR.com";

        Funcionario funcionario1 = new Funcionario(nome, email, senha);
        listaFuncionarios.add(funcionario1);

        // Loop do Login

        while(true) {

            menu.boasVindas();

            System.out.println("Bem-vindo(a) " + listaFuncionarios.get(0).getNome() + ". Por favor, digite sua senha:");

            // Verifica se a senha está correta. Prossegue para o programa de qualquer forma.
            // Primeiramente gera o hash da senha e compara com o hash armazenado.

            listaFuncionarios.get(0).loginSistema(scanner.nextLine());

            if(!listaFuncionarios.get(0).getAcessoSistema())
            {
                System.out.println("Atenção! Senha inválida.");
                System.out.println("Algumas opção não poderão ser acessadas. Deseja prosseguir mesmo assim?");
                System.out.println("1. Sim\n2. Não");
                opcao_menu = Integer.parseInt(scanner.nextLine());

                if(opcao_menu != 1) continue;
            }

            // Loop do Menu

            do {

                menu.menuPrincipal();
                opcao_menu = Integer.parseInt(scanner.nextLine());

                switch (opcao_menu) {
                    case 1:

                        // verifica acesso
                        if(!funcionario1.getAcessoSistema())
                        {
                            System.out.println("Senha Inválida! Entre novamente.");
                            break;
                        }

                        System.out.println("Descrição do pedido: ");
                        descricao_pedido = scanner.nextLine();
                        System.out.println("Preço total do pedido: ");
                        preco_pedido = scanner.nextLine();

                        menu.menuPagamentos();
                        opcao_pagamento = Integer.parseInt(scanner.nextLine());

                        Pedidos novoPedido = new Pedidos(descricao_pedido, preco_pedido, opcao_pagamento);

                        listaPedidos.add(novoPedido);

                        System.out.println("Pedido realizado com sucesso.");

                        break;

                    case 2:

                        //verifica acesso
                        if(!listaFuncionarios.get(0).getAcessoSistema())
                        {
                            System.out.println("Senha Inválida! Entre novamente.");
                            break;
                        }


                        System.out.println("Digite o ID do pedido a ser alterado: ");

                        int test = menu.encontraID(scanner.nextLine(), listaPedidos);

                        if(test != 0)
                        {
                            menu.menuEstadoPedido();
                            listaPedidos.get(test).setEstadoPedido(Integer.parseInt(scanner.nextLine()));
                            System.out.println("Estado alterado com Sucesso.");
                        }
                        else
                            System.out.println("ID não encontrada");

                        break;

                    case 3:

                        if (listaPedidos.isEmpty()) {

                            System.out.println("Nenhum pedido cadastrado nesta sessão.");

                        } else {

                            for (Pedidos pedidos : listaPedidos)
                            {
                                menu.infoPedidos(pedidos);
                                System.out.println("------------------------------------");
                            }
                        }

                        break;

                    case 4:

                        // desloga o usúario quando acabar sua sessão.

                        listaFuncionarios.get(0).logoutSistema();
                        menu.despedida();

                        break;

                    default:
                        System.out.println("Opção Inválida.");
                        break;
                }
            } while (opcao_menu != 4);
        }
    }

}



