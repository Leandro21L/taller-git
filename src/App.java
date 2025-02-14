import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int a = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int b = scanner.nextInt();
        System.out.println("La suma de los numeros es: " + sum(a, b));
        System.out.println("La resta de los numeros es: " + subtract(a, b));
        System.out.println("El producto de los numeros es: " + multiplication(a, b));
        System.out.println("la division de los numeros es: " + division(a, b));
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return a * b;
    }

}
