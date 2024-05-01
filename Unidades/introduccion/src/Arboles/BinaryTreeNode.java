package Arboles;

public class BinaryTreeNode <T>{
    protected T element;
    protected BinaryTreeNode <T> left, rigth;

    public BinaryTreeNode(T obj){
        element = obj;
        left = null;
        rigth = null;
    }

    public int numChildren(){
        int children=0;
        if(left!=null){
            children=1+left.numChildren();
        }
        if (rigth!=null){
            children=children+1+rigth.numChildren();
        }
        return children;
    }
}
