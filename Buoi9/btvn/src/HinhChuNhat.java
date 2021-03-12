public class HinhChuNhat extends HinhHoc implements IHinhChuNhat{
    private double chieuDai;
    private double chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double chuVi() {
        return (chieuDai+chieuRong)*2;
        
    }
    @Override
    public double dienTich() {
        return chieuDai*chieuRong;
        
    }

    @Override
    public double DuongCheo() {
        return Math.sqrt(Math.pow(chieuDai, 2)+Math.pow(chieuRong, 2));
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
}
