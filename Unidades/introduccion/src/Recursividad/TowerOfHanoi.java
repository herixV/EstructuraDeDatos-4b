package Recursividad;

public class TowerOfHanoi {

    public TowerOfHanoi(int totalDisks){
        this.totalDisks = totalDisks;
    }

    private int totalDisks; //total de discos

    public void solve(){
        moverTower(totalDisks, 1, 3, 2);
    }

    private void moverTower(int numDisks, int start, int end, int temp){
        //numDisks = totalDiscos; start=inicio=1; end=fina=3; temp=intermedia=2
        if (numDisks == 1){
            moveOneDisk(start, end);
        } else {
            //toda la lógica para mover el resto de discos 
            moverTower(numDisks-1, start, temp, end);           //mover los n-1 discos superiores a la varilla intermedia
            moveOneDisk(start, end);                           //mover el disco inferior a la varilla final
            moverTower(numDisks-1, temp, end, start);           //mover los n-1 discos de la varilla intermedia a la varilla final
        }
    }

    private void moveOneDisk(int start, int end){
        System.out.println("move one disk " + start + " a " + end);
    }
}
