import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so nhan vien trong cong ty: ");
        int soNhanVien = scanner.nextInt();

        NhanVien [] nhanVien = new NhanVien[soNhanVien];
         
        for (int i = 0; i < soNhanVien; i++) {
            System.out.println("Nhap thong tin nhan vien thu " + (i + 1) );
            System.out.print("Chon kieu nhan vien (1 - lap trinh vien, 2 - kiem chung vien): ");
            int choose = scanner.nextInt();
             
            if (choose == 1) {
                nhanVien[i] = new LapTrinhVien();
            } else if (choose == 2) {
                nhanVien[i] = new KiemChungVien();
            }

            nhanVien[i].nhap();
            nhanVien[i].display();
        }

        scanner.close();
    }
    
}
