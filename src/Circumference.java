import java.util.Scanner;
public class Circumference {
    public static void main(String[] args) {
        int a,b,c;
        double circum;
        double area;

        Scanner inp = new Scanner(System.in);
        System.out.print("1. kenar uzunluğunu giriniz: ");
        a=inp.nextInt();

        System.out.print("2. kenar uzunluğunu giriniz: ");
        b=inp.nextInt();

        System.out.print("3. kenar uzunluğunu giriniz: ");
        c=inp.nextInt();

        int u= (a+b+c)/2;

        circum=a+b+c;
        area=Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;


        System.out.println("çevre uzunluğu= "+ circum);
        System.out.println("alanı= "+ area);
    }
}
