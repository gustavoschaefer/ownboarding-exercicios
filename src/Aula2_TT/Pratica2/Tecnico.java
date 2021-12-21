package Aula2_TT.Pratica2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Tecnico extends Clt {

    private boolean meta = false;
    public Tecnico(String nome, boolean meta) {
        super.setNome(nome);
        super.setSalario(BigDecimal.valueOf(3200));
        super.setBonus((float) 0.05);
        this.meta = meta;
    }

    @Override
    public BigDecimal pagarSalario() {
        if (meta) {
            return super.getSalario().add(
                    super.getSalario().multiply(
                            BigDecimal.valueOf(super.getBonus())
                    )
            );
        } else {
            return super.getSalario();
        }
    }
}
