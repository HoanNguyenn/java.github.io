
package Buoi2;

public class dowhile {
    public static void main(String[] args) {
        int sum=0;
        int i=0;
        do {
            if (i%2==0) { 
                sum +=i; };
            i++;
        }
        while ( i<=10);
         
        System.out.println(sum);
    }
}
