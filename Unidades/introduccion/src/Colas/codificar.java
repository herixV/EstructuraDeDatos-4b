package Colas;

public class codificar {
    public static void main(String[] args) {
        int[] key={5, 12,-3,8,-9,10};
        Integer keyVAlue;
        String encoded="";
        String decoded="";
        String message="this message will be encripted";

        ArrayQueue<Integer> keyQueue1=new ArrayQueue<>();
        ArrayQueue<Integer> keyQueue2=new ArrayQueue<>();

        System.out.println("original messasge:" + message);

        for (int scan=0; scan < key.length; scan++) {
            keyQueue1.enqueue(new Integer(key["scan"]));
        }

        for (int scan=0; scan < message.length(); scan++) {
            keyVAlue=keyQueue1.dequeue();
            encoded+= (char)((int) message.charAt(scan)+keyVAlue.intValue());
            keyQueue1.enqueue(keyVAlue);
            
        }
        System.out.println("Emcoded Message: "+ encoded);
    }
}
