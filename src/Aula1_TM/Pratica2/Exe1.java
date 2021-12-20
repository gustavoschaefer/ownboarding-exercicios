package Aula1_TM.Pratica2;

import java.util.Arrays;
import java.util.Collections;

public class Exe1 {
    public static void main(String[] args) {
        Integer[] array = {52,10,85,1324,01,13,62,30,12,127};

        System.out.println("Ordem crescente:");
        Arrays.sort(array);
        for (Integer item:array) {
            System.out.print(item + " ");
        }

        System.out.println();
        System.out.println("Ordem decrescente:");
        Arrays.sort(array, Collections.reverseOrder());
        for (Integer item:array) {
            System.out.print(item + " ");
        }
    }
}
