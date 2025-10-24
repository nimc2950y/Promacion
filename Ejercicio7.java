import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio7 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    // Versión IMPERATIVA
    public static int encontrarMaximoImperativo(List<Integer> numeros) {
        int maximo = numeros.get(0);
        
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > maximo) {
                maximo = numeros.get(i);
            }
        }
        
        return maximo;
    }
    
    // Versión DECLARATIVA
    public static int encontrarMaximoDeclarativo(List<Integer> numeros) {
        return numeros.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 7: Encontrar Máximo ===\n");
        
        System.out.println("¿Cuántos números desea ingresar? ");
        int cantidad = scanner.nextInt();
        
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el número " + (i + 1) + ": ");
            numeros.add(scanner.nextInt());
        }
        
        System.out.println("\nImperativo: " + encontrarMaximoImperativo(numeros));
        System.out.println("Declarativo: " + encontrarMaximoDeclarativo(numeros));
    }
}

