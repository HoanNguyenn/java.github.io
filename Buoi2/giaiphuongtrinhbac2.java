package Buoi2;

import java.util.Scanner;

public class giaiphuongtrinhbac2 {
    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double a,b,c,delta,x1,x2,x;
    System.out.println("Nhập a");
    a = scanner.nextDouble();
    System.out.println("Nhập b");
    b = scanner.nextDouble();
    System.out.println("Nhập c");
    c = scanner.nextDouble();
    delta = Math.pow(b,2)-(4*a*c);
    x1 = (-b+Math.sqrt(delta)/(2*a));
    x2 = (-b-Math.sqrt(delta)/(2*a));
    x = -c/b; 

    if (delta<0) {
        System.out.println("Phương trình vô nghiệm");
    }
    else if (delta==0) {
        System.out.println("Phương trình có nghiệm kép: x1=x2=" + x1 );
    }
    else if (a==0) {
        System.out.println("Phương trình có nghiệm: x="+x);
    }
    else {
        System.out.println("Phương trình có hai nghiệm:x1=" + x1);
        System.out.println("x2="+ x2);
    }
    
    scanner.close();
   
}

}
