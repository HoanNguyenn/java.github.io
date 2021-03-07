public class KiemChungVien extends NhanVien {

    private int numberOfDetectedError;
    public KiemChungVien() {
    }

    public KiemChungVien(int id, String name, int age, long telephoneNumber, String email, long basicSalary, int numberOfDetectedError) {
        super(id, name, age, telephoneNumber, email, basicSalary);
        this.numberOfDetectedError = numberOfDetectedError;
    }
    
    public void nhap(){
        super.nhap();
        System.out.print("Nhap so loi tim duoc: ");
        numberOfDetectedError = scanner.nextInt();
    }

    public float salary(){
        return( getBasicSalary() + (numberOfDetectedError * 200000));
    }

    public void display(){
        super.display();
        System.out.println("So luong nhan duoc: " + salary()+"VND");
    }
    
}
