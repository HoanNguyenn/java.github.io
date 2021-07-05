import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Nhap lai");
        } else {
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.println("Nhap so nguyen thu " + (i + 1) + ":");
                arr[i] = scanner.nextInt();
                if (arr[i]<=0){
                    System.out.println("Nhap sai");
                    System.exit(0);
                    // thoat chuong trinh 
                }
            }

            System.out.println("Mang da nhap: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + "\t");
            }

            int max = arr[0];
            int min = arr[0];
            for (int i = 0; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("\nPhan tu co gia tri nho nhat cua mang: " + min);
            System.out.println("Phan tu co gia tri lon nhat cua mang: " + max);

            int position=0;
            for (int i = 0; i < n; i++) {
                if (arr[i]==max){
                    position = i;
                    System.out.print("Vi tri phan tu lon nhat la: "+position);
                }
            
            }

            int max2 = 0;
            for (int i=0;i<n;i++){
                if (arr[i]>max2 && arr[i]!=arr[position]){
                    max2 = arr[i];   
                }
            }
            System.out.println("\nSo lon thu hai trong mang la: " + max2);
           
            int position2=0;
            for (int i=0; i<n;i++){
                if (arr[i]==max2){
                    position2 = i;
                    System.out.println("Vi tri cua so lon thu hai trong mang la: " + position2);
                }
            }

            int dem = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    dem++;
                }
            }
            System.out.println("\nMang co tat ca " + dem + " so chan");

            System.out.println("Mang sap xep theo gia tri tang dan");
            int temp = arr[0];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                System.out.print(arr[i] + "\t");
            }

            System.out.println("\nMang sap xep theo gia tri giam dan: ");
            int tempo = arr[0];
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] < arr[j]) {
                        tempo = arr[j];
                        arr[j] = arr[i];
                        arr[i] = tempo;
                    }
                }
                System.out.print(arr[i] + "\t");
            }

            System.out.print("\nCac phan tu la so nguyen to: ");
            for (int i = 0; i < n; i++) {
                if (kiemtrasonguyento(arr[i])) {
                    System.out.print(arr[i]+"\t");
                }
            }
        }
        scanner.close();
    }

    public static boolean kiemtrasonguyento(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    } 
    }

