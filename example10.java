import java.util.Scanner;

public class example10 {
    public static void main(String[] args){
        System.out.println("Введите количество членов последовательности Фибоначчи");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d=0, a=1,b=1,c=0;
        System.out.print(d+" "+a+" "+b+" ");
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
