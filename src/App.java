import java.util.Scanner;

public class App {

    private static Subtract subtract = new Subtract();

    public static void main(String[] args) {
        System.out.println("Esta sera una calculadora");
        menu();
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Suma");
                break;
            case 2:
                System.out.println("Resta");
                System.out.println("Ingrese el primer numero");
                int a = sc.nextInt();
                System.out.println("ingrese el segundo numero");
                int b = sc.nextInt();
                System.out.println("El resultado es: " + subtract.subtact_op(a, b));
                break;
            case 3:
                System.out.println("Multiplica");
                break;
            default:
                break;
        }
        sc.close();
    }
}