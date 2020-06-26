package Controle_Principal;

import Controle_Funcionarios.Funcionario;
import Controle_Pedidos.Pedidos;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Variáveis do Programa


        String nome, email, senha;
        int opcao_menu;
        boolean senha_valida;

        Scanner scanner = new Scanner(System.in); // Armazena entrada do usuario
        ArrayList<Pedidos> listaPedidos = new ArrayList<>(); // Armazena os Pedidos


        //Funcionario para Teste

        senha = "123456";
        nome = "Murilo Zanini";
        email = "zanini@ORQR.com";

        Funcionario funcionario1 = new Funcionario(nome, email, senha);

        // Loop do Login
        while(true) {

            // Loop do Menu

            System.out.println("Bem-vindo(a) " + nome + ". Por favor, digite sua senha:");

            // Verifica se a senha está correta. Prossegue para o programa de qualquer forma.
            // Primeiramente gera o hash da senha e compara com o hash armazenado.

            senha_valida = funcionario1.comparadorHash(funcionario1.geradorHash(scanner.nextLine()));

            if(!senha_valida)
            {
                System.out.println("Atenção! Senha inválida. Deseja prosseguir mesmo assim?");
                System.out.println("1. Sim\n2. Não");
                opcao_menu = Integer.parseInt(scanner.nextLine());

                if(opcao_menu != 1) continue;
            }

            do {

                opcao_menu = opcao_menu = Integer.parseInt(scanner.nextLine());

                switch (opcao_menu) {
                    case 1:

                        if(!senha_valida)
                        {
                            System.out.println("Senha Inválida! Entre novamente.");
                            break;
                        }

                        break;

                    case 2:
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    default:
                        break;
                }
            } while (opcao_menu != 4);
        }
    }
}
