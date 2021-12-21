package Aula2_TT.Pratica1.Exe2;

public class Programa {

    public static void main(String[] args) {
        FiguraGeometrica arr[] = new FiguraGeometrica[3];

        Circulo c = new Circulo();
        c.setRaio(10);
        System.out.println("Área do círculo: " + c.area());

        Triangulo t = new Triangulo();
        t.setAltura(10);
        t.setBase(15);
        System.out.println("Área do triangulo: " + t.area());

        Retangulo r = new Retangulo();
        r.setComprimento(10);
        r.setLargura(15);
        System.out.println("Área do retangulo: " + r.area());

        arr[0] = c;
        arr[1] = t;
        arr[2] = r;

        System.out.println("Área media: " + Utilidade.areaMedia(arr));

    }

}
