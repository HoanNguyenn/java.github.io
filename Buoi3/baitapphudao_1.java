package Buoi3;

import java.util.Scanner;

public class baitapphudao_1 {
    

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập n:");
        int n;
        n = scanner.nextInt();
        int[] array;
        array = new int[n];
        // int [] array = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            array[i] = scanner.nextInt();
        }
        System.out.println("Mang da nhap: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        int max = array[0];
        int min = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Phan tu lon nhat cua mang:" + max);
        System.out.println("Phan tu nho nhat cua mang:" + min);
        System.out.println("Mang sap xep nguoc lai: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Mang sap xep theo gia tri tang dan: ");
        sortArr(array, n);

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Mang sap xep theo gia tri giam dan: ");
        int te = array[0];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    te = array[j];
                    array[j] = array[i];
                    array[i] = te;
                }
            }
            System.out.println(array[i]);

        }
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                dem++;
            }
        }
        System.out.println("Mang co tat ca " + dem + "so chan");

        System.out.print("Mang cac so chan la: ");
        for (int i = 0; i < n; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "\t");
            }
        }

        System.out.println("\nIn ra so chan trong mang theo thu tu tang dan: ");
        int tempo = array[0];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    tempo = array[i];
                    array[i] = array[j];
                    array[j] = tempo;
                }
            }
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + "\t");
            }
        }

        scanner.close();
    }

    public static void sortArr(int[] array, int n) {
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

    }
}


