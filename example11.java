import java.util.Scanner;

public class example11 {
    public static void main(String[] args){
        System.out.println("Введите числа a и b (b>a)");
        Scanner scanner1 = new Scanner(System.in);
        int a = scanner1.nextInt();
        Scanner scanner2 = new Scanner(System.in);
        int b = scanner2.nextInt();
        int c;
        int s;
        s = b-a+1;
        c = (int)(Math.random()*s)+a;
        System.out.println(c);

    }
}
