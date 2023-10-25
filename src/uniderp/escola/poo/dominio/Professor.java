package uniderp.escola.poo.dominio;

import java.util.Date;

public class Professor {
    protected int codigo;
    protected String nome;
    protected String cargo;
    protected java.util.Date DatadeNascimento;
    protected String NomedeUsuario;
    protected String senha;
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }
    public String getCargo() {
        return cargo;
    }
    public java.util.Date getDatadeNascimento() {
        return DatadeNascimento;
    }
    public String getNomedeUsuario() {
        return NomedeUsuario;
    }
    public String getSenha() {
        return senha;
    }
    public Professor(int codigo, String nome, String cargo, Date datadeNascimento, String nomedeUsuario, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        DatadeNascimento = datadeNascimento;
        NomedeUsuario = nomedeUsuario;
        this.senha = senha;
    }
    
    
}
