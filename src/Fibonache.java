import java.util.Scanner;

/**
 * Created by Scarlet on 22.01.2017.
 */
public class Fibonache {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=scanner.nextInt();

        long startTime = System.currentTimeMillis();
//        int n0 = 1, n1 = 1, n2;
//        System.out.print(n0+" "+n1+" ");
       /* for(int i = 2; i < number; i++){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");*/
        //1000000=5487
        int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fibonache = 2, i = 2;
        do{ fibonache = a + b;
            a = b;
            b = fibonache;
            System.out.print(" " + fibonache);
            i++;}while (i<number);
        System.out.println();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
        //100000=5514

      /*  int a = 1, b = 1;
        System.out.print(a + " " + b);
        int fibonache = 2, i = 2;
        while (i < number) {
            fibonache = a + b;
            a = b;
            b = fibonache;
            System.out.print(" " + fibonache);
            i++;
        }
        System.out.println();
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("программа выполнялась " + timeSpent + " миллисекунд");
        //1000000=4976*/
    }
}
