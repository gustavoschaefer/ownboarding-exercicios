package Aula1.Pratica2;

import java.util.Scanner;

public class Exe3 {

    private static class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }


    public static void main(String[] args) {

        Produto[] produtos = new Produto[3];

        for (int i=0;i<3;i++) {
            Produto p = new Produto();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nome do produto " + (i+1));
            p.setNome(sc.nextLine());
            System.out.println("Preço do produto " + (i+1));
            p.setPreco(sc.nextDouble());
            System.out.println("Quantidade do produto " + (i+1));
            p.setQuantidade(sc.nextInt());
            produtos[i] = p;
        }

        int i = 1;
        double total = 0;
        for (Produto p:produtos) {
            System.out.println("Produto " + i);
            System.out.println(p.getNome());
            System.out.println("R$" + p.getPreco());
            System.out.println("Quantidade: " + p.getQuantidade() + "\n");
            i++;
            total += p.getPreco() * p.getQuantidade();
        }
        System.out.println("Valor total: R$" + total);

    }
}
