package Aula2_TM.Pratica1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Exe1 {

    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.setNome("Armando");
        e1.setDataNascimento(LocalDate.parse("2000-01-02"));
        Estudante e2 = new Estudante();
        e2.setNome("Breno");
        e2.setDataNascimento(LocalDate.parse("1976-06-09"));
        Estudante e3 = new Estudante();
        e3.setNome("Lisa");
        e3.setDataNascimento(LocalDate.parse("2001-12-30"));

        Disciplina d1 = new Disciplina();
        d1.setNome("Aula 1");
        d1.setCargaHoraria(40);
        Disciplina d2 = new Disciplina();
        d2.setNome("Aula 2");
        d2.setCargaHoraria(50);
        Disciplina d3 = new Disciplina();
        d3.setNome("Aula 3");
        d3.setCargaHoraria(80);

        Turma t1 = new Turma();
        t1.setSerie("1 serie");
        t1.setCodigo("A");
        ArrayList<Disciplina> aulas = new ArrayList<>();
        aulas.add(d1);
        aulas.add(d2);
        aulas.add(d3);
        t1.setDisciplinas(aulas);
        ArrayList<Estudante> alunos = new ArrayList<>();
        alunos.add(e1);
        alunos.add(e2);
        alunos.add(e3);
        t1.setEstudantes(alunos);

        System.out.println("Turma " + t1.getCodigo() + " de " + t1.getSerie());
        for (Disciplina d: t1.getDisciplinas()) {
            System.out.println("Disciplina " + d.getNome() + " com carga horária de " + d.getCargaHoraria());
        }
        for (Estudante e: t1.getEstudantes()) {
            System.out.println("Aluno " + e.getNome() + " nascido em " + e.getDataNascimento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        }


    }

    private static class Turma {
        String serie = "";
        String codigo = "";
        ArrayList<Disciplina> disciplinas = new ArrayList<>();
        ArrayList<Estudante> estudantes = new ArrayList<>();

        public String getSerie() {
            return serie;
        }
        public void setSerie(String serie) {
            this.serie = serie;
        }
        public String getCodigo() {
            return codigo;
        }
        public void setCodigo(String codigo) {
            this.codigo = codigo;
        }
        public ArrayList<Disciplina> getDisciplinas() {
            return disciplinas;
        }
        public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
            this.disciplinas = disciplinas;
        }
        public ArrayList<Estudante> getEstudantes() {
            return estudantes;
        }
        public void setEstudantes(ArrayList<Estudante> estudantes) {
            this.estudantes = estudantes;
        }
    }

    private static class Disciplina {
        String nome = "";
        int cargaHoraria = 0;

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public int getCargaHoraria() {
            return cargaHoraria;
        }
        public void setCargaHoraria(int cargaHoraria) {
            this.cargaHoraria = cargaHoraria;
        }
    }

    private static class Estudante {
        String nome = "";
        LocalDate dataNascimento = null;

        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public LocalDate getDataNascimento() {
            return dataNascimento;
        }
        public void setDataNascimento(LocalDate dataNascimento) {
            this.dataNascimento = dataNascimento;
        }
    }
}
