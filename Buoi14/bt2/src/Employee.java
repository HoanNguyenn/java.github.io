public class Employee{
    private String ho;
    private String ten;

    public Employee(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }
  
public String getHo() {
    return ho;
}

public void setHo(String ho) {
    this.ho = ho;
}

public String getTen() {
    return ten;
}

public void setTen(String ten) {
    this.ten = ten;
}  

@Override
public String toString() {
    // TODO Auto-generated method stub
    return "Ho va ten: " + ho + "" + ten;
}
    
}