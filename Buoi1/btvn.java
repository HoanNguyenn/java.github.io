package Buoi1;

import java.util.Scanner;

public class btvn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bai 1");
        double r;
        System.out.println("Nhap ban kinh r:");
        r = scanner.nextDouble();
        double chu_vi = 2*r*Math.PI;
        System.out.format("Chu vi hinh tron: %f",chu_vi);
        System.out.println("");
        double dien_tich = Math.pow(r, 2)*Math.PI; 
        System.out.format("Dien tich hinh tron: %f", dien_tich);
        
        System.out.println("");
        System.out.println("Bai 2");
        double a;
        System.out.println("Nhap vao so a can kiem tra:");
        a = scanner.nextDouble();
        if (a%2==0) {
           System.out.println("a la so chan"); 
        }
        else
        {
            System.out.println("a la so le");
        };

        System.out.println("");
        System.out.println("Bai 3");
        int so_no = 100000000;
        System.out.println("So no: "+so_no);
        double lai_suat = 0.12;
        System.out.println("Lai suat: " + lai_suat);
        double tien_lai_hang_thang = so_no * (lai_suat/12);
        System.out.println("Tien lai phai tra hang thang: " + tien_lai_hang_thang);

        System.out.println("");
        System.out.println("Bai 4");
        double weight;
        System.out.println("type weight:" +"kg");
        weight = scanner.nextDouble();
        
        double height;
        System.out.println("type height:"+"m");
        height = scanner.nextDouble();
        
        double BMI = weight/(height*height);
        System.out.println("chỉ số BMI: ");
        System.out.println(BMI);


        scanner.close(); 
    }
        
}

