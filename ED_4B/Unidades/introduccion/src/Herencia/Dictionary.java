package Herencia;

public class Dictionary extends Book {

    private int numDefs;

    public Dictionary(int numDefs,int numPages){
        super(numPages);
        this.numDefs=numDefs;
    }

    public void info(){
        System.out.println ("Number of Definitions:"+numDefs);
        System.out.println ("Number of Pages:"+numPages);
    }
    
}
