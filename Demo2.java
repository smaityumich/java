import java.util.Scanner;

public class Demo2 {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give a number: ");
        int num = scan.nextInt();
        scan.close();

        if (num > 0){
            System.out.println(num + " is a positive integer");
        }
        else if(num < 0){
            System.out.println(num+" is a negative number");
        }
        else{
            System.out.println(num + " is neither positive nor negative");
        }

    }
}