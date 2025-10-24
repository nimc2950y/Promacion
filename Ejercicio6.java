import java.util.Scanner;

public class Ejercicio6 {
    
    public static Scanner scanner = new Scanner(System.in);
    
    // Versión IMPERATIVA
    public static boolean validarEmailImperativo(String email) {
        if (email == null || email.isEmpty() || !email.contains("@") || !email.contains(".")) {
            return false;
        }

        int positionOfAt = 0;

        for(int i = 0; i < email.length(); i++) {
            if(email.charAt(i) == '@') {
                positionOfAt = i;
                break;
            }
        }

        if(positionOfAt == 0) {
            return false;
        }

        int positionOfDot = 0;

        for(int i = positionOfAt + 1; i < email.length(); i++) {
            if(email.charAt(i) == '.') {
                positionOfDot = i;
                break;
            }
        }

        if(positionOfDot == 0) {
            return false;
        }

        if(positionOfDot - positionOfAt <= 1) {
            return false;
        }
        
        return true;
    }
    
    // Versión DECLARATIVA
    public static boolean validarEmailDeclarativo(String email) {
        return email != null && email.matches(".+@.+\\..+");
    }
    
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 6: Validar Email ===\n");
        
        System.out.println("Ingrese un email: ");
        String email = scanner.nextLine();
        
        System.out.println("Imperativo: " + validarEmailImperativo(email));
        System.out.println("Declarativo: " + validarEmailDeclarativo(email));
    }
}

