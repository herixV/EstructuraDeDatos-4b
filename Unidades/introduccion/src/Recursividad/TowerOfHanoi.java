package Recursividad;

public class TowerOfHanoi {

    private int totalDisks; // Total de discos

    public TowerOfHanoi(int totalDisks) {
        this.totalDisks = totalDisks;
    }

    public void solve() {
        moverTower(totalDisks, 1, 3, 2);
    }

    private void moverTower(int numDisks, int start, int end, int temp){
        // numDisks=totalDiscos, start=inicio=1; end=final=3; temp=intermedia=2
        if(numDisks==1){
            moveOneDisk(start, end);
        }else{
            //Toda la logica siguiente para mover el resto de discos
            moverTower(numDisks-1,start,temp,end);
            moveOneDisk(start, end);
            moverTower(numDisks-1,temp,end,start);
        }

    private void moveOneDisk(int start, int end ){
        System.out.println("move one disck from "+start+"to"+end);
    }
    }

}
