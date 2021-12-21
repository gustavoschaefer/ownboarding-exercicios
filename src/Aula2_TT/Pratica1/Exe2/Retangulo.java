package Aula2_TT.Pratica1.Exe2;

public class Retangulo extends FiguraGeometrica {
    private double comprimento;
    private double largura;

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double area() {
        return comprimento * largura;
    }
}
