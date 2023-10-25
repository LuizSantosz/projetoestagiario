package uniderp.escola.poo.dominio;

public class CapacidadeTurma {
    private int capacidadeMaxima;
    private int alunosMatriculados;

    public CapacidadeTurma(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.alunosMatriculados = 0;
    }

    public void matricularAluno() {
        if (alunosMatriculados < capacidadeMaxima) {
            alunosMatriculados++;
            System.out.println("Aluno matriculado com sucesso.");
        } else {
            System.out.println("A capacidade da turma foi atingida. Não é possível matricular mais alunos.");
        }
    }

    public int getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public static void main(String[] args) {
        CapacidadeTurma turma = new CapacidadeTurma(30);
        turma.matricularAluno();
        System.out.println("Número de alunos matriculados: " + turma.getAlunosMatriculados());
        turma.matricularAluno();
        System.out.println("Número de alunos matriculados: " + turma.getAlunosMatriculados());
    }
}

