import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int b = scanner.nextInt();
        System.out.println("La suma de los numeros es: " + sum(a, b));
    }

    public static int sum(int a, int b) {
        return a+b;
    }
}
