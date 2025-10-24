import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    // Versión IMPERATIVA
    public static String conservarDigitosImperativo(String texto) {

        List<Character> digitos = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');


        String resultado = "";
        
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (digitos.contains(c)) {
                resultado += c;
            }
        }
        
        return resultado;
    }
    
    // Versión DECLARATIVA
    public static String conservarDigitosDeclarativo(String texto) {
        return texto.replaceAll("[^0-9]", "");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 3: Conservar Solo Dígitos ===\n");
        
        System.out.println("Ingrese un texto: ");
        String texto = scanner.nextLine();
        
        System.out.println("Imperativo: \"" + conservarDigitosImperativo(texto) + "\"");
        System.out.println("Declarativo: \"" + conservarDigitosDeclarativo(texto) + "\"");
    }
}

