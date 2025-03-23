
    
import java.util.*;

public class digri {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        
         if( n<20 && n/2!=0){
            System.out.print("Weird");
         }
         if(n>=2 && n<=5){
         if(n/2==0){
            System.out.print("Not Weird");
         }
         
         }
         if(n>=6 && n<=20)
         if(n/2==0){
            System.out.print(" Weird");
         
         
            
         
         if(n>20){
            if(n/2==0){
            System.out.print("Not Weird");
         
         }
         }
        

        scanner.close();
        }
    }


