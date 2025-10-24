import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio5 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    // Versión IMPERATIVA
    public static String unirPalabrasImperativo(List<String> palabras) {
        if (palabras == null || palabras.isEmpty()) {
            return "";
        }
        
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < palabras.size(); i++) {
            resultado.append(palabras.get(i));
            if (i < palabras.size() - 1) {
                resultado.append(", ");
            }
        }
        
        return resultado.toString();
    }
    
    // Versión DECLARATIVA
    public static String unirPalabrasDeclarativo(List<String> palabras) {
        return String.join(", ", palabras);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 5: Unir Lista de Palabras ===\n");
        
        System.out.println("¿Cuántas palabras desea ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        
        List<String> palabras = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la palabra " + (i + 1) + ": ");
            palabras.add(scanner.nextLine());
        }
        
        System.out.println("\nImperativo: \"" + unirPalabrasImperativo(palabras) + "\"");
        System.out.println("Declarativo: \"" + unirPalabrasDeclarativo(palabras) + "\"");
    }
}

