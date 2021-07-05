package Buoi3;

import java.util.Scanner;

public class baitaparray {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nhập n:");
    int n;
    n = scanner.nextInt();
    int [] array;
    array = new int [n];
    // int [] array = new int [n];

    for (int i=0; i<n;i++){
        System.out.println("Nhap phan tu thu " + (i+1)+ ":" );
        array [i] = scanner.nextInt();
    }
    System.out.println("Mang da nhap: ");
    for (int i=0; i<array.length;i++) {
    System.out.println(array[i]); 
    }
    
    int max=array[0];
    int min=array[0];
    for (int i=0; i<n; i++) {
        if (array[i]>max) {
            max = array[i];
        }
        if (array[i]<min) {
            min = array[i];
        }
    }
    System.out.println("Phan tu lon nhat cua mang:"+max);
    System.out.println("Phan tu nho nhat cua mang:"+min);
    System.out.println("Mang sap xep nguoc lai: ");
    for (int i=n-1;i>=0;i--){
        System.out.println(array[i]);
    }
    
    System.out.println("Mang sap xep theo gia tri tang dan: ");
    int temp;
    for (int i=0;i<n;i++){
        for (int j=i+1; j<i; j++) {
            if (array[i]>array[j]){
                temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
        System.out.println(array[i]);
           
    }

    System.out.println("Mang sap xep theo gia tri giam dan: ");
    int te=array[0];
    for (int i=0;i<n;i++){
        for (int j=i+1; j<i; j++) {
            if (array[i]<array[j]){
                te=array[j];
                array[j]=array[i];
                array[i]=te;
            }
        }
        System.out.println(array[i]);
           
    }
    scanner.close();
    }
}
    
