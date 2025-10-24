import java.util.Scanner;

public class Ejercicio4 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    // Versión IMPERATIVA
    public static int contarDigitosImperativo(int numero) {
        if (numero == 0) {
            return 1;
        }
        
        int contador = 0;
        int temp = Math.abs(numero);
        
        while (temp > 0) {
            contador++;
            temp = temp / 10;
        }
        
        return contador;
    }
    
    // Versión DECLARATIVA
    public static long contarDigitosDeclarativo(int numero) {
        return String.valueOf(Math.abs(numero)).chars().count();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 4: Contar Dígitos ===\n");
        
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();
        
        System.out.println("Imperativo: " + contarDigitosImperativo(numero));
        System.out.println("Declarativo: " + contarDigitosDeclarativo(numero));
    }
}

