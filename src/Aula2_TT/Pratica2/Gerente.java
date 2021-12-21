package Aula2_TT.Pratica2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Gerente extends Clt{
    private boolean meta = false;
    public Gerente(String nome, boolean meta) {
        super.setNome(nome);
        super.setSalario(BigDecimal.valueOf(6000));
        super.setBonus((float) 0.125);
        this.meta = meta;
    }

    @Override
    public BigDecimal pagarSalario() {
        BigDecimal dsr = super.getSalario().divide(
                BigDecimal.valueOf(36), RoundingMode.CEILING
        ).multiply(BigDecimal.valueOf(4));
        if (meta) {
            return super.getSalario().add(
                    super.getSalario().multiply(
                            BigDecimal.valueOf(super.getBonus())
                    )
            ).add(dsr);
        } else {
            return super.getSalario().add(dsr);
        }
    }
}
