public class App {
    public static void main(String[] args) throws Exception {
        HinhTron hinhtron = new HinhTron(3);
        System.out.println("Chu vi hinh tron: " + hinhtron.chuVi());
        System.out.println("Dien tich hinh tron: " + hinhtron.dienTich());
        System.out.println("Duong kinh: " + hinhtron.duongKinh());

        HinhChuNhat hinhChuNhat = new HinhChuNhat(3,4);
        System.out.println("Duong cheo hinh chu nhat: " + hinhChuNhat.DuongCheo());
    }
    // scanner sau do gan gia tri vao cac flieds da goi truoc do 
}