public class KiemChungVien extends NhanVien {

    private int numberOfDetectedError;
    public KiemChungVien() {
    }

    public KiemChungVien(int id, String name, int age, long telephoneNumber, String email, long basicSalary, int numberOfDetectedError) {
        super(id, name, age, telephoneNumber, email, basicSalary);
        this.numberOfDetectedError = numberOfDetectedError;
    }
    
    // Ghi de 
    public void nhap(){
        super.nhap();
        System.out.print("Nhap so loi tim duoc: ");
        numberOfDetectedError = scanner.nextInt();
    }

    public float salary(){
        return( getBasicSalary() + (numberOfDetectedError * 200000));
    }

    public String toString(){
        return super.toString() + " So luong nhan duoc: " + salary() +"VND";
    }
    
}

