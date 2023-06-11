import java.util.Arrays;
import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo: ");
        int tamaño = scanner.nextInt();

        int[] arreglo = new int[tamaño];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < tamaño; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el nuevo elemento: ");
        int nuevoElemento = scanner.nextInt();

        System.out.print("Ingrese la posición donde desea insertar el elemento (entre 0 y " + (tamaño - 1) + "): ");
        int posición = scanner.nextInt();

        // Verificar si la posición es válida
        if (posición < 0 || posición >= tamaño) {
            System.out.println("La posición ingresada no es válida.");
        } else {
            // Crear un nuevo arreglo con espacio para el nuevo elemento
            int[] nuevoArreglo = new int[tamaño + 1];

            // Copiar los elementos antes de la posición
            System.arraycopy(arreglo, 0, nuevoArreglo, 0, posición);

            // Insertar el nuevo elemento
            nuevoArreglo[posición] = nuevoElemento;

            // Copiar los elementos después de la posición
            System.arraycopy(arreglo, posición, nuevoArreglo, posición + 1, tamaño - posición);

            System.out.println("El arreglo con el nuevo elemento es: " + Arrays.toString(nuevoArreglo));
        }
    }
}