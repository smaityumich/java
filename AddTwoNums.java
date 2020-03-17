import java.util.Scanner;

public class AddTwoNums{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Give two numbers: ");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        scan.close();
        float c = a+b;
        System.out.println("The two number adds to "+c);
    }
}