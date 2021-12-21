package Aula2_TT.Pratica2;

import java.math.BigDecimal;

public abstract class Clt extends Funcionario {
    private BigDecimal salario;
    private float bonus = 0;
    private int dsr = 0;

    public BigDecimal getSalario() {
        return salario;
    }
    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
    public float getBonus() {
        return bonus;
    }
    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
    public int getDsr() {
        return dsr;
    }
    public void setDsr(int dsr) {
        this.dsr = dsr;
    }
}
