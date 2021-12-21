package Aula2_TT.Pratica2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Diretor extends Clt{
    private BigDecimal lucro;
    public Diretor(String nome, BigDecimal lucro) {
        super.setNome(nome);
        super.setSalario(BigDecimal.valueOf(15000));
        this.lucro = lucro;
    }

    @Override
    public BigDecimal pagarSalario() {
        BigDecimal participacao = lucro.multiply(BigDecimal.valueOf(0.03));
        return super.getSalario().add(participacao);
    }
}
