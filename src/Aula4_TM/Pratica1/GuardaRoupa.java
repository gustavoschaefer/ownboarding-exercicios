package Aula4_TM.Pratica1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuardaRoupa {
    Map<Integer,List<Vestuario>> dic = new HashMap<Integer,List<Vestuario>>();
    Integer pos = 0;

    public Integer guardaVestuario(List<Vestuario> listaDeVestuario) {
        this.pos++;
        this.dic.put(pos, listaDeVestuario);
        return pos;
    }

    public void mostrarVestuario() {
        for (Integer key : dic.keySet()) {
            List<Vestuario> value = dic.get(key);
            System.out.println("---------------------------------------");
            System.out.println("Posição: " + key);
            value.stream().forEach(
                v -> System.out.println("Marca: " + v.getMarca() + " Modelo: " + v.getModelo()));
        }
    }

    public List<Vestuario> devolverVestuarios(Integer id) {
        if (this.dic.containsKey(id)) {
            List<Vestuario> ret = this.dic.get(id);
            this.dic.remove(id);
            return ret;
        } else {
            return null;
        }

    }
}
