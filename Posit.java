import java.util.Scanner;
import java.util.InputMismatchException;

public class Posit{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(true){
            try{
            System.out.println("What's your number?: ");
            num = sc.nextInt();
            break;
           }catch(InputMismatchException e){
            System.out.print("Are you kidding me?");
            sc.nextLine();
           }
        }
        sc.close();
        if (num > 0){
            System.out.println("Your number is positive");
        }else if(num < 0){
            System.out.println("Your number is negative");
        }else{
            System.out.println("Your number is zero");
        }
    }
}
