package Aula1.Pratica2;

public class Exe2 {

    private static class Empresa {
        private String nome;
        private int ano;
        private double valor;
        private double crescimento;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public double getCrescimento() {
            return crescimento;
        }

        public void setCrescimento(double crescimento) {
            this.crescimento = crescimento;
        }
    }

    public static void main(String[] args) {
        Empresa x = new Empresa();
        x.setNome("Emrpesa x");
        x.setAno(2021);
        x.setValor(1.13);
        x.setCrescimento(1.48);

        Empresa y = new Empresa();
        y.setNome("Emrpesa y");
        y.setAno(2021);
        y.setValor(18.4);
        y.setCrescimento(0.32);

        while (y.getValor() > x.getValor()) {
            System.out.println(x.getNome() + " - " + x.getAno() + " - Valor da empresa: " + x.getValor());
            System.out.println(y.getNome() + " - " + y.getAno() + " - Valor da empresa: " + y.getValor());
            x.setAno(x.getAno() + 1);
            x.setValor(x.getValor() + (1 * x.getCrescimento()));
            y.setAno(y.getAno() + 1);
            y.setValor(y.getValor() + (1 * y.getCrescimento()));
        }
        System.out.println(x.getNome() + " - " + x.getAno() + " - Valor da empresa: " + x.getValor());
        System.out.println(y.getNome() + " - " + y.getAno() + " - Valor da empresa: " + y.getValor());
    }
}
