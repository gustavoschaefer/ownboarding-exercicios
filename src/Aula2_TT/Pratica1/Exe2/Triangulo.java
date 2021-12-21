package Aula2_TT.Pratica1.Exe2;

public class Triangulo extends FiguraGeometrica{
    private double altura;
    private double base;

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double area() {
        return (altura * base) / 2;
    }
}
