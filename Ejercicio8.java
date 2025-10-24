import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    // Versión IMPERATIVA
    public static boolean sonIdenticosImperativo(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
    
    // Versión DECLARATIVA
    public static boolean sonIdenticosDeclarativo(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 8: Comprobar Arrays Idénticos ===\n");
        
        System.out.println("¿Cuántos elementos tiene el primer array? ");
        int tam1 = scanner.nextInt();
        int[] array1 = new int[tam1];
        for (int i = 0; i < tam1; i++) {
            System.out.println("Elemento " + (i + 1) + " del primer array: ");
            array1[i] = scanner.nextInt();
        }
        
        System.out.println("\n¿Cuántos elementos tiene el segundo array? ");
        int tam2 = scanner.nextInt();
        int[] array2 = new int[tam2];
        for (int i = 0; i < tam2; i++) {
            System.out.println("Elemento " + (i + 1) + " del segundo array: ");
            array2[i] = scanner.nextInt();
        }
        
        System.out.println("\nArray 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));
        System.out.println("\nImperativo: " + sonIdenticosImperativo(array1, array2));
        System.out.println("Declarativo: " + sonIdenticosDeclarativo(array1, array2));
    }
}

