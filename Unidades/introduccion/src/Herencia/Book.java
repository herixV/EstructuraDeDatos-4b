package Herencia;

public class Book {
    protected int numPages;

    public Book (int numPages){
        this.numPages=numPages;
    }

    protected void page(){
        System.out.println("number of pages:"+numPages);
    }
    
}
