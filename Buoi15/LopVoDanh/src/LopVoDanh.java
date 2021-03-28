public class LopVoDanh {
    public static void main(String[] args) throws Exception {
        HinhHoc hinh = new HinhHoc(){
            float banKinh;

            @Override
            public void nhapBanKinh(float r) {
                this.banKinh = r;
                
            }

            @Override
            public float dienTich() {
        
                return (float) (banKinh*banKinh*Math.PI);
            }

            @Override
            public float chuVi() {
                // TODO Auto-generated method stub
                return (float) (2*Math.PI*banKinh);
            }

            @Override
            public void display() {
                System.out.println("Dien tich " + dienTich());
                System.out.println("Chu vi " + chuVi());
                
            }
            
            
        };

        hinh.nhapBanKinh(3);
        hinh.display();
    }
}
