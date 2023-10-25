package uniderp.escola.poo.dominio;

public class Disciplina {
    protected int codigo;
     protected  String nome;
     protected  String ementa;
     protected  int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome(){
        return nome;
    }
    public String getEmenta(){
        return ementa;
    }
    public Disciplina( int codigo, String nome, String ementa){
        this.codigo = codigo;
        this.nome = nome;
        this.ementa = ementa;
    }
}
