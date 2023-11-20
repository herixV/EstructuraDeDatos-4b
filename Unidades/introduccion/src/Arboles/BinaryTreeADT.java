package Arboles;

import java.util.Iterator;

public interface BinaryTreeADT <T> {
    public void removeLeftSubtree(); 
    public void removeRightSubtree();
    public void removeAllElement();
    public boolean isEmpty();
    public int Size();      
    public boolean Contains();       
    public T Find();         
    public String toString();
    public Iterator<T> iteratorInOrder(); //arbol
    public Iterator<T> iteratorPreOrder(); //descendente
    public Iterator<T> IteratorPostOrder(); //ascendente
    public Iterator<T> iteratorLevelOrder(); //niveles
}
