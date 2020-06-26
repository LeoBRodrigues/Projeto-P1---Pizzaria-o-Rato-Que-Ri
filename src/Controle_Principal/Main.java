package Controle_Principal;

import Controle_Funcionarios.Funcionario;

public class Main {

    public static void main(String[] args) {

        String nome, email, senha;

        //Funcionario para Teste

        senha = "123456";
        nome = "Murilo Zanini";
        email = "zanini@ORQR.com";

        Funcionario funcionario1 = new Funcionario(nome, email, senha);



    }
}
