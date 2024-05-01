package Arboles;

public class Main {
    public static void main(String[] args) {
        BinaryTreeNode<String> a=new BinaryTreeNode("Luan");
        BinaryTreeNode<String> b=new BinaryTreeNode("Maria");
        BinaryTreeNode<String> c=new BinaryTreeNode("Luis");
        BinaryTreeNode<String> d=new BinaryTreeNode("Leo");

        a.left=b;
        a.rigth=c;
        b.left=d;

        System.out.println(a.numChildren());

        Memoria m = new Memoria();
        m.ejecutar("perro");

        System.out.println(a.numChildren());
    }
}
