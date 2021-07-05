public class Calculation{
    public Integer numberDivide (Integer x, Integer y){
        try {
            Integer result = x/y;
            return result;
        }
        catch (ArithmeticException e){
            // cac loi trong bai toan (VD: mau so bang 0)
            System.out.println("ArithmeticException" +e.getMessage());
            // in ra noi dung loi 
            return Integer.MAX_VALUE;
        }
        finally{
            System.out.println("This is finally");
            // du ket qua nhu the nao deu chay
        }

    }
}