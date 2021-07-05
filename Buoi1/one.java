package Buoi1;

import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        double j = 3;
        double h = 4;
        double i = Math.sqrt( Math.pow (j , 2) + Math.pow(h, 2));
        System.out.println(i);

        Scanner scanner = new Scanner(System.in);

        // String ten;
        // System.err.println("nhap ten:");
        // ten = scanner.nextLine();
        // System.out.println(ten);

        // String quequan;
        // System.err.println("nhap que quan:");
        // quequan = scanner.nextLine();
        // System.out.println(quequan);

        
        // int tuoi;
        // System.err.println("nhap tuoi:");
        // tuoi = scanner.nextInt();
        // System.out.println(tuoi);

        // scanner.close();

        double weight;
        System.out.println("type weight:" +"kg");
        weight = scanner.nextDouble();
        

        double height;
        System.out.println("type height:"+"m");
        height = scanner.nextDouble();
        
        double BMI = weight/(height*height);
        System.out.println("chỉ sổ BMI: ");
        System.out.println(BMI);

        scanner.close();


    }
}
