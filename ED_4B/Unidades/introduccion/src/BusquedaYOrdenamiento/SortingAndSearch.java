package BusquedaYOrdenamiento;

public class SortingAndSearch<T extends Comparable> {

    // Busqueda lineal
    public boolean linealSearch(T[] data, int min, int max, T target) {
        int index = min;
        boolean found = false;

        while (!found && index <= max) {
            if (data[index].compareTo(target) == 0) { // --0= son iguales
                found = true;
            }
            index++;
        }
        return found;
    }

    // Busqueda Binaria
    public boolean binarySearch(T[] data, int min, int max, T target) {
        // -1=cuando el valor es menor, 0=cuando el valor es igual , 1=cuando el valor
        // es mayor
        boolean found = false;
        int mindpoint = (min + max) / 2;
        if (data[mindpoint].compareTo(target) == 0) {
            found = true;
        } else if (data[mindpoint].compareTo(target) > 0) {
            if (min <= mindpoint - 1) {
                found = binarySearch(data, min, mindpoint - 1, target);
            }
        } else if (mindpoint + 1 <= max) {
            found = binarySearch(data, mindpoint + 1, max, target);
        }
        return found;
    }

    // Ordenamiento por selección
    public void selectionSort(T[] data) {
        int min;
        T temp;

        for (int index = 0; index < data.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }
            temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
    }

    // Ordenamiento por inserccion
    public void insertSort(T[] data) {
        for (int index = 1; index < data.length; index++) {
            T key = data[index];
            int position = index;
            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }
            data[position] = key;
        }
    }

    public void bubbleSort(T[] data) {
        int position, scan;
        T temp;
        for (position = data.length - 1; position >= 0; position--) {
            for (scan = 0; scan <= position - 1; scan++) {

                if (data[scan].compareTo(data[scan + 1]) > 0) {

                    // intercambio de valores
                    temp = data[scan];
                    data[scan] = data[scan + 1];
                    data[scan + 1] = temp;
                }
            }
        }
    }

} // clase
