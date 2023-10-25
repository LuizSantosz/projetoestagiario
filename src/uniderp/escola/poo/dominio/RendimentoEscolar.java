package uniderp.escola.poo.dominio;
import java.util.List;

public class RendimentoEscolar{
    
    private Aluno aluno;
    private Turma turma;
    private List<NotaTrabalho> trabalhos;
    private double nota1Prova;
    private double nota2Prova;
    private double mediaTrabalho;
    private double mediaGeral;
    
    public Aluno getAluno(){
        return aluno;
    }
    public void setAluno( Aluno aluno){
        this.aluno = aluno;
    }

    public Turma getTurma(){
        return turma;
    }

    public void setTurma (Turma turma){
        this.turma = turma;
    }

    public List<NotaTrabalho> getTrabalhos() {
        return trabalhos;
    }

    public void setTrabalhos(List<NotaTrabalho> trabalhos){
        this.trabalhos = trabalhos;
    }

    public double getNota1Prova(){
        return nota1Prova;
    }

     public double getNota2aProva(){
        return nota2Prova;
    }

    public double getMediaTrabalho(){
        return mediaTrabalho;
    }

    public double getMediaGeral(){
        return mediaGeral;
    }

    public void calcularMediaTrabalhos(){
        double somatrabalhos = 0.0;
        for (NotaTrabalho trabalho : trabalhos){
            somatrabalhos += trabalho.getNota();
        }
        this.mediaGeral = (nota1Prova + nota2Prova + mediaTrabalho) / 3;
    }
    public RendimentoEscolar(Aluno aluno, Turma turma, List<NotaTrabalho> trabalhos, double nota1aProva,
            double nota2aProva, double mediaTrabalho, double mediaGeral) {
        this.aluno = aluno;
        this.turma = turma;
        this.trabalhos = trabalhos;
        this.nota1Prova = nota1aProva;
        this.nota2Prova = nota2aProva;
        this.mediaTrabalho = mediaTrabalho;
        this.mediaGeral = mediaGeral;
    }
   
    }
