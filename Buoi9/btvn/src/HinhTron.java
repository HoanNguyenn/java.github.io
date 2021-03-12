public class HinhTron extends HinhHoc implements IHinhTron {

    private double banKinh; 

    @Override
    public double chuVi() {
        return banKinh*2*3.14;
    }

    @Override
    public double dienTich() {
        return Math.pow(banKinh, 2)*3.14;
    }

    @Override
    public double duongKinh() {
        return banKinh*2;
    }

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
}
