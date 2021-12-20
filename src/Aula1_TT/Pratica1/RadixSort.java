package Aula1_TT.Pratica1;

import java.util.ArrayList;

public class RadixSort {

    private static int[] radixSort(int iArr[]) {
        int iArrRet[] = new int[iArr.length];
        ArrayList<String> sArr = new ArrayList<>();
        ArrayList<String> L0 = new ArrayList<>();
        ArrayList<String> L1 = new ArrayList<>();
        ArrayList<String> L2 = new ArrayList<>();
        ArrayList<String> L3 = new ArrayList<>();
        ArrayList<String> L4 = new ArrayList<>();
        ArrayList<String> L5 = new ArrayList<>();
        ArrayList<String> L6 = new ArrayList<>();
        ArrayList<String> L7 = new ArrayList<>();
        ArrayList<String> L8 = new ArrayList<>();
        ArrayList<String> L9 = new ArrayList<>();

        int max = maxNumber(iArr);
        int digits = String.valueOf(max).length();

        for (int i=0;i<iArr.length;i++) {
            sArr.add(String.format("%0"+digits+"d",iArr[i]));
        }

        while (digits > 0) {
            for (String item: sArr) {

                if (item.substring(digits-1, digits).equals("0")) {
                    L0.add(item);
                } else if (item.substring(digits-1, digits).equals("1")) {
                    L1.add(item);
                } else if (item.substring(digits-1, digits).equals("2")) {
                    L2.add(item);
                } else if (item.substring(digits-1, digits).equals("3")) {
                    L3.add(item);
                } else if (item.substring(digits-1, digits).equals("4")) {
                    L4.add(item);
                } else if (item.substring(digits-1, digits).equals("5")) {
                    L5.add(item);
                } else if (item.substring(digits-1, digits).equals("6")) {
                    L6.add(item);
                } else if (item.substring(digits-1, digits).equals("7")) {
                    L7.add(item);
                } else if (item.substring(digits-1, digits).equals("8")) {
                    L8.add(item);
                } else if (item.substring(digits-1, digits).equals("9")) {
                    L9.add(item);
                }
            }
            sArr.clear();
            sArr.addAll(L0);
            sArr.addAll(L1);
            sArr.addAll(L2);
            sArr.addAll(L3);
            sArr.addAll(L4);
            sArr.addAll(L5);
            sArr.addAll(L6);
            sArr.addAll(L7);
            sArr.addAll(L8);
            sArr.addAll(L9);
            L0.clear();
            L1.clear();
            L2.clear();
            L3.clear();
            L4.clear();
            L5.clear();
            L6.clear();
            L7.clear();
            L8.clear();
            L9.clear();

            System.out.println("\nArraylist digito " + digits);
            for (String item: sArr) {
                System.out.print(item + " ");
            }
            digits--;
        }

        int p=0;
        for (String item: sArr) {
            iArrRet[p] = Integer.valueOf(item);
            p++;
        }
        return iArrRet;

    }

    public static void main(String[] args) {
        int iArr[] = {16223,898,13,906,235,23,9,1532,6388,2511,8};

        int iArrSorted[] = radixSort(iArr);

        System.out.println("\n\nArray");
        for (int i: iArr) {
            System.out.print(i + " ");
        }

        System.out.println("\nArray sorted");
        for (int i: iArrSorted) {
            System.out.print(i + " ");
        }
    }

    private static int maxNumber(int iArr[]) {
        int max=0;
        for (int i=0;i<iArr.length;i++) {
            if (iArr[i] > max) {
                max = iArr[i];
            }
        }
        return max;
    }
}
