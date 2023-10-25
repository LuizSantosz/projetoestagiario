package uniderp.escola.poo.dominio;

public class NotaTrabalho{
    private int codigo;
    private Aluno aluno;
    private int trabalho;
    private double nota;
    
    public int getCodigo(){
        return codigo;
    }

    public Aluno getAluno(){
        return aluno;
    }

    public double getTrabalho(){
        return trabalho;
    } 

    public double getNota(){
        return nota;
    }

    public NotaTrabalho(int codigo, Aluno aluno, int trabalho, double nota) {
        this.codigo = codigo;
        this.aluno = aluno;
        this.trabalho = trabalho;
        this.nota = nota;
    }
    
    }
    
   
