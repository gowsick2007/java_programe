import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int n =a.nextInt();
        int i;
        for(i=2;i<n;i++);
        if(n % i==0){
            System.out.print(n + " is a prime number.");
        }else {
                System.out.print(n + " is not a prime number.");
            }
        
    }
}
