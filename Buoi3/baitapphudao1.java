package Buoi3;

public class baitapphudao1 {
        public static void main(String[] args) throws Exception {
        char [] arr = {'c','h','a','n','c','y'};
        arr [1] = 'n';
        System.out.print("Mang: ");
        for (int i=0;i<arr.length;i++) {
             System.out.print(arr[i]);  
        }
        System.out.println("\nKich thuoc cua mang: "+arr.length);
        }
}
