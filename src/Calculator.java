import java.util.Scanner;

public class Calculator {
    private final Scanner sc = new Scanner(System.in);
    private double num1;
    private double num2;

    public Calculator() {
        System.out.println("Va a realizar una división básica entre dos números positivos.");
        calculate();
    }

    public void calculate() {
        setNumbersValue();
        System.out.println("El resultado de dividir" + num1 + " entre " + num2 + " = " +  num1/num2 );
    }

    private void setNumbersValue() {
        System.out.println("Ingrese el primer número:");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo número:");
        num2 = sc.nextDouble();
    }

}

