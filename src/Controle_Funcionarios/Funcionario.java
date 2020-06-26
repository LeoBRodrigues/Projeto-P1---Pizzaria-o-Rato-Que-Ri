package Controle_Funcionarios;

public class Funcionario extends LoginSistema {


    private String nome, email, senha;


    public Funcionario (String nome, String email, String senha){

        this.nome = nome;
        this.email = nome;
        this.senha = geradorHash(senha);
    }

    @Override
    public String geradorHash(String senha){

        return Integer.toString(senha.hashCode());

    }

    @Override
    public boolean comparadorHash(String hashRecebido){

        return hashRecebido.equals(this.senha);

    }





}
