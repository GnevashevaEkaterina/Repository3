import java.util.Scanner;

public class example12 {
    public static void main(String[] args){
        System.out.println("Ведите текст и число");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int n = scanner.nextInt();
        System.out.println(removeCharAt(str, n));


    }
    private static String removeCharAt(String str, int n) {
        return str.substring(0, n) + str.substring(n+1);
    }
}
