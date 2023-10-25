package uniderp.escola.poo.dominio;

public class Aluno {
    private int codigo;
    private String nome;
    private java.util.Date datadeNascimento;
    private int periodo;
    private String nomedeUsuario;
    private String Senha;
    
    public int getCodigo() {
        return codigo;
    };

    public String getNome() {
        return nome;
    }
    
    public java.util.Date getDatadeNascimento() {
        return datadeNascimento;
    }

    public int getPeriodo() {
        return periodo;
    }

    public String getNomedeUsuario() {
        return nomedeUsuario;
    }

    public String getSenha() {
        return Senha;
    }

    public Aluno( int codigo, String nome, java.util.Date DatadeNascimento, int periodo, String NomedeUsuario, String senha) {
        this.codigo = codigo;
        this.nome = nome;
        DatadeNascimento = datadeNascimento;
        this.periodo = periodo;
        nomedeUsuario = NomedeUsuario;
        senha = Senha;
        
    }
}
