import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        System.out.println("ENTER THE THREE NUMBER");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
            System.out.println(" a + is the largest number");
        else if(b>a && b>c)
            System.out.println("b + is the largest number");
        else if(c>a && c>b)
            System.out.println("c+ is the largest number");
        else
            System.out.println("default number");



    }
}
