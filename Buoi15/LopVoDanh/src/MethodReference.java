interface MyMethod{
    // ???
    MethodReference display (String saySth);
}

public class MethodReference {
    public MethodReference(String saySth){
        System.out.println(saySth);
    }

    public static void main(String[] args) {
        MethodReference myMethod = new MethodReference("Halo");
        MyMethod method = MethodReference::new;
        method.display("Halo");
        
    }
}
