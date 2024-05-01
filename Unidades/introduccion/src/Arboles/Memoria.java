package Arboles;

import java.util.Scanner;

public class Memoria {
    private BinaryTreeNode<String> raiz;
    private Scanner leer = new Scanner(System.in);

    public boolean si(String pregunsta){
        System.out.println(pregunsta);
        String resp=leer.nextLine();
        return "si".equals(resp.toLowerCase());
    }
    public void ejecutar(String firstAnimal){
        boolean bucle=true;
        raiz= new BinaryTreeNode<String>(firstAnimal);
        while (bucle) {
            if(!si("Estas pensando en un animal?")){
                break;
            }
            BinaryTreeNode<String> arbol=raiz;
            while (arbol.left!=null) {
                if(si(arbol.element + "?")){
                    arbol=arbol.left;
                } else {
                    arbol=arbol.rigth;
                }
            }
            String animal=arbol.element;
            if(si("Es un "+animal+"?")) {
                System.out.println("Adivine!!!");
                continue;
            }
            System.out.println("Que animal era?");
            String nuevo=leer.nextLine();
            System.out.println("Que diferencia a un "+ animal+" de un "+ nuevo+"?");
            String info=leer.nextLine();
            String indicator="si el animal fuera un "+animal+" este "+info+" ?";
            arbol.element=info;

            if(si(indicator)){
                arbol.left=new BinaryTreeNode<String>(animal);
                arbol.rigth=new BinaryTreeNode<String>(nuevo);
            } else {
                arbol.rigth=new BinaryTreeNode<String>(animal);
                arbol.left=new BinaryTreeNode<String>(nuevo);
            }
        }
    }
}
