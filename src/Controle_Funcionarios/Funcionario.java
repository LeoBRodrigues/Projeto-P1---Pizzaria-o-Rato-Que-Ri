package Controle_Funcionarios;

public class Funcionario implements LoginSistema {


    private String nome, email, senha;


    /**
     * Construtor da classe Funcionario.
     * @param nome (nome do funcionario a ser cadastrado)
     * @param email (email do usuario a ser cadastrado)
     * @param senha (senha de acesso do usuario a ser cadastrado, salva como Hash)
     */

    public Funcionario (String nome, String email, String senha){

        this.nome = nome;
        this.email = nome;
        this.senha = geradorHash(senha);
    }

    /**
     * Gera um Hash de 32 bits para armazenar a senha de forma segura
     * @param senha (String com a senha do usuario)
     * @return (Retorna uma string com o hash gerado)
     */

    @Override
    public String geradorHash(String senha){

        return Integer.toString(senha.hashCode());

    }

    /**
     * Compara o hash armazenado do usuário com a senha digitada na hora do login
     * @param hashRecebido (Hash da senha digitada na hora do login)
     * @return (Retorna True se os dois hashes forem iguais, False caso negativo)
     */

    @Override
    public boolean comparadorHash(String hashRecebido){

        return hashRecebido.equals(this.senha);

    }





}
