import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang va so cot: ");
        int n = scanner.nextInt();

        int A[][] = new int[n][n];
        int B[][] = new int[n][n];

        System.out.println("Nhap mang A");
        nhapMang(A, n);
        System.out.println("Nhap mang B");
        nhapMang(B, n);

        System.out.print("Mang A sau khi nhap la: ");
        xuatMang(A, n);
        System.out.print("\nMang B sau khi nhap la: ");
        xuatMang(B, n);

        System.out.print("\nTong mang A va mang B ");

        int C[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        xuatMang(C, n);

        System.out.print("\nMa tran chuyen vi của A: ");
        maTranChuyenVi(A, n);
        xuatMang(A, n);

        System.out.print("\nMa tran chuyen vi của B: ");
        maTranChuyenVi(B, n);
        xuatMang(B, n);

        System.out.print("\nTong cac phan tu chia het cho 5 cua mang A: ");
        tongCacPhanTuChiaHetCho5(A, n);

        System.out.print("\nTong cac phan tu chia het cho 5 cua mang B: ");
        tongCacPhanTuChiaHetCho5(B, n);



    }

    public static void nhapMang(int array[][], int n) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Nhap phan tu vi tri [%d][%d]: ", i, j);
                array[i][j] = scanner.nextInt();

            }
        }
    }

    public static void xuatMang(int array[][], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("");
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
    }

    public static void maTranChuyenVi(int array[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
    }

    public static void tongCacPhanTuChiaHetCho5(int array[][], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] % 5 == 0) {
                    sum += array[i][j];
                }

            }
        }
        System.out.println(sum);
    }
}