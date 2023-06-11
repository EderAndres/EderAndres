import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una frase o palabra: ");
        String input = scanner.nextLine();
        scanner.close();
        
        String inputWithoutSpaces = input.replaceAll("\\s+", "").toLowerCase();
        
        if (isPalindrome(inputWithoutSpaces)) {
            System.out.println("La frase/palabra \"" + input + "\" es un palindromo.");
        } else {
            System.out.println("La frase/palabra \"" + input + "\" no es un palindromo.");
        }
        
        if (inputWithoutSpaces.length() > 0) {
            char firstChar = inputWithoutSpaces.charAt(0);
            System.out.println("La primera letra es: " + firstChar);
            
            if (inputWithoutSpaces.length() % 2 != 0) {
                int middleIndex = inputWithoutSpaces.length() / 2;
                char middleChar = inputWithoutSpaces.charAt(middleIndex);
                System.out.println("La letra de la mitad es: " + middleChar);
            }
        }
    }
    
    private static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }
}