package Aula2_TT.Pratica2;

import java.math.BigDecimal;

public class Programa {
    public static void main(String[] args) {
        Pj pj = new Pj("Terceiro", 40, BigDecimal.valueOf(39.99));
        System.out.println(pj.getNome() + " Recebe: R$" + pj.pagarSalario());

        Tecnico t1 = new Tecnico("Joao", true);
        System.out.println(t1.getNome() + " Recebe: R$" + t1.pagarSalario());
        Tecnico t2 = new Tecnico("Paulo", false);
        System.out.println(t2.getNome() + " Recebe: R$" + t2.pagarSalario());

        Analista a1 = new Analista("A1", true);
        System.out.println(a1.getNome() + " Recebe: R$" + a1.pagarSalario());
        Analista a2 = new Analista("A2", false);
        System.out.println(a2.getNome() + " Recebe: R$" + a2.pagarSalario());

        Gerente g1 = new Gerente("G1", true);
        System.out.println(g1.getNome() + " Recebe: R$" + g1.pagarSalario());
        Gerente g2 = new Gerente("G2", false);
        System.out.println(g2.getNome() + " Recebe: R$" + g2.pagarSalario());

        Diretor d = new Diretor("D1", BigDecimal.valueOf(1000000));
        System.out.println(d.getNome() + " Recebe: R$" + d.pagarSalario());
    }

}
