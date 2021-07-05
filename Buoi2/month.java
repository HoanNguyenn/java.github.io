package Buoi2;

import java.util.Scanner;

public class month {
    /**
     *
     */
    private static final int MAY = 5;
    /**
     *
     */
    private static final int MARCH = 3;
    /**
     *
     */
    private static final int January = 1;
    /**
     *
     */
    private static final int JANUARY = January;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        System.out.println("Nhập tháng");
        month = scanner.nextInt();
        
        switch (month) {
            case JANUARY :
            // ten hang viet in hoa
            case MARCH :
            case MAY :
            case 7 :
            case 8 :
            case 10 :
            case 12 :
            System.out.println("Tháng có 31 ngày");
            break;
            case 2:
            System.out.println("Tháng có 28 hoặc 29 ngày");
            break;
            case 4: 
            case 6:
            case 9: 
            case 11:
            System.out.println("Tháng cso 30 ngày");
            break;
            default:
            System.out.println("Không có tháng này");
        }
        scanner.close();

    }
}
