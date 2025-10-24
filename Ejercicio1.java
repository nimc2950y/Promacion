import java.util.Scanner;

public class Ejercicio1 {

    public static Scanner scanner = new Scanner(System.in);


    // Versión IMPERATIVA
    public static String enteroABinarioImperativo(int n) {
        if (n == 0) {
            return "0";
        }
        
        StringBuilder resultado = new StringBuilder();
        int temp = n;
        
        while (temp > 0) {
            resultado.insert(0, temp % 2);
            temp = temp / 2;
        }
        
        return resultado.toString();
    }
    
    // Versión DECLARATIVA
    public static String enteroABinarioDeclarativo(int n) {
        return Integer.toBinaryString(n);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1: Entero a Binario ===\n");

        System.out.println("Ingrese un número entero: ");
        int n = scanner.nextInt();
        
        System.out.println("El número en binario es: " + enteroABinarioImperativo(n));
        System.out.println("El número en binario es: " + enteroABinarioDeclarativo(n));
    }
}

