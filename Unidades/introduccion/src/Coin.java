public class Coin {
   //final es para declarar constantes
    private final int HEADS=0;
    private final int TAILS=1;
    private int face; 

    public Coin() {
        this.flip();
    }

    public void flip() {
        this.face=(int) (Math.random()*2);
    }

    public boolean isHeads() {
        return (face==HEADS);
    }

    public String toString() {
        String FaceName;

        if (FaceName== 'HEADS'){
            FaceName = "Heads";
        }else{
            FaceName="Tails";
        }
        return FaceName;
    }
}