package Aula4_TM.Pratica2;

public class Veiculo {
    private float velocidade, aceleracao, anguloDeGiro, peso;
    private int rodas;
    private String placa;
    
    public Veiculo(float velocidade, float aceleracao, float anguloDeGiro, float peso, int rodas, String placa) {
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeGiro = anguloDeGiro;
        this.peso = peso;
        this.rodas = rodas;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Veiculo [aceleracao=" + aceleracao + ", anguloDeGiro=" + anguloDeGiro + ", peso=" + peso + ", placa="
                + placa + ", rodas=" + rodas + ", velocidade=" + velocidade + "]";
    }
    
}
