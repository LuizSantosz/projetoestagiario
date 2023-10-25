package uniderp.escola.poo.dominio;

public class Turma {
    protected int codigo;
     protected Disciplina Disciplina;
     protected Professor Professor;
     protected CapacidadeTurma Turma;
     protected  int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public Disciplina getDisciplina() {
        return Disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        Disciplina = disciplina;
    }
    public Professor getProfessor() {
        return Professor;
    }
    public void setProfessor(Professor professor) {
        Professor = professor;
    }
    public CapacidadeTurma getTurma() {
        return Turma;
    }
    public void setTurma(CapacidadeTurma Turma) {
        this.Turma = Turma;
    }
    public Turma(int codigo, uniderp.escola.poo.dominio.Disciplina disciplina,
            uniderp.escola.poo.dominio.Professor professor, CapacidadeTurma Turma) {
        this.codigo = codigo;
        Disciplina = disciplina;
        Professor = professor;
        this.Turma = Turma;
    }
    
}
