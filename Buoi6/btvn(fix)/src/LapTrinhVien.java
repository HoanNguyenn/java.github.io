public class LapTrinhVien extends NhanVien {

    private float overtimeHours;

    public LapTrinhVien() {
    }

    public LapTrinhVien(int id, String name, int age, long telephoneNumber, String email, long basiSalary, float overtimeHours) {
        super(id, name, age, telephoneNumber, email, basiSalary);
        this.overtimeHours = overtimeHours;
    }

    public void nhap(){
        super.nhap();
        System.out.print("Nhap so gio lam them: ");
        overtimeHours = scanner.nextInt();
    }

    public float salary(){
        return( getBasicSalary() + (overtimeHours * 200000));
    }

    public String toString(){
        
        return super.toString() + " So luong nhan duoc: " + salary();
    }
    
    
}
