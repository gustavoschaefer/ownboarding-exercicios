package Aula3_TM.Pratica1;

public class Celular implements Precedente<Celular>{
    Integer numero;
    String proprietario;

    public Celular(Integer nro,String prop){this.numero=nro;this.proprietario=prop;}

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    @Override
    public int precedeA(Celular t) {
        return this.numero.compareTo(t.numero) ;
    }

    @Override
    public String toString() {
        return numero + " " + proprietario;
    }

    
}
