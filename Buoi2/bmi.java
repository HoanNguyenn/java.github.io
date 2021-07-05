package Buoi2;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        double weight;
        System.out.println("type weight:" +"kg");
        weight = scanner.nextDouble();
        
        double height;
        System.out.println("type height:"+"m");
        height = scanner.nextDouble();
        
        double BMI = weight/(height*height);
        System.out.println("chỉ số BMI: ");
        System.out.println(BMI);

        if (BMI < 18.5) {
            System.out.println("Thiếu cân");
        } 
        else if (BMI>=24.9){
            System.out.println("Thừa cân");
        }
        else {
            System.out.println("Cân đối");
        }
        scanner.close();
    }
}
