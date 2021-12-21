package Aula2_TT.Pratica1.Exe2;

public class Utilidade {

    public static double areaMedia(FiguraGeometrica arr[]) {
        double media=0;
        for (int i=0; i<arr.length; i++) {
            media += arr[i].area();
        }
        return media / arr.length;
    }
}
