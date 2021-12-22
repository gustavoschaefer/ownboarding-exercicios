package Aula4_TM.Pratica2;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;

public class Corrida {
    private float distancia;
    private BigDecimal premio;
    private String nome;
    private int quantidadeVeiculosPermitidos;
    private List<Veiculo> listaVeiculos;
    
    public Corrida(float distancia, BigDecimal premio, String nome, int quantidadeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premio = premio;
        this.nome = nome;
        this.quantidadeVeiculosPermitidos = quantidadeVeiculosPermitidos;
    }

    @Override
    public String toString() {
        String lista = "";
        Iterator<Veiculo> iterator = listaVeiculos.iterator();
        while(iterator.hasNext()) {
            lista += iterator.next();
        }

        return "Corrida [distancia=" + distancia
            + ", nome=" + nome
            + ", premio=" + premio
            + ", quantidadeVeiculosPermitidos=" + quantidadeVeiculosPermitidos
            + ", listaVeiculos=[\n" + lista
            + "\n]";
    }
    
}
