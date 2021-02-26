import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int size = 20;
        int n = 5;
        int arr[] = new int[size];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap phan tu thu [%d]: ", i);
            arr[i] = scanner.nextInt();
        }
        System.out.println("Mang vua nhap la: ");
        xuatMang(n, arr);

        // them phan tu
        System.out.print("\nNhap phan tu muon them vao: ");
        int x = scanner.nextInt();
        n = insert(arr, n, size, x);
        System.out.println("\nMang sau khi them la: ");
        xuatMang(n, arr);

        // Sua phan tu
        System.out.print("\nNhap vao vi tri can sua: ");
        int k = scanner.nextInt();
        if (k < 0 || k >= n) {
            System.out.println("Vi tri khong hop le");
            System.exit(0);
        } else {
            System.out.print("Nhap phan tu: ");
            int h = scanner.nextInt();
            arr[k] = h;
        }
        System.out.println("Mang sau khi sua: ");
        xuatMang(n, arr);

        // chen phan tu
        System.out.print("\nNhap vao vi tri can chen phan tu: ");
        k = scanner.nextInt();
        System.out.print("\nNhap phan tu: ");
        x = scanner.nextInt();
        n = themPhanTu(arr, n, size, x, k);
        System.out.println("Mang sau khi chen phan tu la: ");
        xuatMang(n, arr);

        // xoa phan tu
        System.out.print("\nNhap vi tri can xoa: ");
        k = scanner.nextInt();
        n= delete(arr, n, size, k);
        System.out.println("Mang sau khi xoa: ");
        xuatMang(n, arr);

        scanner.close();
    }

    public static void xuatMang(int n, int arr[]) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static int insert(int arr[], int n, int size, int x) {
        if (n >= size) {
            return n;
        }
        arr[n] = x;
        return n + 1;

    }

    public static int themPhanTu(int arr[], int n, int size, int x, int k) {
        if (n >= size) {
            return n;
        }
        if (k < 0 || k >= n) {
            return n;
        } else {
            for (int i = n; i > k; i--) {
                // dung nguoc lai: i=k, i<=n,i++?
                // vi tri thu 5 se di dau?
                arr[i] = arr[i - 1];
            }
            arr[k] = x;
        }
        return n + 1;
    }
    public static int delete (int arr[], int n, int size, int k){
        if (k<0||k>=n){
            return n;
        }
        else {
            for (int i=k;i<n;i++){
                // khong hieu cach chay
                arr[i]=arr[i+1];
            }
        }
        return n-1;
    }
}
