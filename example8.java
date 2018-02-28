import java.util.Scanner;

public class example8 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        for (i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Число составное ");
                break;
            } else {
                System.out.println("Число  простое ");
                break;
            }

        }
    }
}