import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ejercicio10 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    // Versión IMPERATIVA
    public static void ordenarListaImperativo(List<String> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - i - 1; j++) {
                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {
                    String temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }
    
    // Versión DECLARATIVA
    public static List<String> ordenarListaDeclarativo(List<String> lista) {
        return lista.stream()
                .sorted()
                .collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 10: Ordenar Lista ===\n");
        
        System.out.println("¿Cuántas palabras desea ingresar? ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();
        
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese la palabra " + (i + 1) + ": ");
            String palabra = scanner.nextLine();
            lista1.add(palabra);
            lista2.add(palabra);
        }
        
        System.out.println("\n--- Imperativo ---");
        System.out.println("Antes: " + lista1);
        ordenarListaImperativo(lista1);
        System.out.println("Después: " + lista1);
        
        System.out.println("\n--- Declarativo ---");
        System.out.println("Antes: " + lista2);
        List<String> resultado = ordenarListaDeclarativo(lista2);
        System.out.println("Después: " + resultado);
    }
}

