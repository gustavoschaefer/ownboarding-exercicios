package Aula2_TT.Pratica2;

import java.math.BigDecimal;

public class Pj extends Funcionario{
    private int horas = 0;
    private BigDecimal valorHora;

    public Pj(String nome, int horas, BigDecimal valorHora) {
        super.setNome(nome);
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    public BigDecimal pagarSalario() {
        return BigDecimal.valueOf(horas).multiply(valorHora);
    }
}
