package BusquedaYOrdenamiento;

public class SortingAndSearch <T extends Comparable> {

    // Busqueda lineal 
    public boolean linealSearch(T[] data, int min, int max, T target){
        int index=min;
        boolean found=false;
    
        while (!found && index<=max){
            if(data[index].compareTo(target)==0){
                found=true;
            }
            index++;
        }
        return found;
    }
}
