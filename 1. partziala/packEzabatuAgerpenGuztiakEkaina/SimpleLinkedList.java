package packEzabatuAgerpenGuztiakEkaina;

public class SimpleLinkedList<T> {

    Node<T> first;
    public void ezabatuGuztiak(T elem) {
        // Post: “elem” balioaren berdinak diren elementuak kendu dira zerrendatik
        Node<T> uneko= this.first;
        Node<T> aurr=null;
        while (uneko !=null){
            if (uneko.data.equals(elem)){
            //ezabatu nahi dugun elemtua bada
                //actualizamos punteros
                if (uneko==first){
                //lehenengo elemntua bada
                    first=first.next;
                }
                else{
                //ez bada zerrendako lehenengo elementua
                    aurr.next = uneko.next;
                }
            }
            else{
                //no coinciden y actualizamos punteros
                aurr=uneko;
            }
            uneko=uneko.next;//actualizamos punteros
        }
    }

    public static class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T elem){
            this.data = elem;
            this.next = null;
        }
    }
    public void imprimatuLista(String pLista){
        System.out.println("");
        System.out.println("Lista: "+pLista);
        System.out.println("-------------");
        Node<T> unekoa=  this.first;
        if (first==null){System.out.println("lista hutsa da");}
        while(unekoa!=null){
            System.out.println(unekoa.data );
            unekoa=unekoa.next;
        }

    }

    public static void main(String[] args) {
        /* PROBA KASUAK
         *   l        elem      ema
         *   ----------------------
         *   ()        5         ()         1.
         *   (5)       5         ()         2.
         *             6         (5)        3.
         *   (4 8 5)   6         (4 8 5)
         *             4         (8 5)
         *             8         (4 5)      4.
         *             5         (4 8)
        */
        SimpleLinkedList<Integer> l1 = new SimpleLinkedList<>();
        SimpleLinkedList<Integer> l2 = new SimpleLinkedList<>();
        SimpleLinkedList<Integer> l3 = new SimpleLinkedList<>();
        SimpleLinkedList<Integer> l4 = new SimpleLinkedList<>();

        Node<Integer> n1= new Node<>(5);

        Node<Integer> n2= new Node<>(4);
        Node<Integer> n3= new Node<>(8);
        Node<Integer> n4= new Node<>(5);

        Node<Integer> n5= new Node<>(5);
        Node<Integer> n6= new Node<>(5);
        Node<Integer> n7= new Node<>(5);

        l1.first=null;

        l2.first=n1;

        n2.next=n3;
        n3.next=n4;
        l3.first=n2;

        n5.next=n6;
        n6.next=n7;
        l4.first=n5;

        //1.
        l1.imprimatuLista("1. hasieran");
        l1.ezabatuGuztiak(5);
        l1.imprimatuLista("1. amaieran");

        //3
        l2.imprimatuLista("3. hasieran");
        l2.ezabatuGuztiak(6);
        l2.imprimatuLista("3. amaieran");

        //2.
        l2.imprimatuLista("2. hasieran");
        l2.ezabatuGuztiak(5);
        l2.imprimatuLista("2. amaieran");

        //4.
        l3.imprimatuLista("4. hasieran");
        l3.ezabatuGuztiak(8);
        l3.imprimatuLista("4. amaieran");




    }

}
