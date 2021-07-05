package Buoi2;

import java.util.Scanner;

public class giaiphuongtrinhbac1 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    double a,b,x;
    
    System.out.println("Nhập a");
    a = scanner.nextDouble();
    System.out.println("Nhập b");
    b = scanner.nextDouble();
    
    x = (-b/a);

    if (a==0) 
    
    if (b==0) {
        System.out.println("Phương trình có vô số nghiệm");
    } 
    else {
        System.out.println("Phương trình vô nghiệm");
    }
    if (a!=0) {
        System.out.println("Nghiệm của phương trình: x= "+ x);
    }
    scanner.close();
}

    
}
