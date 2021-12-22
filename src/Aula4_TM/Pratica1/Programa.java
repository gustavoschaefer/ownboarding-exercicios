package Aula4_TM.Pratica1;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        GuardaRoupa guardaRoupa = new GuardaRoupa();

        List<Vestuario> v1 = Arrays.asList(
            new Vestuario("dudalina","camisa"),
            new Vestuario("nike","calção")
        );
        System.out.println("Roupas guardadas na posição: " + guardaRoupa.guardaVestuario(v1));

        List<Vestuario> v2 = Arrays.asList(
            new Vestuario("ogochi","camisa"),
            new Vestuario("nike","camiseta")
        );
        System.out.println("Roupas guardadas na posição: " + guardaRoupa.guardaVestuario(v2));

        guardaRoupa.mostrarVestuario();

        System.out.println("-----------------------------");
        System.out.println("Devolução da posição 1");
        Iterator<Vestuario> iterator = guardaRoupa.devolverVestuarios(1).iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

        guardaRoupa.mostrarVestuario();

    }
    
}
