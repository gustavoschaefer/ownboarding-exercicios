package Aula3_TM.Pratica1;

public class SortUtils {
    public static <T> void sort(Precedente<T>arr[]) {

        boolean houveTroca = true;
        while (houveTroca == true) {
            houveTroca = false;
            for(int x = 0; x < arr.length - 1; x++) {
                if (arr[x].precedeA((T)arr[x + 1]) > 0) {
                    Precedente<T> aux = arr[x];
                    arr[x] = arr[x + 1];
                    arr[x + 1] = aux;
                    houveTroca = true;
                }
            }
        }
    }
}
