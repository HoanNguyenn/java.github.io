package Buoi2;

import java.util.Scanner;

public class btvn {
    public static void main(String[] args) {
        System.out.println("Bai 1");
        float a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a");
        a = scanner.nextFloat();
        System.out.println("Nhap canh b");
        b = scanner.nextFloat();
        System.out.println("Nhap canh c");
        c = scanner.nextFloat();

        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Ba canh la mot tam giac");
        } else {
            System.out.println("Ba canh khong la mot tam giac");
        }
        

        
        System.out.println("");
        System.out.println("Bai 2");
        System.out.println("Nhap so nguyen duong m:");
        int m;
        m = scanner.nextInt();
        System.out.print("Chuoi Fibonacci voi " + m + " so la: ");
        int f0 = 0;
        int f1 = 1;
        int fn;
        for (int i = 1; i <= m; i++) {
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
            System.out.print(f0 + "");
        }
        
        System.out.println("");
        System.out.println("Bai 3");
        System.out.println("Nhap n:");
        int n;
        int j = 1;
        n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            j*= i;
        }
        System.out.println("Giai thua của n là " + j);
        scanner.close();
    }

}
