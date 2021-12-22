package Aula1_TM.Pratica1;

import java.util.Scanner;

public class Exe {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int exe;
        System.out.print("Digite o numero do exercicio:");
        exe = sc.nextInt();
        switch(exe) {
            case 1:
                exercicio1();
                break;
            case 2:
                exercicio2();
                break;
            case 3:
                exercicio3();
                break;
            case 4:
                exercicio4();
                break;
            case 5:
                exercicio5();
                break;
            default:
                System.out.println("Exercicio inexistente.");
        }
    }

    static void exercicio1() {
        int tamanho;
        System.out.print("Digite um numero:");
        tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];
        int count= 1;
        System.out.println("Os números pares são:");
        for (int i=0;i<numeros.length; i++) {
            numeros[i] = count;
            count++;
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
    }

    static void exercicio2() {
        System.out.print("Digite um número:");
        int tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];

        System.out.print("Digite um número divisível pelo primeiro numero:");
        int multiplo = sc.nextInt();

        int count= 1;
        System.out.println("Os números divisíveis são:");
        for (int i=0;i<numeros.length; i++) {
            numeros[i] = count;
            count++;
            if (numeros[i] % multiplo == 0) {
                System.out.println(numeros[i]);
            }
        }
    }

    static void exercicio3() {
        System.out.print("Digite um número:");
        int numero = sc.nextInt();

        boolean primo = true;
        for (int i = 2; i < numero-1; i++){
            if (numero % i == 0)
                primo = false;
        }

        if (primo) {
            System.out.println("O números informado é primo");
        } else {
            System.out.println("O números informado não é primo");
        }

    }

    static void exercicio4() {
        int tamanho;
        System.out.print("Digite um numero:");
        tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];
        int count= 1;
        boolean primo = true;
        System.out.println("Os números primos até "+ tamanho +" são:");
        for (int i=0;i<numeros.length; i++) {
            numeros[i] = count;
            count++;
            primo = true;
            if (numeros[i] == 1) {
                primo = false;
            }
            for (int j = 2; j < numeros[i]-1; j++){
                if (numeros[i] % j == 0) {
                    primo = false;
                }
            }
            if (primo) {
                System.out.println(numeros[i]);
            }
        }
    }

    static void exercicio5() {
        int tamanho;
        System.out.print("Digite um numero de valores a retornar:");
        tamanho = sc.nextInt();
        int[] numeros = new int[tamanho];

        int digitos;
        System.out.print("Digite um numero de digitos do numero:");
        digitos = sc.nextInt();

        Integer num;
        System.out.print("Digite um número de dígitos e de final:");
        num = sc.nextInt();

        Integer count = 1;
        for (int i=0;i<numeros.length; i++) {
            while (numeros[i] == 0) {
                if (count.toString().length() >= digitos) {
                    int aux = count.toString().length() - count.toString().replaceAll(num.toString(),"").length();
                    if (aux >= digitos) {
                        numeros[i] = count;
                        System.out.println(numeros[i]);
                    }
                }
                count++;
            }
        }
    }

}
