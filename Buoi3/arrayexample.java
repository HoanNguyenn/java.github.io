package Buoi3;

public class arrayexample {
    public static void main(String[] args) throws Exception {
        //Khai bao mang
        int[] arr;
        
        //Cap phat bo nho
        arr = new int[5];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 9;
        arr[3] = 6;
        arr[4] = 1;

        //In kich thuoc mang
        System.out.println("Kich thuoc cua mang la: "+arr.length);

        //in thong tin mang
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }

        //In thong tin phan tu co index = 3;
        System.out.println("\nPhan tu tai index = 3 : "+arr[3]);
    }
}
