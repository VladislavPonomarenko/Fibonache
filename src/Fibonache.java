import java.util.Scanner;

/**
 * Created by Scarlet on 22.01.2017.
 */
public class Fibonache {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=scanner.nextInt();
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fibonache = 2, i = 2;
        while (i < number) {
            fibonache = a + b;
            a = b;
            b = fibonache;
            System.out.print(" " + fibonache);
            i++;
        }
    }
}
