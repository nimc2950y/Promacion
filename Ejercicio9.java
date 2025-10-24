import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    // Versión IMPERATIVA
    public static void llenarArrayImperativo(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = "REEMPLAZADO";
        }
    }
    
    // Versión DECLARATIVA
    public static void llenarArrayDeclarativo(String[] array) {
        Arrays.fill(array, "REEMPLAZADO");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 9: Llenar Array con Valor ===\n");
        
        System.out.println("¿Cuántos elementos tiene el array? ");
        int tam = scanner.nextInt();
        scanner.nextLine();
        
        String[] array1 = new String[tam];
        String[] array2 = new String[tam];
        
        for (int i = 0; i < tam; i++) {
            System.out.println("Ingrese el elemento " + (i + 1) + ": ");
            String elemento = scanner.nextLine();
            array1[i] = elemento;
            array2[i] = elemento;
        }
        
        System.out.println("\n--- Imperativo ---");
        System.out.println("Antes: " + Arrays.toString(array1));
        llenarArrayImperativo(array1);
        System.out.println("Después: " + Arrays.toString(array1));
        
        System.out.println("\n--- Declarativo ---");
        System.out.println("Antes: " + Arrays.toString(array2));
        llenarArrayDeclarativo(array2);
        System.out.println("Después: " + Arrays.toString(array2));
    }
}

