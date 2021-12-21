package Aula2_TT.Pratica2;

import java.math.BigDecimal;

public class Analista extends Clt {

    private boolean meta = false;
    public Analista(String nome, boolean meta) {
        super.setNome(nome);
        super.setSalario(BigDecimal.valueOf(4000));
        super.setBonus((float) 0.08);
        this.meta = meta;
    }

    @Override
    public BigDecimal pagarSalario() {
        BigDecimal dsr = super.getSalario().divide(
                BigDecimal.valueOf(40)
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
