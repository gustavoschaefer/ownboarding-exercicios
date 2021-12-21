package Aula2_TT.Pratica1.Exe2;

public class Circulo extends FiguraGeometrica{

    private double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * (2 * raio);
    }
}
