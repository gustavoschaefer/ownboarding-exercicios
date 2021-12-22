package Aula3_TM.Pratica1;

public class Pessoa implements Precedente<Pessoa>{
    private String nome, cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int precedeA(Pessoa p) {
        return this.nome.compareTo(p.nome);
    }
}
