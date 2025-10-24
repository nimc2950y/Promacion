import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    // Versión IMPERATIVA
    public static String contarNoVocalesImperativo(String texto) {

        List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        
        String respuesta = "";
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!vocales.contains(c)) {
                respuesta += c;
            }
        }
        
        return respuesta;
    }
    
    // Versión DECLARATIVA
    public static String contarNoVocalesDeclarativo(String texto) {
        List<Character> vocales = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (!vocales.contains(c)) {
                resultado.append(c);
            }
        }
        
        return resultado.toString();
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 2: Contar No Vocales ===\n");
        
        System.out.println("Ingrese un texto: ");
        String texto = scanner.nextLine();
        
        System.out.println("Imperativo: " + contarNoVocalesImperativo(texto));
        System.out.println("Declarativo: " + contarNoVocalesDeclarativo(texto));
    }
}

