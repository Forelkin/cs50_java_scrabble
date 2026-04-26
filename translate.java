import java.util.Scanner;
import java.util.InputMismatchException;

public class translate{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int first = 0;
        int second = 0;

    while(true){
        try{
            System.out.printf("first int: ");
            first = reader.nextInt();
            reader.nextLine();
            break;
        } catch(InputMismatchException e){
            System.out.print("Man, I wanna int number, please, ");
            reader.nextLine(); 
        }
    }
    while(true){
        try{
            System.out.printf("second int: ");
            second = reader.nextInt();
            reader.nextLine(); 
            break;
        } catch(InputMismatchException e){
            System.out.print("Man, I wanna int number, please, ");
            reader.nextLine(); 
        }
    }
    System.out.printf("The sum for %d and %d is %d\n", first, second, (first + second));
    reader.close();
    }
}
