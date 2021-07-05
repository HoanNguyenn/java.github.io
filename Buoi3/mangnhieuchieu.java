package Buoi3;

import java.util.Scanner;

public class mangnhieuchieu {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        
        int [][] arr;
        arr = new int [3][3];

        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
                arr[i][j]=scanner.nextInt();
            }
        }
        
        for (int i=0;i<3;i++) {
            System.out.println("");
        for (int j=0;j<3;j++) {
            System.out.print(arr[i][j]+"\t");   
        }
    }

        int sum=0;
        for (int i=0;i<3;i++) {
        for (int j=0; j<3; j++) {
                if (i == j) {
                    sum += arr[i][j];
            }
            }
        }
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);
        

    scanner.close();
    
}
}
