package Controle_Funcionarios;

public interface LoginSistema {

    public String geradorHash(String senha);

    public boolean comparadorHash(String hashRecebido);
}
