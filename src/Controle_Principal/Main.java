package Controle_Principal;

import Controle_Funcionarios.Funcionario;

public class Main {

    public static void main(String[] args) {

        String nome, email, senha;
        int opcao_menu;

        //Funcionario para Teste

        senha = "123456";
        nome = "Murilo Zanini";
        email = "zanini@ORQR.com";

        Funcionario funcionario1 = new Funcionario(nome, email, senha);

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
