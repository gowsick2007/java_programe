import java.util.*;
class Vote {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("enter your age :");
        int age = a.nextInt();
        if(age>18){
            System.out.print(" you are eligible for vote");
         } else{
                System.out.print(" you are not eligible for vote");
        
        }
    }
}
    
