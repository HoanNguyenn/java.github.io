package Buoi1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // System.out.println("Hello, World!");

        int a;
        a = 5; 
        float b = 4.5f; 
        double c = 4.5;

        System.out.println(a + "\t" + c);
        // sys sysout
      
        // Season season=Season.WINTER;
        // System.out.println(season); 
        
        int d=10;
        float f=(float)d;

        double j = 3;
        double h = 4;
        double i = Math.sqrt(Math.pow(j, 2) + Math.pow(h, 2));
        System.out.println(i);
        System.out.format("%f\n",j);

        int day, month, year;
        day = 6 ;
        month = 10;
        year = 2021;
        System.out.format("%02d/%02d/%04d", day, month, year);
        // xuất hiện 06/10/2021 

        Scanner scanner = new Scanner(System.in);
        int k;
        System.out.println("nhap k: ");
        k = scanner.nextInt();
        // k = scanner.nextline();
        // k = Integer.parselnt(scanner.nextLine());
        // k = Integer.valueOf(scanner.nextLine());
        // xử lí trôi lệnh
        System.out.println(k);
       
        String s1;
        System.out.println("Nhap s1: ");
        s1 = scanner.next();
        System.out.println(s1);
        scanner.close();

    }
}

// enum Season{
//     SPRING,SUMMER,AUTUMN,WINTER;
//     }



    