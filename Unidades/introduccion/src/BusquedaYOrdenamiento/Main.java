package BusquedaYOrdenamiento;

public class Main {
    public static void main(String[] args) {

        // 1. Busqueda Lineal
        Integer[] numeros = { 2, 5, 8, 6, 4, 3, 0, 9, 44, 25, 67, 11, 10, 34 };
        SortingAndSearch<Integer> s = new SortingAndSearch<>();
        System.out.println(s.linealSearch(numeros, 0, 7, 0));

        String[] nombres = { "Hugo", "Paco", "Leo", "Luis", "Maria" };
        SortingAndSearch<String> sn = new SortingAndSearch<>();
        System.out.println(sn.linealSearch(nombres, 0, 4, "Mateo"));

        Integer[] numeros2 = { 2, 3, 8, 16, 24, 31, 40, 49, 65, 78, 122 };
        SortingAndSearch<Integer> s2 = new SortingAndSearch<>();
        System.out.println("**Busqueda binaria");
        System.out.println(s2.binarySearch(numeros2, 0, numeros2.length - 1, 49));

        // Ordenación por selección
        System.out.println("**Ordenación por selección");
        s.selectionSort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Ordenación por inserción
        System.out.println("**Ordenación por inserción");
        s.insertSort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Ordenación por metodo burbuja
        System.out.println("**Ordenación por metodo burbuja");
        s.bubbleSort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }

}
