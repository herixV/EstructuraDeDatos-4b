package Interfaz;

public class Sumar implements Interfaz {
    private int resultado; 

    public void sumar(int a, int b){
        resultado=a+b;
    }

    public int resultado(){
        return resultado;
    }
    
}
