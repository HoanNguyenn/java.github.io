import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Nhap mot so N nguyen duong >8 va <14: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 8 && n < 14) {
            Double[] arr = new Double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (random(-10, 10));
                System.out.println(arr[i]);
            }
            Arrays.sort(arr);
            System.out.println("Nhap mot so X trong khoang tu -10 den 10: ");
            double x = scanner.nextDouble();
            if (x > -10 && x < 10) {
                printClosest(arr, n, x);
            } else {
                System.out.println("Nhap lai");
                x = scanner.nextInt();
                printClosest(arr, n, x);
            }
        } else {
            System.out.println("Nhap sai");
            System.exit(0);
        }

    }

    public static Double random(int min, int max) {
        return min + (Math.random() * (max - min));
    }

    static void printClosest(Double[] arr, int n, double x) {
        int res_l = 0, res_r = 0;
        int l = 0, r = n - 1;
        double diff = Integer.MAX_VALUE;
        while (r > l) {
            if (Math.abs(arr[l] + arr[r] - x) < diff) {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr[r] - x);
            }
            if (arr[l] + arr[r] > x)
                r--;
            else
                l++;
        }

        System.out.println("The closest pair is " + arr[res_l] + " and " + arr[res_r]);
    }

}
