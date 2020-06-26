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

        Scanner scanner = new Scanner(System.in); // Armazena entrada do usuario
        ArrayList<Pedidos> listaPedidos = new ArrayList<>(); // Armazena os Pedidos


        //Funcionario para Teste

        senha = "123456";
        nome = "Murilo Zanini";
        email = "zanini@ORQR.com";

        Funcionario funcionario1 = new Funcionario(nome, email, senha);

        opcao_menu = opcao_menu = Integer.parseInt(scanner.nextLine());

        do {
            switch (opcao_menu) {
                case 1:
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
        } while(opcao_menu != 4);

    }
}
